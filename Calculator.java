import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.println("**********************");
        System.out.println("*                    *");
        System.out.println("*    CALCULADORA     *");
        System.out.println("*                    *");
        System.out.println("**********************");

        Operation operation = new Operation();
        System.out.println("\nBem vindo á calculadora Java!");
        System.out.println("Operações disponiveis.\n");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Porcentagem");
        System.out.println("\nPara escolher uma operação basta digitar o numero.");
        System.out.print("\nEscolha uma das operação acima:");

        int escolha = ler.nextInt();

        System.out.println();

        System.out.print("Digite o primeiro valor: ");
        double valor1 = ler.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = ler.nextDouble();

        double resultado = 0.0;

        try { // oque estiver dentro do try é o codigo que pode dar erro, que no casso é a divisão por zero 
            switch (escolha) {
                case 1:
                    resultado = operation.calculoSoma(valor1, valor2);
                    System.out.printf("O resultado da Soma é: %.2f%n", resultado);
                    break;
                case 2:
                    resultado = operation.calculoSubtracao(valor1, valor2);
                    System.out.printf("O resultado da Subtração é: %.2f%n", resultado);
                    break;
                case 3:
                    resultado = operation.calculoMultiplicacao(valor1, valor2);
                    System.out.printf("O resultado da Multiplicação é: %.2f%n", resultado);
                    break;
            case 4:
                    resultado = operation.calculoDivisao(valor1, valor2);
                    System.out.printf("O resultado da Divisão é: %.2f%n" , resultado);
                    break;
                case 5:
                    resultado = operation.calculoPorcentagem(valor1, valor2);
                    System.out.printf("O valor da Porcentagem é: %.2f%n", resultado);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    ler.close();
                    return; // Esse return serve para sair do programa.
            }
        } catch (IllegalArgumentException e) { // aqui e oque será feito quando o erro é encontrado.
            System.out.println("Erro: " + e.getMessage()); // trata o erro da divisão por 0;
        }
        ler.close();
    }
}

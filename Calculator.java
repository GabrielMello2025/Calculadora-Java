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
        System.out.println("Operações disponiveis\n");
        System.out.println("0. sair");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Porcentagem");
        System.out.println("\nPara escolher uma operação basta digitar o numero.");
        System.out.print("\nEscolha uma das operação acima:");
        int escolha = ler.nextInt();
        System.out.println();
        System.out.println("Digite os valores a serem calculados: ");
        double valor1 = ler.nextDouble();
        double valor2 = ler.nextDouble();

        System.out.println("A operação escolhida foi: " +operation.somaEscolhida(escolha)+"." );
        System.out.printf("E os valores foram: %.2f e %.2f." , valor1, valor2 );
        
        System.out.println();





        ler.close();
    }
}

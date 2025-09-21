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

        Operation operation = new Operation(); // Cria um objeto da class Operation 
        System.out.println("\nBem vindo!");
        System.out.println("Escolha a operação");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        
    }
}

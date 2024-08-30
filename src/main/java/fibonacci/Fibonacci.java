package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = -1;
        while (numero < 0) {
            System.out.print("Digite um número não negativo para verificar se pertence à sequência de Fibonacci: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero < 0) {
                    System.out.println("Por favor, insira um número não negativo.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next();
            }
        }

        scanner.close();

        boolean pertence = pertenceFibonacci(numero);

        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de fibonacci.Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de fibonacci.Fibonacci.");
        }
    }

    public static boolean pertenceFibonacci(int n) {
        if (n < 0) return false;

        int a = 0, b = 1;

        if (n == a || n == b) return true;

        while (b <= n) {
            int proximo = a + b;
            a = b;
            b = proximo;

            if (b == n) return true;
        }

        return false;
    }
}

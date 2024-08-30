package contarLetraA;

import java.util.Scanner;

public class ContarLetraA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        scanner.close();

        if (input == null || input.isEmpty()) {
            System.out.println("A string fornecida está vazia ou é nula.");
            return;
        }

        long count = input.chars()
                .map(Character::toLowerCase)
                .filter(c -> c == 'a')
                .count();

        if (count > 0) {
            System.out.println("A letra 'a' (ou 'A') ocorre " + count + " vezes.");
        } else {
            System.out.println("Não contém a letra 'a' (ou 'A') na string.");
        }
    }
}

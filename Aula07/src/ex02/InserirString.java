package ex02;

import java.util.Scanner;

public class InserirString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a string original: ");
        String stringOriginal = scanner.nextLine();

        System.out.print("Digite a string a ser inserida: ");
        String stringInserir = scanner.nextLine();

        System.out.print("Digite a posição onde a string deve ser inserida: ");
        int posicao = scanner.nextInt();

        if (posicao < 0 || posicao > stringOriginal.length()) {
            System.out.println("Posição inválida. Deve ser entre 0 e " + stringOriginal.length());
        } else {
            StringBuilder sb = new StringBuilder(stringOriginal);
            sb.insert(posicao, stringInserir);

            System.out.println("String resultante: " + sb.toString());
        }

        scanner.close();
    }
}


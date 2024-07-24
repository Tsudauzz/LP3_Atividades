package ex01;

import java.util.Scanner;

public class EncontrarPrimeiraOcorrencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        System.out.print("Digite o caractere a ser pesquisado: ");
        char caractere = scanner.nextLine().charAt(0);

        int posicao = encontrarPrimeiraOcorrencia(entrada, caractere);

        if (posicao != -1) {
            System.out.println("O caractere '" + caractere + "' ocorre pela primeira vez na posição: " + posicao);
        } else {
            System.out.println("O caractere '" + caractere + "' não foi encontrado na string.");
        }

        scanner.close();
    }

    public static int encontrarPrimeiraOcorrencia(String str, char c) {
        return str.indexOf(c);
    }
}


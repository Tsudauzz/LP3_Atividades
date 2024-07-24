package ex02;

import java.util.Scanner;

public class ConstrucaoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas palavras você deseja inserir? ");
        int numPalavras = scanner.nextInt();
        scanner.nextLine(); 

        String[] palavras = new String[numPalavras];
        
        for (int i = 0; i < numPalavras; i++) {
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            palavras[i] = scanner.nextLine();
        }

        scanner.close();
        
        StringBuilder sb = new StringBuilder();
        for (String palavra : palavras) {
            sb.append(palavra).append(" ");
        }

        System.out.println("Construção da Strinng: " + sb.toString());

    }
}

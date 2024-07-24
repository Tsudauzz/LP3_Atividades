package ex02;

import java.util.Scanner;

public class TirarVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        String stringSemVogais = removerVogais(entrada);

        System.out.println("String sem vogais: " + stringSemVogais);

        scanner.close();
    }

    public static String removerVogais(String str) {
        StringBuilder sb = new StringBuilder();
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (vogais.indexOf(c) == -1) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}

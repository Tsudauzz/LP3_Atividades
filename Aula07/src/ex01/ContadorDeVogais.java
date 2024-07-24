package ex01;

import java.util.Scanner;

public class ContadorDeVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        int numeroDeVogais = contarVogais(entrada);

        System.out.println("Número de vogais: " + numeroDeVogais);

        scanner.close();
    }

    public static int contarVogais(String str) {
        int contador = 0;
        String vogais = "aeiouAEIOU";
        
        for (int i = 0; i < str.length(); i++) {
            if (vogais.indexOf(str.charAt(i)) != -1) {
                contador++;
            }
        }
        
        return contador;
    }
}

package ex04;

import java.util.Scanner;

public class SomaDeStringNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string de números separados por espaços: ");
        String numerosString = scanner.nextLine();

        int somaTotal = calcularSomaDeString(numerosString);
        System.out.println("Soma total: " + somaTotal);

        scanner.close();
    }

    public static int calcularSomaDeString(String numerosString) {
        String[] numerosArray = numerosString.split(" ");
        int soma = 0;
        for (String numStr : numerosArray) {
            soma += Integer.parseInt(numStr);
        }
        return soma;
    }
}


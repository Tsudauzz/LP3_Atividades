package ex03;

import java.util.Scanner;

public class MaiorValorArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            array[i] = scanner.nextInt();
        }

        int maiorValor = encontrarMaiorValor(array);

        System.out.println("O maior valor no array é: " + maiorValor);

        scanner.close();
    }

    public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }

        return maior;
    }
}

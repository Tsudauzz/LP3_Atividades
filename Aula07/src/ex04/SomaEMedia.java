package ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números inteiros deseja inserir? ");
        int quantidade = scanner.nextInt();

        List<Integer> listaInteiros = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            listaInteiros.add(scanner.nextInt());
        }

        int soma = calcularSoma(listaInteiros);
        double media = calcularMedia(listaInteiros);

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        scanner.close();
    }

    public static int calcularSoma(List<Integer> listaInteiros) {
        int soma = 0;
        for (int num : listaInteiros) {
            soma += num;
        }
        return soma;
    }

    public static double calcularMedia(List<Integer> listaInteiros) {
        int soma = calcularSoma(listaInteiros);
        return (double) soma / listaInteiros.size();
    }
}

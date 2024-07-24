package ex06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarInteiros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        Collections.sort(numeros);
        System.out.println("Lista de números ordenados: " + numeros);

        scanner.close();
    }
}

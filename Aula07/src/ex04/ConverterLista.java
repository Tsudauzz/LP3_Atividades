package ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConverterLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas strings deseja converter para inteiros? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 

        List<String> listaStrings = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a string " + (i + 1) + ": ");
            listaStrings.add(scanner.nextLine());
        }

        List<Integer> listaInteiros = converterParaInteiros(listaStrings);
        System.out.println("Lista de inteiros: " + listaInteiros);

        scanner.close();
    }

    public static List<Integer> converterParaInteiros(List<String> listaStrings) {
        List<Integer> listaInteiros = new ArrayList<>();
        for (String s : listaStrings) {
            listaInteiros.add(Integer.parseInt(s));
        }
        return listaInteiros;
    }
}

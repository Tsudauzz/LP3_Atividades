package ex07;

import java.util.HashMap;
import java.util.Scanner;

public class FrequenciaPalavras {
    public static void main(String[] args) {
        HashMap<String, Integer> frequencias = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto:");
        String texto = scanner.nextLine();
        String[] palavras = texto.split("\\s+"); 

        for (String palavra : palavras) {
            palavra = palavra.toLowerCase().replaceAll("[^a-zA-Z]", "");  
            if (!palavra.isEmpty()) {
                frequencias.put(palavra, frequencias.getOrDefault(palavra, 0) + 1);
            }
        }

        System.out.println("Frequência das palavras:");
        for (String palavra : frequencias.keySet()) {
            System.out.println(palavra + ": " + frequencias.get(palavra));
        }

        scanner.close();
    }
}

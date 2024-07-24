package ex08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravarArray {
    public static void main(String[] args) {
        String[] linhas = {"Linha 1", "Linha 2", "Linha 3"};
        String nomeArquivo = "array.txt";
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (String linha : linhas) {
                writer.write(linha);
                writer.newLine();
            }
            System.out.println("Array gravado no arquivo com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

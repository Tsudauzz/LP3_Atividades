package ex08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravarArray {
    public static void main(String[] args) {
        String[] linhas = {"Linha 1", "Linha 2", "Linha 3"};  // Array de strings a ser gravado
        String nomeArquivo = "array.txt";  // Nome do arquivo a ser criado
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (String linha : linhas) {
                writer.write(linha);
                writer.newLine();  // Adicionar nova linha após cada string
            }
            System.out.println("Array gravado no arquivo com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

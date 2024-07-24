package ex08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    public static void main(String[] args) {
        String nomeArquivo = "exemplo.txt";  // Nome do arquivo a ser lido
        
        // Verificar se o arquivo realmente existe
        java.io.File arquivo = new java.io.File(nomeArquivo);
        if (!arquivo.exists()) {
            System.out.println("Arquivo não encontrado: " + nomeArquivo);
            return;
        }
        
        // Tentar ler o arquivo
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
    }
}

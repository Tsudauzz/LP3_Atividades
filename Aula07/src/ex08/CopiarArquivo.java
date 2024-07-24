package ex08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarArquivo {
    public static void main(String[] args) {
        String arquivoOrigem = "ExemploOrigem.txt";
        String arquivoDestino = "ExemploDestino.txt"; 
        
        try (FileInputStream inputStream = new FileInputStream(arquivoOrigem);
             FileOutputStream outputStream = new FileOutputStream(arquivoDestino)) {
             
            byte[] buffer = new byte[1024];
            int bytesLidos;
            
            while ((bytesLidos = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesLidos);
            }
            
            System.out.println("Arquivo copiado com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

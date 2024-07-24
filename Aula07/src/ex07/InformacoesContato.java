package ex07;

import java.util.HashMap;
import java.util.Scanner;

public class InformacoesContato {
    public static void main(String[] args) {
        HashMap<String, String> contatos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar contato");
            System.out.println("3. Listar contatos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String telefone = scanner.nextLine();
                    contatos.put(nome, telefone);
                    System.out.println("Contato adicionado.");
                    break;
                case 2:
                    System.out.print("Digite o nome do contato a buscar: ");
                    nome = scanner.nextLine();
                    if (contatos.containsKey(nome)) {
                        System.out.println("Telefone de " + nome + ": " + contatos.get(nome));
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de contatos:");
                    for (String contato : contatos.keySet()) {
                        System.out.println(contato + ": " + contatos.get(contato));
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}

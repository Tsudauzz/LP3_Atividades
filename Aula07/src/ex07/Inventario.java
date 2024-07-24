package ex07;

import java.util.HashMap;
import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {
        HashMap<String, Integer> inventario = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Buscar produto");
            System.out.println("4. Listar produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();  
                    inventario.put(nomeProduto, quantidade);
                    System.out.println("Produto adicionado.");
                    break;
                case 2:
                    System.out.print("Digite o nome do produto a remover: ");
                    nomeProduto = scanner.nextLine();
                    if (inventario.containsKey(nomeProduto)) {
                        inventario.remove(nomeProduto);
                        System.out.println("Produto removido.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do produto a buscar: ");
                    nomeProduto = scanner.nextLine();
                    if (inventario.containsKey(nomeProduto)) {
                        System.out.println("Quantidade de " + nomeProduto + ": " + inventario.get(nomeProduto));
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Inventário de produtos:");
                    for (String produto : inventario.keySet()) {
                        System.out.println(produto + ": " + inventario.get(produto));
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}

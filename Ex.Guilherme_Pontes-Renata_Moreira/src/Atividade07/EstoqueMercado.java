package Atividade07;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueMercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> estoque = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== MENU ESTOQUE ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Atualizar produto");
            System.out.println("3 - Remover produto");
            System.out.println("4 - Listar produtos");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next();
                System.out.print("Escolha uma opção: ");
            }

            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Código: ");
                    String codigo = scanner.nextLine();

                    
                    double preco = 0;
                    int quantidade = 0;

                    while (true) {
                        try {
                            System.out.print("Preço: ");
                            preco = Double.parseDouble(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Preço inválido. Digite um número.");
                        }
                    }

                    while (true) {
                        try {
                            System.out.print("Quantidade: ");
                            quantidade = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Quantidade inválida. Digite um número inteiro.");
                        }
                    }

                    Produto novo = new Produto(nome, codigo, preco, quantidade);
                    estoque.add(novo);
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o código do produto para atualizar: ");
                    String codigoAtualizar = scanner.nextLine();
                    boolean encontrado = false;

                    for (Produto p : estoque) {
                        if (p.getCodigo().equals(codigoAtualizar)) {
                            System.out.print("Nome novo: ");
                            p.setNome(scanner.nextLine());

                            
                            while (true) {
                                try {
                                    System.out.print("Preço novo: ");
                                    p.setPreco(Double.parseDouble(scanner.nextLine()));
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Preço inválido. Digite um número.");
                                }
                            }

                            while (true) {
                                try {
                                    System.out.print("Quantidade nova: ");
                                    p.setQuantidade(Integer.parseInt(scanner.nextLine()));
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Quantidade inválida. Digite um número inteiro.");
                                }
                            }

                            System.out.println("Produto atualizado com sucesso!");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o código do produto para remover: ");
                    String codigoRemover = scanner.nextLine();
                    boolean removido = estoque.removeIf(p -> p.getCodigo().equals(codigoRemover));
                    if (removido) {
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- ESTOQUE ATUAL ---");
                    double totalEstoque = 0;
                    for (Produto p : estoque) {
                        p.exibirinformacoes();
                        totalEstoque += p.getPreco() * p.getQuantidade();
                    }
                    System.out.printf("Valor total em estoque: R$ %.2f\n", totalEstoque);
                    break;

                case 5:
                    System.out.println("Sistema encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
package Atividade03;

import java.util.Scanner;

public class BancoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da sua conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular);

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Exibir dados da conta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            // Tratamento de entrada para garantir que seja um número inteiro
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next(); // Descarta a entrada inválida
                System.out.print("Escolha uma opção: ");
            }

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 0:
                    System.out.println("Até logo!");
                    break;
                case 1:
                    System.out.print("Valor para depositar: R$ ");
                    // Tratamento de entrada para garantir que seja um número double
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Entrada inválida. Digite um número.");
                        scanner.next();
                        System.out.print("Valor para depositar: R$ ");
                    }
                    double deposito = scanner.nextDouble();
                    scanner.nextLine();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Valor que deseja sacar: R$ ");
                    // Tratamento de entrada para garantir que seja um número double
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Entrada inválida. Digite um número.");
                        scanner.next();
                        System.out.print("Valor que deseja sacar: R$ ");
                    }
                    double saque = scanner.nextDouble();
                    scanner.nextLine();
                    conta.sacar(saque);
                    break;
                case 3:
                    System.out.printf("Saldo atual: R$ %.2f\n", conta.getSaldo());
                    break;
                case 4:
                    conta.exibirDados();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
package Atividade03;

public class ContaBancaria {
    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(String numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0.0) {
            this.saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.\n", valor);
        } else {
            System.out.println("Valor para depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0.0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.\n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void exibirDados() {
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Titular: " + this.nomeTitular);
        System.out.printf("Saldo atual: R$ %.2f\n", this.saldo);
    }
}
package Atividade07;

public class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, String codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirinformacoes() {
        System.out.printf("Código: %s | Nome: %s | Preço: R$ %.2f | Quantidade: %d\n", codigo, nome, preco, quantidade);
    }

    public double valorTotal() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return String.format("Produto{codigo='%s', nome='%s', preco=%.2f, quantidade=%d}", codigo, nome, preco, quantidade);
    }
}
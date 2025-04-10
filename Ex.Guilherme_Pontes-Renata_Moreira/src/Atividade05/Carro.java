package Atividade05;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int incremento) {
        velocidadeAtual += incremento;
        System.out.println("Carro acelerou. Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void frear(int decremento) {
        if (velocidadeAtual - decremento < 0) {
            velocidadeAtual = 0;
        } else {
            velocidadeAtual -= decremento;
        }
        System.out.println("Carro freou. Velocidade atual: " + velocidadeAtual + "km/h");
    }

    public void exibirinformacoes() {
        System.out.println("\n--- Informações do carro ---");
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("velocidadeAtual: " + velocidadeAtual + "km/h");
    }
}

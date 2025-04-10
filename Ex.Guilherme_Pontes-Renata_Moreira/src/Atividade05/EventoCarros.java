package Atividade05;

import java.util.Scanner;

public class EventoCarros {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        Carro carro1 = new Carro(marca, modelo, ano, placa);

        carro1.exibirinformacoes();

        System.out.print("\nQuanto deseja acelerar! ");
        int freio = scanner.nextInt();
        carro1.frear(freio);

        carro1.exibirinformacoes();

        scanner.close();
        
    }

}

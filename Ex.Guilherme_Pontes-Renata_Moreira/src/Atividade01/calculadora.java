package Atividade01;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.printf("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite uma operação (+, -, /, *): ");
        String operacao = scanner.next();

        Double resultado = calcular(valor1, valor2, operacao);

        if (resultado != null) {
            System.out.print("Resultado: " + resultado);

        }
        scanner.close();
    }

    public static Double calcular(double valor1, double valor2, String operacao){
        switch(operacao){
            case "+":
            return somar(valor1, valor2);

            case "-":
                return subtrair(valor1,  valor2);

            case "*":
                return multiplicar(valor1, valor2);

            case "/":
                return dividir(valor1, valor2);
            default:
                System.out.print("Operação invalida: ");
                return null;
        }
    }
    public static double somar(double valor1, double valor2){
        return valor1 + valor2;
    }

    public static double subtrair(double valor1,  double valor2){
        return valor1 - valor2;
    }

    public static double multiplicar(double valor1,double valor2){
        return valor1 * valor2;
    }

    public static Double dividir(double valor1, double valor2){
        if (valor2 == 0){
            System.out.println("Erro: Não foi possivel dividir por zero: ");
            return null;
        }
        return valor1 / valor2;
    }
}

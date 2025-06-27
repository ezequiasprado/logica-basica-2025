package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int quantidadeClienteCompraMaiorCem = 0;
        double somaCompra = 0;

        while (contador < 10){
            System.out.println("Digite o valor da compra em reais");
            double valorCompra = scanner.nextDouble();
            if(valorCompra > 100){
                quantidadeClienteCompraMaiorCem++;
            }
            somaCompra = somaCompra + valorCompra;
            contador++;
        }
        double media = somaCompra / contador;
        System.out.println("A média é: " + media);
        System.out.println("Quantidade de clientes que compraram mais que 100" +
                quantidadeClienteCompraMaiorCem);
    }
}

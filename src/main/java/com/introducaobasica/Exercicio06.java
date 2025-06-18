package main.java.com.introducaobasica;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço de compra");
        double precoCompra = scanner.nextDouble();
        System.out.println("Digite o preço de venda");
        double precoVenda = scanner.nextDouble();

        double lucro = precoVenda - precoCompra;

        System.out.println("O lucro do produto: " + nome + " é : " + lucro);

    }
}

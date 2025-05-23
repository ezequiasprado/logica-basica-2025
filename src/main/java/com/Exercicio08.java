package main.java.com;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int segundoNumero = scanner.nextInt();
        System.out.println("Digite o terceiro número");
        int terceiroNumero = scanner.nextInt();

        int soma = primeiroNumero + segundoNumero + terceiroNumero;
        double media = soma / 3;
        System.out.println("A media é: " + media);
    }
}

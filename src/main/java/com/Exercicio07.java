package main.java.com;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int segundoNumero = scanner.nextInt();

        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        double divisao = primeiroNumero / (double)segundoNumero;

        System.out.println("Soma: " + soma + " Subtração: " + subtracao
        + " Multiplicação: " + multiplicacao + " Divisão: " + divisao);
    }
}

package main.java.com.avaliacaoobjetiva;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 3 ; i++) {
            System.out.println("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }
        double media = soma/3;
        System.out.println("A média é " + media);
    }
}

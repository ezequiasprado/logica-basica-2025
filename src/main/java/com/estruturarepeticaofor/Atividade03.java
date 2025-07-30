package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade:");
        int quantidade = scanner.nextInt();
        int soma = 0;

        for (int i = 1; i <= quantidade ; i++) {
            System.out.println("Digite o número");
            int numero = scanner.nextInt();
            soma = soma + numero;
        }

        System.out.println("A soma é: " + soma);
    }
}

package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade14Simplificado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int valorA = scanner.nextInt();
        System.out.println("Digite o valor de B:");
        int valorB = scanner.nextInt();
        int soma = 1;

        while (valorB --> 0) soma *= valorA;
        System.out.println("A exponenciação de A por B é: " + soma);
    }
}

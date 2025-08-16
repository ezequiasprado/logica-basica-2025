package main.java.com.avaliacaoobjetiva;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = 0;
        int numero = 0;
        while (numero >= 0) {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                quantidade++;
            }
        }
        System.out.println("Quantidade digitada: " + quantidade);
    }
}

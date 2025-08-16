package main.java.com.avaliacaoobjetiva;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[5];


        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i+1) + ": ");
            int numero = scanner.nextInt();
            notas[i] = numero;
        }

        System.out.println("Notas na Ordem digitada:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();
        System.out.println("Notas na ordem inversa");
        for (int i = notas.length - 1; i >=0 ; i--) {
            System.out.print(notas[i] + " ");
        }


    }
}

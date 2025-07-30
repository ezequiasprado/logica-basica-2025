package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        /*for (int i = numero; i >= 1 ; i--) {
            System.out.println(i);
        }*/
        for (int i = 0; i < numero ; i++) {
            System.out.println(numero - i);
        }
    }
}

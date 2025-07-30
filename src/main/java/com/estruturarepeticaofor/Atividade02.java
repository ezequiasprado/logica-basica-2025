package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero + " X " + i + " = " +(i * numero));
        }
    }
}

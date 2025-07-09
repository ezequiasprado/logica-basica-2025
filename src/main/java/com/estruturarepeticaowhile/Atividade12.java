package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numeroX = scanner.nextInt();
        int valorY = 0;
        int contador = 1;

        while (contador <= 20) {
            valorY = valorY + (contador * numeroX);
            contador++;
        }
        System.out.println("O valor de Y é: " + valorY);
    }
}

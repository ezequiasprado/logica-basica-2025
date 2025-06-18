package main.java.com.introducaobasica;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        double numero = scanner.nextDouble();

        System.out.println("O quadrado é:");
        System.out.println(numero * numero);
    }
}

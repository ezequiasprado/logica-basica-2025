package main.java.com.avaliacaoobjetiva;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPares = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0){
                contadorPares++;
            }
        }
        System.out.println("QTD Pares: " + contadorPares);
    }
}

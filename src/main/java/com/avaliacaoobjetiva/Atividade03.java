package main.java.com.avaliacaoobjetiva;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        int fatorial = 1;
        int contador = 1;
        while (contador <= numero){
            fatorial = fatorial * contador;
            contador++;
        }
        System.out.println("Fatorial: " + fatorial);
    }
}

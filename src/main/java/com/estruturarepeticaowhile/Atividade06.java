package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();
        int contador = 1;
        if (numero > 0){
            System.out.println("Não é permitido número negativo");
            return;
        }
        while (contador <= 10) {
            System.out.println(numero + contador);
            contador++;
        }
    }
}

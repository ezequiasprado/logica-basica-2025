package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0;
         int negativos = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero");
            int numero = scanner.nextInt();
            if (numero > 0){
                positivos++;
            } else {
                negativos++;
            }
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
}

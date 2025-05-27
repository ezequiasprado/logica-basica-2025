package main.java.com;

import java.util.Scanner;

public class Teste {
    final static int INFANTIL = 7; //infantil
    final static int JUVENIL = 12; //juvenil

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int idade = scanner.nextInt();

        if (idade <= INFANTIL) {
            System.out.println("infantil");
        } else if (idade <= JUVENIL) {
            System.out.println("Juvenil");
        }else{
            System.out.println("Faixa não informada");
        }

    }
}

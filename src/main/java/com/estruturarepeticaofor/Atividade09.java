package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "Digite um nome:";
        System.out.println(frase);
        String nome = scanner.next();
        for (int i = 0; i < 3; i++) {
            System.out.println(frase.split(" ")[i]);
        }

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.split("")[i]);
            //System.out.println(nome.charAt(i));
        }
    }
}

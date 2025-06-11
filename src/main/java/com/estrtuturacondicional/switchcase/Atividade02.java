package main.java.com.estrtuturacondicional.switchcase;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int n2 = scanner.nextInt();
        System.out.println("Digite A para adição, S para subtração");
        System.out.println("M para multiplicação e D divisão");
        String opcao = scanner.next();

        switch (opcao) {
            case "A" :
                System.out.println("Soma: " + n1 + n2);
                break;
            case "S" :
                System.out.println("Subtração: " + (n1 - n2));
                break;
            case "M" :
                System.out.println("Multiplicação: " + (n1 * n2));
                break;
            case "D" :
                System.out.println("Divisão: " + (n1 / n2));
                break;
        }
    }
}

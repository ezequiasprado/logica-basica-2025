package main.java.com;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        int segundoNumero = scanner.nextInt();

        int quociente = primeiroNumero / segundoNumero;
        int resto = primeiroNumero % segundoNumero;

        System.out.println("O Quociente é: " + quociente);
        System.out.println("O Resto é: " + resto);
    }
}

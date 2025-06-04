package main.java.com.estrtuturacondicional;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro número");
        int numero3 = scanner.nextInt();

        int maior = 0;

        if ((numero1 == numero2) || (numero1 == numero3) || (numero2 == numero3)) {
            System.out.println("Não é permitido números iguais");
        } else {
            if ((numero1 > numero2) && (numero1 > numero3)){
                maior = numero1;
            } else if (numero2 > numero3) {
                maior = numero2;
            } else {
                maior = numero3;
            }

            System.out.println("O maior número é: " + maior);
        }
    }
}

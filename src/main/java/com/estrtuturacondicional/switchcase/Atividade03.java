package main.java.com.estrtuturacondicional.switchcase;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de X");
        int x = scanner.nextInt();
        System.out.println("Digite o valor de A");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor de B");
        double b = scanner.nextDouble();

        switch (x) {
            case 1 :
                System.out.println("A soma é: " + (a + b));
                break;
            case 2 :
                System.out.println("A divisão é: " + (a/b));
                break;
            case 3 :
                if (a > b){
                    System.out.println(b + "," + a);
                } else {
                    System.out.println(a + "," + b);
                }
                break;
            case 4 :
                if (a > b){
                    System.out.println("A diferença é : " + (a - b));
                } else {
                    System.out.println("A diferença é : " + (b - a));
                }
                break;
            case 5 :
                System.out.println("A média é: " + ((a + b) /2));
                break;
            default:
                System.out.println("Número inválido!!");
            break;
        }
    }
}

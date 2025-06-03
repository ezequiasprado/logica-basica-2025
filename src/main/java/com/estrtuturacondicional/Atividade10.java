package main.java.com.estrtuturacondicional;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma idade");
        int idade = scanner.nextInt();

        if (idade < 16){
            System.out.println("Não poderá votar");
        } else if (idade <= 17) {
            System.out.println("Voto opcional");
        } else if (idade <= 60) {
            System.out.println("Voto obrigatório");
        } else {
            System.out.println("Voto opcional");
        }
    }
}

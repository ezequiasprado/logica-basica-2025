package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*String sair = "N";

        while (!(sair.equals("S"))){
            System.out.println("Digite S para sair");
            sair = scanner.next();
        }*/

        int saida = 0;
        String nome = "";
        int quantidadeAlunos = 0;

        while (saida != 1){
            System.out.println("Digite um nome");
            nome = scanner.next();
            quantidadeAlunos = quantidadeAlunos + 1;
            System.out.println("Digite o número 1 para sair");
            saida = scanner.nextInt();
        }
        System.out.println("A quantidade de alunos é: " + quantidadeAlunos);
    }
}

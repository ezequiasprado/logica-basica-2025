package main.java.com.introducaobasica;

import java.math.BigDecimal;

public class Principal {
    public static void main(String[] args) {
        Integer primeiroNumero = 10;
        Integer segundoNumero = 25;

        BigDecimal resultado = new BigDecimal(primeiroNumero)
                .divide(new BigDecimal(segundoNumero));

        double soma =  primeiroNumero /  (double) segundoNumero;

        System.out.println("Primeiro número: " + primeiroNumero);
        System.out.println("Segundo número: " + segundoNumero);
        System.out.println(resultado);
    }
}

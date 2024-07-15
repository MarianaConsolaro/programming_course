package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("Olá mundo");

        int y = 32;
        System.out.println(y);

        double x = 10.5734545;
        System.out.println(x);
        System.out.printf("%.2f\n" , x);
        System.out.printf("%.4f\n" , x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f\n" , x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n",  x);

        String nome = "Mariana";
        int idade = 30;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);




        }

}
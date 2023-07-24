package Dia3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double a = Math.random() * 100;
        Double b = Math.random() * 100;

        System.out.println("__________________Converter na moeda Local__________________");
        NumberFormat pound = NumberFormat.getCurrencyInstance();
        //Scanner scanner = new Scanner(System.in);
        System.out.print("valor do produto: ");
        //Integer value = scanner.nextInt();
        //String valueFormatted = pound.format(value);
        String valueFormatted = pound.format(a);
        System.out.println(valueFormatted);

        System.out.println("__________________Operadores de Compparação__________________");
        System.out.printf("O valor de a = %.2f e de b = %.2f\n", a, b);
        System.out.println(a == b ? "São iguais": "São diferentes");
        System.out.println(a != b ? "São diferentes": "São iguais");

        System.out.println("__________________Operador AND__________________");
        Double valueProduct = a;
        Boolean buy = valueProduct >= 10 && valueProduct <= 15;
        String buyFormatted = buy ? "Comprar" : "Não Comprar";
        System.out.println(buyFormatted);

        System.out.println("__________________Operador OR__________________");
        boolean hasJob = true;
        boolean hascompany = true;
        boolean has50K = true;
        String canFinancy = hasJob || hascompany && has50K ? "Pode Financiar" : "Não pode Financiar";
        System.out.println(canFinancy);

        System.out.println("__________________If Else__________________");
        Integer carValue = 100000;
        if (carValue > 1000000) {
            System.out.println("Não comprar, Acima da tabela");
        } else if (carValue >= 90000 && carValue <= 100000) {
            System.out.println("Comprar o carro");
        }else {
            System.out.println("Não comprar, Abaixo da tabela");
        }
    }
}

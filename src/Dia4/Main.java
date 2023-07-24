package Dia4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("__________________Switch__________________");

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.next();

        switch (nomeProduto.toLowerCase()){
            case "manga":
                System.out.println("R$ 10,00");
                break;
            case "maca":
                System.out.println("R$ 8,00");
                break;
            case "melao":
                System.out.println("R$ 14,00");
                break;
            default:
                System.out.println("Produto invalido");
        }

        System.out.println("__________________For__________________");

        System.out.print("De qual tabuada você precisa: ");
        Integer numero = scanner.nextInt();

        for (Integer numerador = 1; numerador <= 10; numerador++){
            Integer resultado = numero * numerador;
            System.out.printf("%d X %d = %d\n", numerador, numero, resultado);
        }

        String[] nomes = {"Fulano", "Cicrano", "Deltrano"};
        for (String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("__________________While__________________");
        Integer numerador = 1;
        while (numerador <= 10){
            Integer resultado = numero * numerador;
            System.out.printf("%d X %d = %d\n", numerador, numero, resultado);
            numerador++;
        }

        scanner.close();
    }
}

package Dia1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tabuada tabuada = new Tabuada();

        System.out.print("Digite o numero: ");
        Integer numero = scanner.nextInt();

        for (Integer multiplicador = 1; multiplicador <=10; multiplicador++){
            System.out.println(tabuada.calcularTabuada(numero,multiplicador));
        }

        scanner.close();
    }
}

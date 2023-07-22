package Dia2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("__________________Matriz de Inteiros__________________");
        int[] valores = {2,3,1,4,6,5};
        Arrays.sort(valores);

        System.out.println(Arrays.toString(valores));
        System.out.println(valores.length);

        System.out.println("__________________Matriz de String__________________");
        String[] nomes = {"Fulano", "Cicrano", "Deltrano", "Maltrano"};
        nomes[2] = "Outra coisa";

        System.out.println(Arrays.toString(nomes));
        System.out.println(nomes[2]);

        System.out.println("__________________Matriz Multi__________________");
        String[][] cars = {{"Fiat", "Uno"},{"Honda", "HB20"}};
        System.out.println(cars[0][1]);
        System.out.println(Arrays.deepToString(cars));

        System.out.println("__________________Constantes__________________");
        final double taxaJuros = 11.92;
        System.out.println(taxaJuros);

        System.out.println("__________________Operadores__________________");
        double resultado = 4.0 / 3.0;
        System.out.println(resultado);
        resultado = 2 * 3;
        System.out.println(resultado);
        resultado++;
        System.out.println(resultado);

        System.out.println("__________________Ordem dos Operadores__________________");
        int funcao = (50*60)/100;
        System.out.println(funcao);

        System.out.println("__________________Converter String em Inteiros__________________");
        String precoS = "10";
        Integer precoI = Integer.parseInt(precoS);
        System.out.println(precoI);
    }
}

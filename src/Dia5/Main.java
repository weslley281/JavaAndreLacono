package Dia5;

public class Main {
    public static void main(String[] args) {
        productList("Goiaba", 14.99);
        productList("Mamão", 8.99);
    }
    public static void productList(String fruit, Double value){
        System.out.println(fruit + " está R$ " + value);
    }
}

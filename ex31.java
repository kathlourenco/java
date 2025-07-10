package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class ex31 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product(); //criei um novo objeto da classe product
        System.out.println("Enter product data");
        System.out.println("Name: ");
        product.name = sc.nextLine(); // faco a leitura do nome e guardo na variavel product no campo name

        System.out.println("Price: ");
        product.price = sc.nextDouble(); // faco a leitura do preco e guardo na variavel product no campo price

        System.out.println("Quantity in stock: ");
        product.qtd = sc.nextInt();  // faco a leitura da qtd e guardo na variavel product no campo qtd

        System.out.println(product.name + ", " + product.price + ", " + product.qtd);

        sc.close();
    }

}

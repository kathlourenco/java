package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class ex30 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite os lados do triangulo 1 : ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os lados do triangulo 2 : ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double area1 = x.area();
        double area2 = y.area();

        if (area1 > area2) {
            System.out.println("A area maior é do trinagulo 1: " + area1);
        } else{
            System.out.println("A area maior é do triangulo 2: " + area2);
        }
        sc.close();
    }
}

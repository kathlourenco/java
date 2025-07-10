import java.util.Scanner;


public class ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x, y, z, area1, area2, p1, p2;

        System.out.println("Digite os lados do triangulo 1 : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println("Digite os lados do triangulo 2 : ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        p1 = (a + b + c) / 2;
        p2 = (x + y + z) / 2;
        area1 = Math.sqrt(p1 * ((p1 - a) * (p1 - b) * (p1 - c)));
        area2 = Math.sqrt(p2 * ((p2 - x) * (p2 - y) * (p2 - z)));

        if (area1 > area2) {
            System.out.println("A area maior é do trinagulo 1: " + area1);
        } else{
            System.out.println("A area maior é do triangulo 2: " + area2);
        }
        sc.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double r, area;
        r = sc.nextDouble();
        area =  3.14159 * (r * r);
        System.out.println("A área do círculo é: " + area);
    }
}
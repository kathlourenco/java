import java.util.Locale;
import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double x;
        System.out.println("Digite o numero de casos de teste: ");
        x = sc.nextDouble();

        for(int i = 0; i < x; i ++){
            System.out.println("Digite os números");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = ((a * 2) + (b * 3) + (c * 5)) / 10;

            System.out.println("A media dos números é: " + media);

        }
        sc.close();
    }
}
import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Escreva um número para obter seu fatorial: ");
    int n = sc.nextInt();
    int fat = 1;

    for(int i = 1; i <= n; i++){
        fat = fat * i;
    }
        System.out.println(fat);
    sc.close();
    }
}
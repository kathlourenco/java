import java.util.Scanner;
public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite um numero de 1 a 1000: ");
        x = sc.nextInt();

        for(int i = 0; i <= x; i ++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

    }
}
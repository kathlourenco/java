import java.util.Scanner;

public class ex25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber seus divisores: ");
        int n = sc.nextInt();

        for(int i = 1; i < n; i ++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
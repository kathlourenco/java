import java.util.Scanner;

public class ex05{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Digite um numero: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (b % a == 0){
            System.out.println("São multiplos");
        }else if(a % b == 0){
            System.out.println("São multiplos");
        }else{
            System.out.println("Não são multiplos");
        }

    }
}
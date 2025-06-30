import java.util.Scanner;

public class ex04{
    public static void main(String [] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Este número é par!");
        }else{
            System.out.println("Este número é impar!");
        }
        sc.close();
    }
}
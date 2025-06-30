import java.util.Scanner;

public class ex03{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();

        if(num < 0){
            System.out.println("Este número é negativo!");
        }else if(num > 0){
            System.out.println("Este número é positivo!");
        }else{
            System.out.println("Digite um número inteiro");
        }
        sc.close();
    }
}
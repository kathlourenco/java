import java.util.Scanner;

public class ex08{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        double num;
        System.out.println("Digite um número entre o intervalo de 0 e 100: ");
        num = sc.nextDouble();

        if(0 <= num && num <= 25){
            System.out.println("O número está entre 0 e 25");
        }else if(num >= 25 && num <= 50){
            System.out.println("O número está entre 25 e 50");
        }else if(num >= 50 && num <= 75){
            System.out.println("O número está entre 50 e 75");
        }else if(num >= 75 && num <= 100){
            System.out.println("O número está entre 75 e 100");
        }else{
            System.out.println("Fora do intervalo de 0 a 100");
        }
        sc.close();
    }
}
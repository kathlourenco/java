import java.util.Scanner;

public class ex11{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int x, soma;

    System.out.println("Digite um número: ");
    x = sc.nextInt();
    soma = 0;

    while(x != 0){
        soma += x;
        System.out.println("Digite um número: ");
        x = sc.nextInt();
    }
    System.out.println("A soma dos números inseridos é: " + soma);
    sc.close();
    }
}
import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Indique quantos numeros irá escrever: ");
    n = sc.nextInt();

    for(int i = 0; i < n; i++ ){
        System.out.println("Escreva os números desejados: ");
        int x = sc.nextInt();

        if(x >= 10 && x <= 20){
            System.out.println("In the break");
        } else{
            System.out.println("Out of break");
        }
    }
    }
}
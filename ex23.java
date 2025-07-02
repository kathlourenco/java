import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Digite o numero de casos de teste: ");
    n = sc.nextInt();

    for(int i = 0; i < n; i ++){
        System.out.println("Insira o par de números: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double div = a / b;
        System.out.println("A divisão dos numeros é igual a " + div);

        if( a == 0 || b == 0){
            System.out.println("A divisão é impossível");
        }
    }
    }
}
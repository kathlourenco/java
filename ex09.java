import java.util.Scanner;

public class ex09{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.println("Digite um valor entre -2 e 2: ");
        x = sc.nextDouble();
        System.out.println("Digite outro valor entre -2 e 2: ");
        y = sc.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("Está na origem");
        }else if(x <= 2 && x >= 0 && y <= 2 && y >= 0){
            System.out.println("O intervalo está no quadrante 1");
        }else if(x <= 0 && x >= -2 && y >= 0 && y <= 2){
            System.out.println("O intervalo est<UNK> no quadrante 2");
        }else if(x <= 2 && x >= 0 && y <= 0 && y >= -2){
            System.out.println("O intervalo est<UNK> no quadrante 4");
        }else if(x <= 0 && x >= -2 && y <= 0 && y >= -2) {
            System.out.println("O intervalo está no quadrante 3");
        }else{
            System.out.println("Digite valores válidos");
        }
        sc.close();
    }
}
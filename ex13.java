import java.util.Scanner;

public class ex13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Digite a coordenada x: ");
        x = sc.nextInt();
        System.out.println("Digite a coordenada y: ");
        y = sc.nextInt();

        while( x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("Primeiro quadrante!");
            } else if(x > 0 && y < 0){
                System.out.println("Quarto quadrante!");
            } else if(x < 0 && y > 0){
                System.out.println("Segundo quadrante!");
            } else if(x < 0 && y < 0){
                System.out.println("Terceiro quadrante!");
            } else{
                System.out.println("Dados inválidos!");
            }
            break;
        }
        sc.close();
    }
}
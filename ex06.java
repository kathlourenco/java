import java.util.Scanner;

public class ex06{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int h1, h2, total, totaldois;
        System.out.println("Digite a hora inicial do jogo: ");
        h1 = sc.nextInt();
        System.out.println("Digite a hora final do jogo: ");
        h2 = sc.nextInt();
        total = h2 - h1;
        totaldois = 24 - h1 + h2;

        if( h1 < 0 || h2 < 0 || h1 > 23 || h2 > 23){
            System.out.println("Digite horas válidas!");
        }else if(h1 == h2){
            System.out.println("O jogo durou 24 horas!");
        }else if(h1 < h2){
            System.out.println("O jogo durou " + total + " horas");
        }else {
        System.out.println("O jogo durou " + totaldois + " horas");
        }
        sc.close();
    }
}
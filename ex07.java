import java.util.Locale;
import java.util.Scanner;

public class ex07{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("1- Cachorro quente: 4.00");
        System.out.println("2- Xsalada: 4.50");
        System.out.println("3 - Xbacon: 5.00");
        System.out.println("4 - Torrada simples: 2.00");
        System.out.println("5 - Refrigerante: 1.50");

        int codigo, qtd;
        System.out.print("Digite um codigo: ");
        codigo = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        qtd = sc.nextInt();

        if(codigo == 1){
            System.out.println("Total: " + 4 * qtd + " reais");
        }else if(codigo == 2){
            System.out.println("Total: " + 4.50 * qtd + " reais");
        }else if(codigo == 3){
            System.out.println("Total: " + 5 * qtd + " reais");
        }else if(codigo == 4){
            System.out.println("Total: " + 2 * qtd + " reais");
        }else if(codigo == 5){
            System.out.println("Total: " + 1.50 * qtd + " reais");
        }else{
            System.out.println("Digite um código válido!");
        }
    }
}
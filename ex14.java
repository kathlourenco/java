import java.util.Scanner;

public class ex14{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int cod;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("1 - Alcool");
        System.out.println("2- Gasolina");
        System.out.println("3- Diesel");
        System.out.println("4- Fim");

        System.out.println("Digite um código: ");
        cod = sc.nextInt();

        while(cod != 4){
           if(cod == 1){
               alcool = alcool +1;
               System.out.println("Digite um código: ");
           } else if(cod == 2){
               gasolina = gasolina + 1;
               System.out.println("Digite um código: ");
           } else if(cod == 3){
               diesel = diesel + 1;
               System.out.println("Digite um código: ");
           }
            cod = sc.nextInt();
        }

        System.out.println("Muito obrigada!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();

    }
}
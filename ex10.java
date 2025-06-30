import java.util.Scanner;

public class ex10{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num;
        String dia;
        System.out.println("Digite um número de 1 a 7: ");
        num = sc.nextInt();

        switch (num){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido";
                break;
        }
        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}
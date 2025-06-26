import java.util.Scanner;

public class ex04{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    int num, horas;
    num = sc.nextInt();
    horas = sc.nextInt();

    double valor, salario;
    valor = sc.nextDouble();
    salario =  horas * valor;

    System.out.println("Numero: " + num);
    System.out.println("Salário: " + salario);
    }
}
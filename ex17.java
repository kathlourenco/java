import java.util.Scanner;
public class ex17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite;

        System.out.println("Digite um número inteiro: ");
        limite = sc.nextInt();

        if (limite < 1) {
            System.out.println("Digite um número maior que 0.");
        } else {
            int cont = 1;

            System.out.println("Números pares de 1 até " + limite + ":");
            while (cont <= limite) {
                if (cont % 2 == 0) {
                    System.out.print(cont + " ");
                }
                cont++;
            }

            cont = 1;

            System.out.println("Números ímpares de 1 até " + limite + ":");
            while (cont <= limite) {
                if (cont % 2 != 0) {
                    System.out.print(cont + " ");
                }
                cont++;
            }
        }

        sc.close();
    }
}

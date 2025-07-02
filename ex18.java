import java.util.Scanner;

public class ex18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, soma;
        System.out.println("Quantos numeros você vai digitar? ");
        n = sc.nextInt();
        soma = 0; // contador da soma iniciado em zero

        for(int i = 0; i < n; i ++){  // contador do laço em zero, repete enquanto ele for menor que o inserido, aumenta um

            int x = sc.nextInt(); // insere os numeros da qtd falada anteriormente
            soma = soma + x; // soma os indices
        }
        // sem o i = 0 o laço não saberia quando começar, quantas vezes já repetiu e quando irá parar
        System.out.println(soma);
    }
}
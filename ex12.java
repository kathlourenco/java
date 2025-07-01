import java.util.Scanner;

public class ex12{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int senha;
        System.out.println("Digite sua senha: ");
        senha = sc.nextInt();

        while(senha != 2002){
            System.out.println("Senha incorreta, tente novamente: ");
            senha = sc.nextInt();

            if(senha == 2002){
                System.out.println("A senha está correta!");
            }
        }
        sc.close();
    }
}
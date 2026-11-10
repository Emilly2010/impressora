import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Usuario pessoa = new Usuario();

        boolean login = false;

        for (int tentativas = 3; tentativas > 0 && login == false; tentativas--) {
            System.out.print("Usuário: ");
            pessoa.usuario1 = ler.nextLine();

            System.out.print("Senha: ");
            pessoa.senha1 = ler.nextInt();

            ler.nextLine();

            login = pessoa.verificarLogin();

            if (login == false) {
                System.out.println("Erro. Tentativas restantes: " + (tentativas - 1));
            }
        }

        if (login == true) {
            System.out.println("Login feito com sucesso!");
        } else {
            System.out.println("Tentativas esgotadas. Saindo...");
        }

    }
}
import java.util.Scanner;

public class Impressora {

    static boolean conexaoAberta = false; // Declaração da variável de controle
    static int tipo;
    static String modelo;
    static String conexao;
    static int parametro;
    static Scanner input = new Scanner(System.in);

    void configurarImpressora() {
        System.out.println("Digite o tipo: ");
        tipo = input.nextInt();

        System.out.println("Digite o modelo: ");
        modelo = input.next(); // Atribuído para modelo (String)

        System.out.println("Digite a conexao: ");
        conexao = input.next(); // Atribuído para conexao (String)

        System.out.println("Digite o parametro: ");
        parametro = input.nextInt(); // Atribuído para parametro (int)

        System.out.println("Dados armazenados com sucesso!");
    }

    void abrirConexao() {
        if (conexaoAberta == false) {
            int ret = ImpressoraDLL.INSTANCE.AbreConexaoImpressora(tipo, modelo, conexao, parametro);

            if (ret == 0) {
                conexaoAberta = true;
                System.out.println("Comunicou com sucesso!");
            } else {
                System.out.println("Erro ao abrir conexao. Retorno " + ret);
            }
        } else {
            System.out.println("Ja existe uma comunicação em aberto");
        }
    }

  void impressaoCodigoBarras() {
    if (conexaoAberta == true) {
        int ret = ImpressoraDLL.INSTANCE.AbreConexaoImpressora(tipo, modelo, conexao, parametro);
        if (ret == 0) {
            ImpressoraDLL.INSTANCE.Corte(3);
            System.out.println("Comunicou com sucesso!");
        } else {
            System.out.println("Erro ao abrir conexao. Retorno " + ret);
        }
    } else {
        System.out.println("Ja existe uma comunicação em aberto");
    }
}
}


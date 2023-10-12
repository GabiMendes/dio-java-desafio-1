import java.util.Scanner;

public class Controller implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    Scanner scanner = new Scanner(System.in);

    // Funções de reprodutor musical
    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica() {
        
        System.out.println("Selecione uma música (1, 2 ou 3): ");
        int musica = scanner.nextInt();

        switch (musica) {
            case 1:
                System.out.println("Selecionando música 1.");
                break;

            case 2:
                System.out.println("Selecionando música 2.");
                break;

            case 3:
                System.out.println("Selecionando música 3.");
                break;

            default:
                System.out.println("Opção inválida. Selecione de 1 a 3.");
                selecionarMusica();
                break;
        }


    }

    // Funções de aparelho telefônico
    @Override
    public void ligar() {

        System.out.println("Selecione um contato (1, 2 ou 3): ");
        Integer contato = scanner.nextInt();

        switch (contato) {
            case 1:
                System.out.println("Ligando para o contato 1.");
                break;

            case 2:
                System.out.println("Ligando para o contato 2.");
                break;

            case 3:
                System.out.println("Ligando para o contato 3.");
                break;

            default:
                System.out.println("Opção inválida. Selecione de 1 a 3.");
                break;
        }

        
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Funções de navegador de internet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }

}
package agenda;

import model.Agenda;
import model.Contato;
import model.Menu;

import java.util.Scanner;

/**
 * Created by stenio on 26/05/17.
 */
public class Main {
    private Scanner sc = new Scanner(System.in);
    private final int TAMANHO_AGENDA = 100;
    private Agenda agenda = new Agenda(TAMANHO_AGENDA);

    public static void main(String[] args) {
        Main agendaMain = new Main();
        agendaMain.iniciarMenu();
    }

    private void iniciarMenu() {
        boolean sair = false;
        while (!sair) {
            System.out.print(Menu.MENU_PRINCIPAL);
            String opcao = sc.nextLine();

            if (!Util.isStringInArray(opcao, Menu.OPCOES_VALIDAS)) {
                System.out.println(Menu.OPCAO_INVALIDA + Util.ENDLINE);
                continue;
            }

            try {
                switch (opcao) {
                    case Menu.OPCAO_CADASTRAR_CONTATO:
                        cadastrarContato();
                        break;
                    case Menu.OPCAO_LISTAR_CONTATOS:
                        listarContatos();
                        break;
                    case Menu.OPCAO_EXIBIR_CONTATO:
                        exibirContato();
                        break;
                    default:
                        sair = true;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage() + Util.ENDLINE);
            }
        }

        sc.close();
    }

    private void exibirContato() throws Exception {
        System.out.print(Menu.POSICAO);
        int posicao = Util.tryConvertInt(sc.nextLine(), Menu.POSICAO_INVALIDA + Util.ENDLINE);

        Contato contatoRecuperado = agenda.recuperarContato(posicao);
        System.out.println(contatoRecuperado + Util.ENDLINE);
    }

    private void listarContatos() {
        System.out.println(agenda);
    }

    private void cadastrarContato() throws Exception {
        Contato newContato = new Contato();
        String newPosicao;

        System.out.print(Menu.POSICAO);
        newPosicao = sc.nextLine();

        System.out.print(Menu.NOME);
        newContato.setNome(sc.nextLine());

        System.out.print(Menu.SOBRENOME);
        newContato.setSobrenome(sc.nextLine());

        System.out.print(Menu.TELEFONE);
        newContato.setTelefone(sc.nextLine());

        int posicao = Util.tryConvertInt(newPosicao, Menu.POSICAO_INVALIDA + Util.ENDLINE);
        agenda.cadastrarContato(posicao, newContato);

        System.out.println(Menu.CADASTRO_REALIZADO + Util.ENDLINE);
    }
}

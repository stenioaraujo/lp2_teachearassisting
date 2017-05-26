package model;

import agenda.Util;

/**
 * Created by stenio on 26/05/17.
 */
public class Agenda {
    private Contato[] agenda;

    public Agenda(int size) {
        this.agenda = new Contato[size];
    }

    public void cadastrarContato(int posicao, Contato contato) throws Exception {
        Util.validateNull(contato, "Contato");
        validatePosicao(posicao);

        agenda[posicao-1] = contato;
    }

    public Contato recuperarContato(int posicao) throws Exception {
        validatePosicao(posicao);
        validateContatoExiste(posicao);

        return agenda[posicao-1];
    }

    public void validatePosicao(int posicao) throws Exception {
        if (posicao < 1 || posicao > agenda.length) {
            throw new Exception(Menu.POSICAO_INVALIDA);
        }
    }

    public void validateContatoExiste(int posicao) throws Exception {
        if (agenda[posicao-1] == null) {
            throw new Exception(Menu.POSICAO_INVALIDA);
        }
    }

    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] != null) {
                resultado += (i+1) + " - " + agenda[i].getNomeCompleto() + Util.ENDLINE;
            }
        }
        return resultado;
    }
}

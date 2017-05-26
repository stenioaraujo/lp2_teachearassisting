package model;

import agenda.Util;

/**
 * Created by stenio on 26/05/17.
 */
public class Contato {
    private String nome;
    private String sobrenome;
    private String telefone;

    public Contato() {}

    public Contato(String nome, String sobrenome, String telefone) throws Exception{
        setNome(nome);
        setSobrenome(sobrenome);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        Util.validateVazia(nome, "Nome");
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) throws Exception {
        Util.validateVazia(sobrenome, "Sobrenome");
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return this.getNome() + " " + this.getSobrenome();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws Exception {
        Util.validateVazia(telefone, "Telefone");
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return this.getNomeCompleto() + " - " + this.getTelefone();
    }
}

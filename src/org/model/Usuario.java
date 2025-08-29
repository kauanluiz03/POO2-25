package org.model;

public class Usuario {
    private long id;
    private String nome;
    private String cpf;
    private String login;
    private String senha;
    private Contato contato;
    private Endereco endereco;

    public Usuario() {
        this.id = 0;
        this.nome = "";
        this.cpf = "";
        this.login = "";
        this.senha = "";
        this.contato = contato;
        this.endereco = endereco;
    }

    public Usuario(long id, String nome, String cpf, String login, String senha, Contato contato, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.contato = contato;
        this.endereco = endereco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

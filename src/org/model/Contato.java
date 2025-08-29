package org.model;

public class Contato {
    private long id;
    private String email;
    private String telefone;
    private String celular;

    public Contato() {
        this.id = 0;
        this.email = "";
        this.telefone = "";
        this.celular = "";
    }

    public Contato(long id, String email, String telefone, String celular) {
        this.id = id;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}

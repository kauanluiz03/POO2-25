package org.model;

public class Endereco {
    private long id;
    private String cep;
    private String logradouro;
    private String complemento;
    private String numero;
    private String referencia;

    public Endereco() {
        this.id = 0;
        this.cep = "";
        this.logradouro = "";
        this.complemento = "";
        this.numero = "";
        this.referencia = "";

    }

    public Endereco(long id, String cep, String logradouro, String complemento, String numero, String referencia) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
        this.referencia = referencia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}

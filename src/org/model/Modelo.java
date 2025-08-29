package org.model;

import java.util.Date;
import java.util.List;


public class Modelo {

    private long id;
    private String nome;
    private Date ano;
    private int qtModelo;
    private List<Modelo> listVeiculo;

    public Modelo (){
        this.id=0;
        this.nome="";
        this.ano=new Date();
        this.qtModelo=0;

    }

    public Modelo(long id, int qtModelo, List<Modelo> listVeiculo, String nome, Date ano) {
        this.id = id;
        this.qtModelo = qtModelo;
        this.listVeiculo = listVeiculo;
        this.nome = nome;
        this.ano = ano;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Modelo> getListVeiculo() {
        return listVeiculo;
    }

    public void setListVeiculo(List<Modelo> listVeiculo) {
        this.listVeiculo = listVeiculo;
    }

    public int getQtModelo() {
        return qtModelo;
    }

    public void setQtModelo(int qtModelo) {
        this.qtModelo = qtModelo;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

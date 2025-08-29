package org.model;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private long id;
    private String nome;
    private float valorLocação;
    private List<Modelo> listModelos;

    public Categoria (){
        this.id=0;
        this.nome="";
        this.valorLocação=0;
        this.listModelos = new ArrayList<>();
    }

    public Categoria(long id, List<Modelo> listModelos, float valorLocação, String nome) {
        this.id = id;
        this.listModelos = listModelos;
        this.valorLocação = valorLocação;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Modelo> getListModelos() {
        return listModelos;
    }

    public void setListModelos(List<Modelo> listModelos) {
        this.listModelos = listModelos;
    }

    public float getValorLocação() {
        return valorLocação;
    }

    public void setValorLocação(float valorLocação) {
        this.valorLocação = valorLocação;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

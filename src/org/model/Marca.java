package org.model;

import java.util.ArrayList;
import java.util.List;

public class Marca {
    private int id;
    private String nome;
    private List<Modelo> modelos;


    public Marca() {
        this.modelos = new ArrayList<>();
        this.nome = "";
        this.id = 0;
    }

    public Marca(String nome, List<Modelo> modelos, int id) {
        this.nome = nome;
        this.modelos = modelos;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

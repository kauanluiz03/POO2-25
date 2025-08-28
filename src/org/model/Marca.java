package org.model;

import java.util.ArrayList;
import java.util.List;

public class Marca {
    public int id;
    public String nome;
    List<Modelo> modelos;


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
}

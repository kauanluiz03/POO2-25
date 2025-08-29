package org.model;

import java.util.Date;

public class Manutencao {
    private long id;
    private String descrição;
    private Date data;
    private float custo;

    public Manutencao (){
        this.id=0;
        this.descrição="";
        this.data = new Date();
        this.custo=0;
    }

    public Manutencao(long id, float custo, Date data, String descrição) {
        this.id = id;
        this.custo = custo;
        this.data = data;
        this.descrição = descrição;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }
}

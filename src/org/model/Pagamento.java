package org.model;

import java.util.Date;

public class Pagamento {

    private long id;
    private Date data;
    private float valor;
    private Enum forma;


    public Pagamento(){
        this.id=0;
        this.data=new Date();
        this.valor=0;
        this.forma= forma ;
    }

    public Pagamento(long id, Enum forma, float valor, Date data) {
        this.id = id;
        this.forma = forma;
        this.valor = valor;
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Enum getForma() {
        return forma;
    }

    public void setForma(Enum forma) {
        this.forma = forma;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}


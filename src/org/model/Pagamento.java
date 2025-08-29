package org.model;

import java.util.Date;

public class Pagamento {

    private long id;
    private float valorTotal;
    private Enum tipoPagamento;


    public Pagamento(){
        this.id=0;
        this.valorTotal=0;
        this.tipoPagamento=tipoPagamento;
    }

    public Pagamento(long id, Enum tipoPagamento, float valorTotal, Date data) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.valorTotal = valorTotal;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Enum getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(Enum tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}


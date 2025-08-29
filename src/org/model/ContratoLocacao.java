package org.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContratoLocacao {
    private long id;
    private Date dataContrato;
    private float Caucao;
    private Enum status;
    private List<Locacao> listaLocacao;
    private float valorTotal;
    private Cliente cliente;

    public ContratoLocacao() {
        this.id = 0;
        this.dataContrato = new Date();
        this.Caucao = 0;
        this.status = status;
        this.listaLocacao = new ArrayList<>();
        this.valorTotal = 0;
        this.cliente = cliente;
    }

    public ContratoLocacao(long id, Date dataContrato, float caucao, Enum status, List<Locacao> listaLocacao, float valorTotal, Cliente cliente) {
        this.id = id;
        this.dataContrato = dataContrato;
        Caucao = caucao;
        this.status = status;
        this.listaLocacao = listaLocacao;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public float getCaucao() {
        return Caucao;
    }

    public void setCaucao(float caucao) {
        Caucao = caucao;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public List<Locacao> getListaLocacao() {
        return listaLocacao;
    }

    public void setListaLocacao(List<Locacao> listaLocacao) {
        this.listaLocacao = listaLocacao;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

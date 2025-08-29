package org.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Locacao {
    private long id;
    private Date dataRetirada;
    private Date dataDevolucao;
    private float valorLocacao;
    private List<Locacao> listOcorrencia;
    private Veiculo veiculo;

    public Locacao() {
        this.id = 0;
        this.dataRetirada = new Date();
        this.dataDevolucao = new Date();
        this.valorLocacao = 0;
        this.listOcorrencia = new ArrayList<>();
        this.veiculo = new Veiculo();
    }

    public Locacao(long id, Date dataRetirada, Date dataDevolucao, float valorLocacao, List<Locacao> listOcorrencia, Veiculo veiculo) {
        this.id = id;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.valorLocacao = valorLocacao;
        this.listOcorrencia = listOcorrencia;
        this.veiculo = veiculo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public List<Locacao> getListOcorrencia() {
        return listOcorrencia;
    }

    public void setListOcorrencia(List<Locacao> listOcorrencia) {
        this.listOcorrencia = listOcorrencia;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}

package org.model;

public class Veiculo {
    private long id;
    private Enum status;
    private int km;
    private String chassi;
    private String renavam;
    private String cor;
    private Modelo modelo;

    public Veiculo() {
        this.id = 0;
        this.modelo = modelo;
        this.status = status;
        this.km = 0;
        this.chassi = "";
        this.renavam ="";
        this.cor =";";
    }

    public Veiculo(long id, Enum status, int km, String chassi, String renavam, String cor, Modelo modelo) {
        this.id = id;
        this.status = status;
        this.km = km;
        this.chassi = chassi;
        this.renavam = renavam;
        this.cor = cor;
        this.modelo = new Modelo();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
}

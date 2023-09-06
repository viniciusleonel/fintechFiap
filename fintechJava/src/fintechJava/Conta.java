package fintechJava;

import java.util.Date;

public class Conta {
    private int idConta;
    private String numeroConta = "Indefinido";
    private String tipoConta = "Indefinido";
    private boolean statusConta = false;
    private Date dataAberturaConta;

    public void exibirConta(){
        System.out.println("Id: " + this.getIdConta());
        System.out.println("Número: " + this.getNumeroConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Status: " + this.getStatusConta());
        System.out.println("Data de Abertura: " + this.getDataAberturaConta());
    }

    public Conta(){}

    public Conta(int idConta, String numeroConta, String tipoConta, boolean statusConta, Date dataAberturaConta) {
        this.idConta = idConta;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.statusConta = statusConta;
        this.dataAberturaConta = dataAberturaConta;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    public Date getDataAberturaConta() {
        return dataAberturaConta;
    }

    public void setDataAberturaConta(Date dataAberturaConta) {
        this.dataAberturaConta = dataAberturaConta;
    }
}

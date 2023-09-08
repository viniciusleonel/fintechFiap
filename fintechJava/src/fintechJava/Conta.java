package fintechJava;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {
    private int idConta;
    private String numeroConta;
    private String tipoConta;
    private boolean statusConta;
    private Date dataAberturaConta;
    private double saldoConta;

    public void exibirConta(){
//        System.out.println("===============");
        System.out.println("Id: " + this.getIdConta());
        System.out.println("Número: " + this.getNumeroConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Status: " + this.getStatusConta());
        System.out.println("Saldo: " + this.getSaldoConta());
        System.out.println("Data de Abertura: " + this.getDataAberturaConta());
    }

    public void depositar (double valor){
        this.saldoConta += valor;
    }

    public void retirar (double valor){
        this.saldoConta -= valor;
    }

    // Construtor básico
    public Conta(){
        this.setIdConta(0);
        this.setNumeroConta("Indefinido");
        this.setSaldoConta(0);
        this.setStatusConta(false);
        this.setTipoConta("Indefinido");
    }

    // Construtor com parametros
    public Conta(int idConta, String numeroConta, String tipoConta, boolean statusConta, Date dataAberturaConta, double saldoConta) {
        this.idConta = idConta;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.statusConta = statusConta;
        this.dataAberturaConta = dataAberturaConta;
        this.saldoConta = saldoConta;
    }


    // Getters and Setters
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

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
}

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
    private Date dataFechamentoConta;
    private double saldoConta;

    // Atributo tipo lista que recebe classe Transacao e cria uma array
    private List<Conta> contasList = new ArrayList<>();

    // Adiciona uma transação na lista de transações
    public void adicionarConta(Conta conta) {
        this.contasList.add(conta);
    }

    // Mostra as transações listadas
    public void listarTransacoes(){
        for (Conta conta : contasList){
            System.out.println("Id da Conta: " + conta.getIdConta());
            System.out.println("Número: " + conta.getNumeroConta());
            System.out.println("Tipo: " + conta.getTipoConta());
            System.out.println("Status: " + conta.getStatusConta());
            System.out.println("Saldo: " + conta.getSaldoConta());
            System.out.println("Data de Abertura: " + conta.getDataAberturaConta());
        }
    }

    public void exibirConta(){
//        System.out.println("===============");
        System.out.println("Id da Conta: " + this.getIdConta());
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
        this.setDataAberturaConta(new Date());
        this.setDataFechamentoConta(new Date());
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

    public Date getDataFechamentoConta() {
        return dataFechamentoConta;
    }

    public void setDataFechamentoConta(Date dataFechamentoConta) {
        this.dataFechamentoConta = dataFechamentoConta;
    }
}

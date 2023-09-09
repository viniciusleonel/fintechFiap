package fintechJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Transacao extends Conta{
    private int idTransacao;
    private Date dataTransacao;
    private double valorTransacao;
    private String tipoTransacao;
    private String descricaoTransacao;
    private String destinoTransacao;
    private Conta conta;

    // Atributo tipo lista que recebe classe Transacao e cria uma array
    private List<Transacao> transacoesList = new ArrayList<>();

    // Adiciona uma transação na lista de transações
    public void adicionarTransacao(Transacao transacao) {
        Collections.addAll(transacoesList, transacao);
    }

    // Mostra as transações listadas
    public void listarTransacoes(){
        for (Transacao transacao : transacoesList){
            System.out.println("===================");
            System.out.println("ID da Transação: " + transacao.getIdTransacao());
            System.out.println("Data: " + transacao.getDataTransacao());
            System.out.println("Valor: " + transacao.getValorTransacao());
            System.out.println("Tipo: " + transacao.getTipoTransacao());
            System.out.println("Descrição: " + transacao.getDescricaoTransacao());
        }
    }

    public void exibirTransacao(){
        System.out.println("ID da Transação: " + this.getIdTransacao());
        System.out.println("Data: " + this.getDataTransacao());
        System.out.println("Valor: " + this.getValorTransacao());
        System.out.println("Tipo: " + this.getTipoTransacao());
        System.out.println("Descrição: " + this.getDescricaoTransacao());
        conta.exibirConta();
    }

    // Construtor básico
    public Transacao(){
        this.setIdTransacao(0);
        this.setValorTransacao(0);
        this.setTipoTransacao("Indefinido");
        this.setDestinoTransacao("Indefinido");
        this.setDestinoTransacao("Sem descrição");
        this.setDataTransacao(new Date());
    }

    // Construtor com parametros
    public Transacao(int idConta, String numeroConta, String tipoConta, boolean statusConta, Date dataAberturaConta, double saldoConta, int idTransacao, Date dataTransacao, double valorTransacao, String tipoTransacao, String descricaoTransacao, String destinoTransacao) {
        super(idConta, numeroConta, tipoConta, statusConta, dataAberturaConta, saldoConta);
        this.idTransacao = idTransacao;
        this.dataTransacao = dataTransacao;
        this.valorTransacao = valorTransacao;
        this.tipoTransacao = tipoTransacao;
        this.descricaoTransacao = descricaoTransacao;
        this.destinoTransacao = destinoTransacao;
    }

    // Getters and Setters
    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public Date getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(Date dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public String getDescricaoTransacao() {
        return descricaoTransacao;
    }

    public void setDescricaoTransacao(String descricaoTransacao) {
        this.descricaoTransacao = descricaoTransacao;
    }

    public String getDestinoTransacao() {
        return destinoTransacao;
    }

    public void setDestinoTransacao(String destinoTransacao) {
        this.destinoTransacao = destinoTransacao;
    }
}

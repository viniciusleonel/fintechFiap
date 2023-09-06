package fintechJava;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transacao {
    private int idTransacao;
    private Date dataTransacao;
    private double valorTransacao;
    private String tipoTransacao = "Indefinido";
    private String descricaoTransacao = "Sem descrição";
    private String destinoTransacao = "Indefinido";

    private List<Transacao> transacoesList = new ArrayList<>();


    // Adiciona uma transação na lista de transações
    public void adicionarEndereco(Transacao transacao) {
        this.transacoesList.add(transacao);
    }

    // Mostra as transações listadas
    public void listarEnderecos(){
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
    }

    public Transacao(){}

    public Transacao(int idTransacao, Date dataTransacao, double valorTransacao, String tipoTransacao, String descricaoTransacao, String destinoTransacao) {
        this.idTransacao = idTransacao;
        this.dataTransacao = dataTransacao;
        this.valorTransacao = valorTransacao;
        this.tipoTransacao = tipoTransacao;
        this.descricaoTransacao = descricaoTransacao;
        this.destinoTransacao = destinoTransacao;
    }

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

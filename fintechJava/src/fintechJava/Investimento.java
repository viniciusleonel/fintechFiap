package fintechJava;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Investimento extends Conta{
    private int idInvestimento;
    private String tipoInvestimento;
    private double valorInvestimento;
    private boolean statusInvestimento;
    private Date dataInicioInvestimento;
    private Date dataResgateInvestimento;
    private String descricaoInvestimento;
    private Conta conta;

    // Atributo tipo lista que recebe classe Transacao e cria uma array
    private List<Investimento> investimentosList = new ArrayList<>();

    // Adiciona uma transação na lista de transações
    public void adicionarTransacao(Investimento investimento) {
        this.investimentosList.add(investimento);
    }

    // Mostra as transações listadas
    public void listarTransacoes(){
        for (Investimento investimento : investimentosList){
            System.out.println("===================");
            System.out.println("ID do Investimento: " + investimento.getIdInvestimento());
            System.out.println("Status: " + investimento.getStatusInvestimento());
            System.out.println("Tipo: " + investimento.getTipoInvestimento());
            System.out.println("Valor: " + investimento.getValorInvestimento());
            System.out.println("Data Inicio: " + investimento.getDataInicioInvestimento());
            System.out.println("Data Resgate: " + investimento.getDataResgateInvestimento());
            System.out.println("Descrição: " + investimento.getDescricaoInvestimento());
        }
    }

    public void exibirInvestimento(){
        System.out.println("===================");
        System.out.println("ID do Investimento: " + this.getIdInvestimento());
        System.out.println("Status: " + this.getStatusInvestimento());
        System.out.println("Tipo: " + this.getTipoInvestimento());
        System.out.println("Valor: " + this.getValorInvestimento());
        System.out.println("Data Inicio: " + this.getDataInicioInvestimento());
        System.out.println("Data Resgate: " + this.getDataResgateInvestimento());
        System.out.println("Descrição: " + this.getDescricaoInvestimento());
        conta.exibirConta();
    }

    // Construtor básico
    public Investimento(){
        this.setIdInvestimento(0);
        this.setTipoInvestimento("Indefinido");
        this.setValorInvestimento(0);
        this.setStatusInvestimento(false);
        this.setDataInicioInvestimento(new Date());
        this.setDataResgateInvestimento(new Date());
        this.setDescricaoInvestimento("Indefinido");
    }

    // Getters and Setters
    public int getIdInvestimento() {
        return idInvestimento;
    }

    public void setIdInvestimento(int idInvestimento) {
        this.idInvestimento = idInvestimento;
    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public double getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }

    public Date getDataInicioInvestimento() {
        return dataInicioInvestimento;
    }

    public void setDataInicioInvestimento(Date dataInicioInvestimento) {
        this.dataInicioInvestimento = dataInicioInvestimento;
    }

    public Date getDataResgateInvestimento() {
        return dataResgateInvestimento;
    }

    public void setDataResgateInvestimento(Date dataResgateInvestimento) {
        this.dataResgateInvestimento = dataResgateInvestimento;
    }

    public String getDescricaoInvestimento() {
        return descricaoInvestimento;
    }

    public void setDescricaoInvestimento(String descricaoInvestimento) {
        this.descricaoInvestimento = descricaoInvestimento;
    }

    public boolean getStatusInvestimento() {
        return statusInvestimento;
    }

    public void setStatusInvestimento(boolean statusInvestimento) {
        this.statusInvestimento = statusInvestimento;
    }
}

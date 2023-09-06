package fintechJava;

import java.util.ArrayList;
import java.util.List;

public class Empresa extends Endereco{
    private int idEmpresa;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private double capitalEmpresa;
    private String telefone;
    private String email;
    private double faturamento;

    // Construtor vazio
    public Empresa(){}

    // Construtor com parametros
    public Empresa(int idPais, String nomePais, int idEstado, String uf, String nomeEstado, int idCidade, String nomeCidade, int idEndereco, String logradouro, String bairro, String numero, String cep, int idEmpresa, String razaoSocial, String nomeFantasia, String cnpj, double capitalEmpresa, String telefone, String email, double faturamento) {
        super(idPais, nomePais, idEstado, uf, nomeEstado, idCidade, nomeCidade, idEndereco, logradouro, bairro, numero, cep);
        this.idEmpresa = idEmpresa;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.capitalEmpresa = capitalEmpresa;
        this.telefone = telefone;
        this.email = email;
        this.faturamento = faturamento;
    }

    // Getters and Setters
    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getCapitalEmpresa() {
        return capitalEmpresa;
    }

    public void setCapitalEmpresa(double capitalEmpresa) {
        this.capitalEmpresa = capitalEmpresa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }
}

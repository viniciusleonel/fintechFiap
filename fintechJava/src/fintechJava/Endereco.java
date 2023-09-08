package fintechJava;

import java.util.ArrayList;
import java.util.List;

public class Endereco extends Cidade{
    private String nomeEndereco;
    private int idEndereco;
    private String logradouro;
    private String bairro;
    private String numero;
    private String cep;

    // Atributo tipo lista que recebe classe endereco e cria uma array
    private List<Endereco> enderecosList = new ArrayList<>();

    // Metodos
    public void exibirEndereco(){
        System.out.println("ID do Endereço: " + this.getIdEndereco());
        System.out.println("Nome do Endereço: " + this.getNomeEndereco());
        System.out.println("Rua: " + this.getLogradouro());
        System.out.println("Número: " + this.getNumero());
        System.out.println("Bairro: " + this.getBairro());
        System.out.println("CEP: " + this.getCep());
        System.out.println("Cidade: " + this.getNomeCidade());
        System.out.println("Estado: " + this.getNomeEstado());
        System.out.println("País: " + this.getNomePais());
    }

    // Adiciona os enderecos na lista de enderecos
    public void adicionarEndereco(Endereco endereco) {
        this.enderecosList.add(endereco);
    }

    // Mostra os enderecos listados
    public void listarEnderecos(){
        for (Endereco endereco : enderecosList){
            System.out.println("===================");
            System.out.println("ID do Endereço: " + endereco.getIdEndereco());
            System.out.println("Nome do Endereço: " + endereco.getNomeEndereco());
            System.out.println("Rua: " + endereco.getLogradouro());
            System.out.println("Número: " + endereco.getNumero());
            System.out.println("Bairro: " + endereco.getBairro());
            System.out.println("CEP: " + endereco.getCep());
            System.out.println("Cidade: " + endereco.getNomeCidade());
            System.out.println("Estado: " + endereco.getNomeEstado());
            System.out.println("País: " + endereco.getNomePais());
        }
    }

    // Construtor básico
    public Endereco(){
        this.setNomeEndereco("Indefinido");
        this.setIdEndereco(0);
        this.setLogradouro("Indefinido");
        this.setBairro("Indefinido");
        this.setNumero("Indefinido");
        this.setCep("Indefinido");
    }

    // Construtor com parametros
    public Endereco(int idPais, String nomePais, int idEstado, String uf, String nomeEstado, int idCidade, String nomeCidade, int idEndereco, String logradouro, String bairro, String numero, String cep) {
        super(idPais, nomePais, idEstado, uf, nomeEstado, idCidade, nomeCidade);
        this.idEndereco = idEndereco;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
        this.cep = cep;
    }

    // Getters and Setters
    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNomeEndereco() {
        return nomeEndereco;
    }

    public void setNomeEndereco(String nomeEndereco) {
        this.nomeEndereco = nomeEndereco;
    }

}

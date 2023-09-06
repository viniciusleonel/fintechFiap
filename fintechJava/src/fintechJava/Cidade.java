package fintechJava;

public class Cidade extends Estado{
    private int idCidade;
    private String nomeCidade = "Indefinido";

    // Construtor vazio
    public Cidade(){}

    // Construtor com parametros
    public Cidade(int idPais, String nomePais, int idEstado, String uf, String nomeEstado, int idCidade, String nomeCidade) {
        super(idPais, nomePais, idEstado, uf, nomeEstado);
        this.idCidade = idCidade;
        this.nomeCidade = nomeCidade;
    }

    // Getters and Setters
    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
}

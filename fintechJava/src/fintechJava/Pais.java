package fintechJava;

public class Pais {
    private int idPais;
    private String nomePais = "Indefinido";

    // Construtor vazio
    public Pais() {}

    // Construtor com parametros
    public Pais(int idPais, String nomePais) {
        this.idPais = idPais;
        this.nomePais = nomePais;
    }

    // Getters and Setters
    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }
}

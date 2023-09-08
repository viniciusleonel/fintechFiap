package fintechJava;

public class Estado extends Pais{
    private int idEstado;
    private String uf;
    private String nomeEstado;

    // Construtor básico
    public Estado() {
        this.setIdEstado(0);
        this.setUf("Indefinido");
        this.setNomeEstado("Indefinido");
    }

    // Construtor com parametros
    public Estado(int idPais, String nomePais, int idEstado, String uf, String nomeEstado) {
        super(idPais, nomePais);
        this.idEstado = idEstado;
        this.uf = uf;
        this.nomeEstado = nomeEstado;
    }

    // Getters and Setters
    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }
}

package fintechJava;

public class Empresa extends Endereco{
    private int idEmpresa;
    private String razaoSocial = "Indefinido";
    private String nomeFantasia = "Indefinido";
    private String cnpjEmpresa = "Indefinido";
    private double capitalEmpresa;
    private String telefoneEmpresa = "Indefinido";
    private String emailEmpresa = "Indefinido";
    private double faturamentoEmpresa;
    private Conta contaEmpresa;

    public void exibirEmpresa(){
        System.out.println("===============");
        System.out.println("Id: " + this.getIdEmpresa());
        System.out.println("Razão Social: " + this.getRazaoSocial());
        System.out.println("Nome Fantasia: " + this.getNomeFantasia());
        System.out.println("Cnpj: " + this.getCnpjEmpresa());
        System.out.println("Telefone: " + this.getTelefoneEmpresa());
        System.out.println("Email: " + this.getEmailEmpresa());
        System.out.println("Faturamento: " + this.getFaturamentoEmpresa());
        contaEmpresa.exibirConta();
    }

    // Construtor vazio
    public Empresa(){}

    // Construtor com parametros
    public Empresa(int idPais, String nomePais, int idEstado, String uf, String nomeEstado, int idCidade, String nomeCidade, int idEndereco, String logradouro, String bairro, String numero, String cep, int idEmpresa, String razaoSocial, String nomeFantasia, String cnpjEmpresa, double capitalEmpresa, String telefoneEmpresa, String emailEmpresa, double faturamentoEmpresa) {
        super(idPais, nomePais, idEstado, uf, nomeEstado, idCidade, nomeCidade, idEndereco, logradouro, bairro, numero, cep);
        this.idEmpresa = idEmpresa;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpjEmpresa = cnpjEmpresa;
        this.capitalEmpresa = capitalEmpresa;
        this.telefoneEmpresa = telefoneEmpresa;
        this.emailEmpresa = emailEmpresa;
        this.faturamentoEmpresa = faturamentoEmpresa;
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

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public double getCapitalEmpresa() {
        return capitalEmpresa;
    }

    public void setCapitalEmpresa(double capitalEmpresa) {
        this.capitalEmpresa = capitalEmpresa;
    }

    public String getTelefoneEmpresa() {
        return telefoneEmpresa;
    }

    public void setTelefoneEmpresa(String telefoneEmpresa) {
        this.telefoneEmpresa = telefoneEmpresa;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public double getFaturamentoEmpresa() {
        return faturamentoEmpresa;
    }

    public void setFaturamentoEmpresa(double faturamentoEmpresa) {
        this.faturamentoEmpresa = faturamentoEmpresa;
    }

    public Conta getContaEmpresa() {
        return contaEmpresa;
    }

    public void setContaEmpresa(Conta contaEmpresa) {
        this.contaEmpresa = contaEmpresa;
    }
}

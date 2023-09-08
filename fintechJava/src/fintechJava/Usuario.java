package fintechJava;

public class Usuario extends Endereco{
    private int idUsuario;
    private String nomeUsuario;
    private String loginUsuario;
    private String emailUsuario;
    private String senhaUsuario;
    private Conta contaUsuario;

    public void exibirUsuario(){
        System.out.println("===============");
        System.out.println("Id: " + this.getIdUsuario());
        System.out.println("Nome: " + this.getNomeUsuario());
        System.out.println("Login: " + this.getLoginUsuario());
        System.out.println("Email: " + this.getEmailUsuario());
        System.out.println("Senha: " + this.getSenhaUsuario());
        contaUsuario.exibirConta();
    }

    // Construtor básico
    public Usuario(){
        this.setIdUsuario(0);
        this.setNomeUsuario("Indefinido");
        this.setLoginUsuario("Indefinido");
        this.setEmailUsuario("Indefinido");
        this.setSenhaUsuario("Indefinido");
    }

    // Construtor com parametros
    public Usuario(int idPais, String nomePais, int idEstado, String uf, String nomeEstado, int idCidade, String nomeCidade, int idEndereco, String logradouro, String bairro, String numero, String cep, int idUsuario, String nomeUsuario, String loginUsuario, String emailUsuario, String senhaUsuario){
        super(idPais, nomePais, idEstado, uf, nomeEstado, idCidade, nomeCidade, idEndereco, logradouro, bairro, numero, cep);
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.loginUsuario = loginUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
    }


    // Getters and Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public Conta getContaUsuario() {
        return contaUsuario;
    }

    public void setContaUsuario(Conta contaUsuario) {
        this.contaUsuario = contaUsuario;
    }
}

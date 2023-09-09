package fintechJava;

public class Teste {
    public static void main(String[] args) {
        // Cria um usuario e uma conta, linka a conta ao usuario e depois exibe
        Usuario user1 = new Usuario();
        Conta contaUsuario1 = new Conta();

        user1.setNomeUsuario("Lucas");

        contaUsuario1.setIdConta(12345);
        contaUsuario1.setStatusConta(true);

        user1.setContaUsuario(contaUsuario1);
        user1.exibirUsuario();

        System.out.println("----------------------------------------");

        // Cria uma empresa e uma conta, linka a conta a empresa e depois exibe
        Empresa empresa1 = new Empresa();
        Conta contaEmpresa = new Conta();

        empresa1.setNomeFantasia("DinDinThink");
        empresa1.setFaturamentoEmpresa(1000000);

        contaEmpresa.setSaldoConta(-5000);
        contaEmpresa.setNumeroConta("6969");

        empresa1.setContaEmpresa(contaEmpresa);
        empresa1.exibirEmpresa();

        System.out.println("----------------------------------------");

        // Cria uma empresa e uma array que vai armazenar uma lista de empresas
        Empresa empresa2 = new Empresa();
        Empresa listaEmpresas = new Empresa();

        empresa2.setIdEmpresa(456);
        empresa2.setNomeFantasia("Fintech");

        listaEmpresas.adicionarEmpresa(empresa1, empresa2);
//        listaEmpresas.adicionarEmpresa(empresa2);
        listaEmpresas.listarEmpresas();

        System.out.println("----------------------------------------");

        // Cria um endereco
        Endereco end = new Endereco();
        end.setBairro("Centro");
        end.setNumero("449");
        end.setLogradouro("Rua nossa senhora");
        end.exibirEndereco();
        end.setIdCidade(321);
        end.setNomeCidade("Guarulhos");

        System.out.println("----------------------------------------");

        // Cria uma empresa e linka dois endereços na empresa dentro de uma array
        Empresa minhaEmpresa = new Empresa();
        Endereco ender = new Endereco();
        Endereco ender2 = new Endereco();

        ender.setNomeEndereco("Mãe");
        ender.setNomeCidade("Franca");
        ender.setLogradouro("Rua Bruno Cilurzo");

        ender2.setNomeEndereco("Casa");
        ender2.setNomeCidade("Gru");
        ender2.setLogradouro("Rua Nossa Senhora");

        minhaEmpresa.adicionarEndereco(ender);
        minhaEmpresa.adicionarEndereco(ender2);

        minhaEmpresa.listarEnderecos();

    }
}

package fintechJava;

public class Teste {
    public static void main(String[] args) {
        Usuario user1 = new Usuario();
        user1.setNomeUsuario("Lucas");
        Conta contaUsuario1 = new Conta();
        contaUsuario1.setIdConta(12345);
        contaUsuario1.setStatusConta(true);
        user1.setContaUsuario(contaUsuario1);
        user1.exibirUsuario();

        Empresa empresa1 = new Empresa();
        empresa1.setNomeFantasia("DinDinThink");
        empresa1.setFaturamentoEmpresa(1000000);
        Conta contaEmpresa = new Conta();
        contaEmpresa.setSaldoConta(-5000);
        contaEmpresa.setNumeroConta("6969");
        empresa1.setContaEmpresa(contaEmpresa);
        empresa1.exibirEmpresa();


//        Endereco end = new Endereco();
//        end.setBairro("Centro");
//        end.setNumero("449");
//        end.setLogradouro("Rua nossa senhora");
//        end.exibirEndereco();
//        end.setIdCidade(321);
//        end.setNomeCidade("Guarulhos");
//
//        Empresa minhaEmpresa = new Empresa();
//
//        Endereco ender = new Endereco();
//        Endereco ender2 = new Endereco();
//        ender.setNomeEndereco("Mãe");
//        ender.setNomeCidade("Franca");
//        ender.setLogradouro("Rua Bruno Cilurzo");
//
//        ender2.setNomeEndereco("Casa");
//        ender2.setNomeCidade("Gru");
//        ender2.setLogradouro("Rua Nossa Senhora");
//
//        minhaEmpresa.adicionarEndereco(ender);
//        minhaEmpresa.adicionarEndereco(ender2);
//
//        minhaEmpresa.listarEnderecos();

    }
}

package fintechJava;

public class Teste {
    public static void main(String[] args) {
        Endereco end = new Endereco();
        end.setBairro("Centro");
        end.setNumero("449");
        end.setLogradouro("Rua nossa senhora");
        end.exibirEndereco();
        end.setIdCidade(321);
        end.setNomeCidade("Guarulhos");

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
package main;

import model.*;

public class Principal {

    public static void main(String[] args) {

        System.out.println("===== TESTE DO CAMINHAO =====");

        // Criando um caminhão
        Caminhao caminhao = new Caminhao("ABC1234",500.0,6);

        // Usando getters
        System.out.println("Placa: " + caminhao.getPlaca());
        System.out.println("Capacidade: " + caminhao.getCapacidade());
        System.out.println("Eixos: " + caminhao.getEixos());

        // Modificando os dados através dos setters
        caminhao.setPlaca("DEF5678");
        caminhao.setCapacidade(800.0);
        caminhao.setEixos(8);

        System.out.println("\nDepois da alteração:");
        System.out.println("Placa: " + caminhao.getPlaca());
        System.out.println("Capacidade: " + caminhao.getCapacidade());
        System.out.println("Eixos: " + caminhao.getEixos());

        // Testando uma capacidade inválida
        System.out.println("\nTentando colocar capacidade inválida:");
        caminhao.setCapacidade(-500.0);

        // Verificando que o valor anterior continua
        System.out.println("Capacidade atual: " + caminhao.getCapacidade());


        System.out.println("\n===== TESTE DO PACOTE =====");

        // Criando um pacote
        Pacote pacote = new Pacote("BR999",10.5,"Pendente");

        // Usando getters
        System.out.println("Código: " + pacote.getCodigo());
        System.out.println("Peso: " + pacote.getPeso());
        System.out.println("Status: " + pacote.getStatus());

        // Alterando os dados
        pacote.setCodigo("BR1000");
        pacote.setPeso(15.0);

        // Alterando o status através do método
        pacote.mudarStatus("Em transporte");

        System.out.println("\nDepois da alteração:");
        System.out.println("Código: " + pacote.getCodigo());
        System.out.println("Peso: " + pacote.getPeso());
        System.out.println("Status: " + pacote.getStatus());

        // Testando peso inválido
        System.out.println("\nTentando colocar peso inválido:");
        pacote.setPeso(-10.0);

        System.out.println("Peso atual: " + pacote.getPeso());


        System.out.println("\n===== TESTE DA ROTA COM CAMINHAO =====");

        // Criando uma rota usando o caminhão
        Rota rotaCaminhao = new Rota(pacote,caminhao);

        // Realizando a entrega
        rotaCaminhao.realizarEntrega();


        System.out.println("\n===== TESTE DA MOTO =====");

        // Criando uma moto
        Moto moto = new Moto("XYZ9876",30.0,true);

        System.out.println("Placa: " + moto.getPlaca());
        System.out.println("Capacidade: " + moto.getCapacidade());
        System.out.println("Possui baú: " + moto.isPossuiBau());

        // Alterando dados da moto
        moto.setPlaca("XYZ1111");
        moto.setCapacidade(40.0);
        moto.setPossuiBau(false);

        System.out.println("\nDepois da alteração:");
        System.out.println("Placa: " + moto.getPlaca());
        System.out.println("Capacidade: " + moto.getCapacidade());
        System.out.println("Possui baú: " + moto.isPossuiBau());


        System.out.println("\n===== TESTE DA ROTA COM MOTO =====");

        // A mesma Rota aceita Moto porque Moto é um Veiculo
        Rota rotaMoto = new Rota(pacote,moto);

        rotaMoto.realizarEntrega();


        System.out.println("\n===== TESTE DE VALIDACAO =====");

        // Testando placa vazia
        System.out.println("\nTentando colocar placa vazia:");
        moto.setPlaca("");

        // Testando eixos inválidos
        System.out.println("\nTentando colocar quantidade de eixos inválida:");
        caminhao.setEixos(0);

        // Testando código vazio
        System.out.println("\nTentando colocar código vazio:");
        pacote.setCodigo("");

        // Testando status vazio
        System.out.println("\nTentando colocar status vazio:");
        pacote.setStatus("");

        System.out.println("\n===== TESTE FINAL =====");

        System.out.println("Caminhão:");
        System.out.println("Placa: " + caminhao.getPlaca());
        System.out.println("Capacidade: " + caminhao.getCapacidade());
        System.out.println("Eixos: " + caminhao.getEixos());

        System.out.println("\nPacote:");
        System.out.println("Código: " + pacote.getCodigo());
        System.out.println("Peso: " + pacote.getPeso());
        System.out.println("Status: " + pacote.getStatus());

        System.out.println("\nMoto:");
        System.out.println("Placa: " + moto.getPlaca());
        System.out.println("Capacidade: " + moto.getCapacidade());
        System.out.println("Possui baú: " + moto.isPossuiBau());
    }
}

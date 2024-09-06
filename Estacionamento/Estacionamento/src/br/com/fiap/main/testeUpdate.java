package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;

public class testeUpdate {

    public static void main(String[] args) {

        Connection con = ConnectionFactory.abrirConexao();

        Carro carro = new Carro();
        //carro.setPlaca("JKK1900");
        //carro.setCor("Prata");
        //carro.setDescricao("Nissan march");

        //CarroDAO carroDAO = new CarroDAO(con);
        //System.out.println(carroDAO.alterar(carro));


        Cliente cliente = new Cliente();
        cliente.setNomeCliente("Anya");
        cliente.setPlaca("JK0001");

        ClienteDAO clienteDAO = new ClienteDAO(con);
        System.out.println(clienteDAO.alterar(cliente));

        ConnectionFactory.fecharConexão(con);

    }

}

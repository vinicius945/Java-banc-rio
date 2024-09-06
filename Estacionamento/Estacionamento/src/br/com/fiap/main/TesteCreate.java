package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;

public class TesteCreate {

    public static void main(String[] args) {

        Connection con = ConnectionFactory.abrirConexao();

        Carro carro = new Carro();
        //carro.setPlaca("JK0004");
        //carro.setCor("Preto");
        //carro.setDescricao("Ferrari");

        //CarroDAO carroDAO = new CarroDAO(con);
        //System.out.println(carroDAO.inserir(carro));


        Cliente cliente = new Cliente();
        cliente.setIdCliente(3);
        cliente.setNomeCliente("Caio");
        cliente.setPlaca("JK0003");

        ClienteDAO clienteDAO = new ClienteDAO(con);
        System.out.println(clienteDAO.inserir(cliente));

        ConnectionFactory.fecharConexão(con);

    }

}

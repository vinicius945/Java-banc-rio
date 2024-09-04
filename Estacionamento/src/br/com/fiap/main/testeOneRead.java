package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

import java.sql.Connection;

public class testeOneRead {
    public static void main(String[] args) {

        Connection con = ConnectionFactory.abrirConexao();

        Carro carro = new Carro();
        carro.setPlaca("JKK1901");

        CarroDAO carroDAO = new CarroDAO(con);
        carro = carroDAO.listarUm(carro);
        if (carro != null) {
            System.out.println("Placa: " + carro.getPlaca());
            System.out.println("Cor: " + carro.getCor());
            System.out.println("Descricao: " + carro.getDescricao());
        }



        ConnectionFactory.fecharConexão(con);

    }

}

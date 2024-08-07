package br.com.fiap.main;

import br.com.fiap.bean.Equipe;

import javax.swing.*;

public class UsaEquipe {
    public static void main(String[] args) {
        Equipe grupo;
        String aux, nome, escolha = "sim";
        String[] integrantes;
        int qtde;
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome da equipe");
                aux = JOptionPane.showInputDialog("Quantidade de integrantes");
                qtde = Integer.parseInt(aux);
                integrantes = new String[qtde];
                for (int i = 0; i < integrantes.length; i++) {
                    integrantes[i] = JOptionPane.showInputDialog("Integrantes " + (i + 1) + ": ");
                }
                grupo = new Equipe(nome, integrantes);
                grupo.listaEquipe();
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim do Programa");
    }
}

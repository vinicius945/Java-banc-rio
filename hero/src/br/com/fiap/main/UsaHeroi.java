package br.com.fiap.main;

import br.com.fiap.bean.Equipe;

import javax.swing.*;
import java.util.Arrays;

public class UsaHeroi {
    public static void main(String[] args) {
        Equipe oreh;
        String aux, nome, idsecreta, escolha = "sim";
        String[] poderes, fraquezas;
        int qtde;
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome do heroi: ");
                idsecreta = JOptionPane.showInputDialog("Digite a identidade secreta do heroi: ");

                qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de poderes do heroi: "));
                poderes = new String[qtde];
                for (int i = 0; i < qtde; i++) {
                    poderes[i] = JOptionPane.showInputDialog("Digite o poder " + (i + 1) + " do herói");
                }

                qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de fraquezas do herói: "));
                fraquezas = new String[qtde];
                for (int i = 0; i < qtde; i++) {
                    fraquezas[i] = JOptionPane.showInputDialog("Digite a fraqueza " + (i + 1) + " do herói: ");
                }

                oreh = new Equipe(nome, idsecreta, Arrays.asList(poderes), Arrays.asList(fraquezas));
                oreh.listaEquipe();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: A quantidade de poderes e fraquezas devem ser um número inteiro.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
            escolha = JOptionPane.showInputDialog("Deseja cadastrar outro herói? (sim/não)");
        }
    }
}

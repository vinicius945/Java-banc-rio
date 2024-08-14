package br.com.fiap.main;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class SorteioHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numeroSorteados = new HashSet<Integer>();
        Random random = new Random();
        do{
            JOptionPane.showMessageDialog(null, "Confira o resultado do sorteio da Loteria", "Loteria Premiada", JOptionPane.WARNING_MESSAGE);
            while (numeroSorteados.size() < 6) {
                int numero = random.nextInt(59) + 1;
                numeroSorteados.add(numero);
            }
            List<Integer> resultadoDoSorteio = new ArrayList<Integer>(numeroSorteados);
            Collections.sort(resultadoDoSorteio);
            JOptionPane.showMessageDialog(null, "Os números sorteados são\n" + resultadoDoSorteio);
            numeroSorteados.clear();

        } while(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa");
    }
}

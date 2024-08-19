package br.com.fiap.main;

import br.com.fiap.bean.Calculadora;

import javax.swing.*;
import javax.swing.JOptionPane;


public class UsaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

    String numero1Str = JOptionPane.showInputDialog("Digite o primeiro número: ");
    float numero1 = Float.parseFloat(numero1Str);
    calculadora.setNumero1(numero1);

    String numero2Str = JOptionPane.showInputDialog("Digite o segundo número: ");
    float numero2 = Float.parseFloat(numero2Str);
    calculadora.setNumero2(numero2);

    float resultadoAdicao = calculadora.adicao();
    float resultadoSubtracao = calculadora.subtracao();
    float resutadoMultiplicacao = calculadora.multiplicacao();
    float resultadoDivisao;

    try {
        resultadoDivisao = calculadora.divisao();
    } catch (ArithmeticException e) {
        JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        return;
    }
    String mensagem = "Resultados:\n";
    mensagem += "Adição: " + resultadoAdicao + "\n";
    mensagem += "Subtração: " + resultadoSubtracao + "\n";
    mensagem += "Multiplicação: " + resutadoMultiplicacao + "\n";
    mensagem += "Divisão: " + resultadoDivisao + "\n";

    JOptionPane.showMessageDialog(null, mensagem);
    }
}

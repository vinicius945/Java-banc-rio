package br.com.fiap.bean;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private String idsecreta;
    private List<String> poderes;
    private List<String> fraquezas;

    public Equipe() {
        this.poderes = new ArrayList<>();
        this.fraquezas = new ArrayList<>();
    }

    public Equipe(String nome, String idsecreta,  List<String> poderes, List<String> fraquezas) {
        this.nome = nome;
        this.idsecreta = idsecreta;
        this.poderes = poderes;
        this.fraquezas = fraquezas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdsecreta() {
        return idsecreta;
    }

    public void setIdsecreta(String idsecreta) {
        this.idsecreta = idsecreta;
    }

    public List<String> getPoderes() {
        return poderes;
    }

    public void  setPoderes(List<String> poderes) {
        this.poderes = poderes;
    }

    public List<String> getFraquezas() {
        return fraquezas;
    }

    public void setFraquezas(List<String> fraquezas) {
        this.fraquezas = fraquezas;
    }
    public void listaEquipe() {
        String exibe = "Nome do Heroi: " + nome + "\nIdentidade secreta: " + idsecreta + "\n";
        int cont = 1;
        exibe += "Poderes:\n";
        for (String poder: poderes) {
            exibe += cont + ": " + poder + "\n";
            cont++;
        }
        cont = 1;
        exibe += "Fraquezas\n";
        for (String fraqueza: fraquezas) {
            exibe += cont + ": " + fraqueza +"\n";
            cont++;
        }
        JOptionPane.showMessageDialog(null, exibe);
    }

}

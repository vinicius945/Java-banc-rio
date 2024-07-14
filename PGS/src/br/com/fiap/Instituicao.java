package br.com.fiap;

import java.util.Iterator;
import java.util.List;

public class Instituicao {
	private int IdInstituicao;
	private String nomeInstituicao;
	private String Descricao;
	private String Endereco;
	private String ContaBancaria;
	private List<String> projetos;
	
	
	public Instituicao(int idInstituicao, String nomeInstituicao, String descricao, String endereco,
			String contaBancaria) {
		IdInstituicao = idInstituicao;
		this.nomeInstituicao = nomeInstituicao;
		Descricao = descricao;
		Endereco = endereco;
		ContaBancaria = contaBancaria;
		this.projetos = projetos;
	}
	
	public int getIdInstituicao() {
		return IdInstituicao;
	}
	
	public void setIdInstituicao(int idInstituicao) {
		IdInstituicao = idInstituicao;
	}
	
	public String getNomeInstituicao() {
		return nomeInstituicao;
	}
	
	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}
	
	public String getDescricao() {
		return Descricao;
	}
	
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	
	public String getEndereco() {
		return Endereco;
	}
	
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
	public String getContaBancaria() {
		return ContaBancaria;
	}
	
	public void setContaBancaria(String contaBancaria) {
		ContaBancaria = contaBancaria;
	}
	
	public List<String> getProjetos() {
		return projetos;
	}
	
	public void setProjetos(List<String> projetos) {
		this.projetos = projetos;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID Instituicao: " + IdInstituicao + "\n" +
		"Nome da instituição: " + nomeInstituicao + "\n" +
		"Descrição: : " + Descricao + "\n" + "Endereço: " + Endereco + "\n" + 
		"Conta Bancária: " + ContaBancaria;
	}
	
	public static void ListarInstituicoes(List<Instituicao> instituicoes) {
		for (Instituicao instituicao : instituicoes) {
			System.out.println(instituicao);
			
		}
	}
}

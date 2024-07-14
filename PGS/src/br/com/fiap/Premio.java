package br.com.fiap;

import java.util.ArrayList;
import java.util.List;

public class Premio {
	private int IdPremio;
	private String nomePremio;
	private String pontosPremio;
	private String descricaoPremio;
	private String qtdPremio;
	private List<String> premios;

	
	
	public Premio(int idPremio, String nomePremio, String pontosPremio, String descricaoPremio, String qtdPremio) {
		IdPremio = idPremio;
		this.nomePremio = nomePremio;
		this.pontosPremio = pontosPremio;
		this.descricaoPremio = descricaoPremio;
		this.qtdPremio = qtdPremio;
		this.premios = new ArrayList<String>();
		
	}

	public int getIdPremio() {
		return IdPremio;
	}
	public void setIdPremio(int idPremio) {
		IdPremio = idPremio;
	}
	
	public String getNomePremio() {
		return nomePremio;
	}
	
	public void setNomePremio(String nomePremio) {
		this.nomePremio = nomePremio;
	}
	
	public String getDescricaoPremio() {
		return descricaoPremio;
	}
	
	public void setDescricaoPremio(String descricaoPremio) {
		this.descricaoPremio = descricaoPremio;
	}
	
	public String getQtdPremio() {
		return qtdPremio;
	}
	
	public void setPremios(List<String> premios) {
		this.premios = premios;
	}
	
	public String getPontosPremio() {
		return pontosPremio;
	}
	
	public void setPontosPremio(String pontosPremio) {
		this.pontosPremio = pontosPremio;
	}
	
	public List<String> getPremios() {
		return premios;
	}
	
	public void setQtdPremio(String qtdPremio) {
		this.qtdPremio = qtdPremio;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	//lista os prêmios
	public static void ListaPremio(List<Premio> Listapremio) {
		for (Premio premio : Listapremio) {
			System.out.println(premio);
			
		}
	}
	// Adiciona um prêmio
	public void adicionarPremio(String premio) {
		this.premios.add(premio);
	}
	
}

package br.com.fiap;

import java.time.LocalDateTime;

public class Doacoes {
	private int IdDoacoes;
	private LocalDateTime dataDoacoes;
	private Double valorDoacoes;
	private String metodoDePagamento;
	public Doacoes(int idDoacoes, LocalDateTime dataDoacoes, Double valorDoacoes, String metodoDePagamento) {
		IdDoacoes = idDoacoes;
		this.dataDoacoes = dataDoacoes;
		this.valorDoacoes = valorDoacoes;
		this.metodoDePagamento = metodoDePagamento;
	}
	
	public int getIdDoacoes() {
		return IdDoacoes;
	}
	
	public void setIdDoacoes(int idDoacoes) {
		IdDoacoes = idDoacoes;
	}
	
	public LocalDateTime getDataDoacoes() {
		return dataDoacoes;
	}
	
	public void setDataDoacoes(LocalDateTime dataDoacoes) {
		this.dataDoacoes = dataDoacoes;
	}
	
	public Double getValorDoacoes() {
		return valorDoacoes;
	}
	
	public void setValorDoacoes(Double valorDoacoes) {
		this.valorDoacoes = valorDoacoes;
	}
	
	public String getMetodoDePagamento() {
		return metodoDePagamento;
	}
	
	public void setMetodoDePagamento(String metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public void exibirDetalhesDoacao() {
		System.out.println("Id: " + IdDoacoes + "\n" + "Data: " + dataDoacoes + "\n" + "Valor: " + 
				valorDoacoes + "\n" + "Método de pagameto" + metodoDePagamento);
		
	}
	
	
}

	

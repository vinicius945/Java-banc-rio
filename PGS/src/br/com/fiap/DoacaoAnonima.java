package br.com.fiap;

import java.time.LocalDateTime;

public class DoacaoAnonima extends Doacoes{

	public DoacaoAnonima(int idDoacoes, LocalDateTime dataDoacoes, Double valorDoacoes, String metodoDePagamento) {
		super(idDoacoes, dataDoacoes, valorDoacoes, metodoDePagamento);
	}
	// Sobreescrita do método ExibirDetalhesDoacao
	 @Override
	public void exibirDetalhesDoacao() {
		// TODO Auto-generated method stub
		super.exibirDetalhesDoacao();
	}

}

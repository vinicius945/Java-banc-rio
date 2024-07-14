package br.com.fiap;

public class Feedbacks {
	
	private int IdFeedbacks;
	private int avaliacao;
	private String descricao;
	
	public Feedbacks(int idFeedbacks, int avaliacao, String descricao) {
		IdFeedbacks = idFeedbacks;
		this.avaliacao = avaliacao;
		this.descricao = descricao;
	}
	
	public int getIdFeedbacks() {
		return IdFeedbacks;
	}
	
	public void setIdFeedbacks(int idFeedbacks) {
		IdFeedbacks = idFeedbacks;
	}
	
	public int getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id Feedback: " + IdFeedbacks + "\n" +
				"Nota da avaliação: " + avaliacao + "\n" +
				"O seu comentário foi: " + descricao + "\n";
		
				
	}
	
	
	
}

package br.com.fiap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Usuario {
	private int IdUsuario;
	private String nome;
	private String email;
	private String senha;
	private String telefone;
	private int qtdDoacao;
	private List<String> metodoPagamento;
	
	
	
	
	
	
	
	public Usuario(int idUsuario, String nome, String email, String senha, String telefone, int qtdDoacao) {
		super();
		IdUsuario = idUsuario;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		this.qtdDoacao = qtdDoacao;
		this.metodoPagamento = new ArrayList<String>();
	}
	public int getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getQtdDoacao() {
		return qtdDoacao;
	}
	
	public void setQtdDoacao(int qtdDoacao) {
		this.qtdDoacao = qtdDoacao;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public List<String> getMetodoPagamento() {
		return metodoPagamento;
	}
	
	public void setMetodoPagamento(List<String> metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID Usuario: " + IdUsuario + "\n" +
		"Nome: " + nome + "\n" +
		"e-mail: " + email + "\n" + "Senha: " + senha + "\n" + 
		"Telefone: " + telefone + "\n" + "Quantidade de doações: " + qtdDoacao;
	}

	
	
	
	
	//login do usuário
	public boolean login(String email, String senha) {
		return this.email.equals(email) && this.senha.equals(senha);
	}
	
	//adiciona um método de pagamento
	public void adicionarMetodoPagamento(String metodo) {
		this.metodoPagamento.add(metodo);
	}
	
	//exibe o método de pagamento do usuário
	public void exibirMetodosPagamento() {
		System.out.println("Métodos de pagamento: ");
		for (String metodo : metodoPagamento ) {
			
			System.out.println(metodo);
			
		}
		
	}
	
	//atualiza o perfil do usuário
	
	public void atualizarPerfil(String nome, String email) {
		this.nome = nome;
		this.email = email;
		
	}
	//sobrecarga do método atualizar perfil
	public void atualizarPerfil(String nome, String senha, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
	}
	//consulta o lixo que foi retirado
	public String consultaLixoRetirado() {
		if (qtdDoacao > 0 && qtdDoacao <= 10) {
			return "Você já ajudou a retirar 11 Kg's de plástico do oceano!";
		}
		else {
			return "Obrigado por suas generosas doações, "
					+ "você está fazendo com uma grande contribuição com a preservação dos oceanos!";
		}
	}
	//Consulta o prêmio
	public String consultarPremio(List<Premio> premios, String nomePremio) {
		for (Premio premio : premios) {
			if (premio.getNomePremio().equals(nomePremio)) {
				return "ID: " + premio.getIdPremio() + "\n" +
		                   "Nome: " + premio.getNomePremio() + "\n" +
		                   "Pontos: " + premio.getPontosPremio() + "\n" +
		                   "Descrição: " + premio.getDescricaoPremio() + "\n" +
		                   "Quantidade: " + premio.getQtdPremio();
			}
		}
		return "Prêmio não encontrado";
	}
	
	
	
	
	
	
	
	
	
}
	
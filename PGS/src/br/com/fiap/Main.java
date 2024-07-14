package br.com.fiap;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int id_Usuario = 1;
		
		
		System.out.println("Seja bem-vindo(a), você irá fazer o cadastro do seu usuário!");
		System.out.println("Digite o seu nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite o seu email: ");
		String email = scan.nextLine();
		
		System.out.println("Digite o seu senha: ");
		String senha = scan.nextLine();
		
		System.out.println("Digite o seu telefone: ");
		String telefone = scan.nextLine();
		
		System.out.println("Digite a quantidade de doações que você irá realizar: ");
		int qtdDoacao = scan.nextInt();
		
		System.out.println("Dados salvos, tecle enter para adicionar o seu usuário");
		scan.nextLine();
		
		Usuario usuario = new Usuario(id_Usuario, nome, email, senha, telefone, qtdDoacao );
		
		System.out.println(usuario);
		scan.nextLine();
		
		System.out.println("Agora nos deixe um feedback!");
		
		int id_feedback = 1;
		
		System.out.println("Nos escreva um breve comentário: ");
		String descricao = scan.nextLine();
		
		System.out.println("Deixe uma nota de 0 a 10: ");
		int avaliacao = scan.nextInt();
		
		System.out.println("Dados salvos, tecle enter para adicionar a sua avalição!");
		scan.nextLine();
		
		Feedbacks feedback = new Feedbacks(id_feedback, avaliacao, descricao);
		
		System.out.println(feedback);
		scan.close();
		
		
		Usuario Eloy = new Usuario(01, "Matheus", "matheuzinreidelas20112@orkut.com", "trn", "40028922", 35);
		
		//validação e-mail e senha do método login
		System.out.println("login bem-sucedido: " + Eloy.login("matheuzinreidelas20112@orkut.com", "rn"));
		
		//utilizando o método adicionar pagamento e exibindo todos os métodos
		Eloy.adicionarMetodoPagamento("Cartão de Crédito");
		
		Eloy.adicionarMetodoPagamento("Cartão de Débito");
		
		Eloy.exibirMetodosPagamento();
		
		//Utilizando o método do atualizar perfil com sobrecarga
		Eloy.atualizarPerfil("novo nome", "novo e-mail");
		System.out.println(Eloy);
		
		Eloy.atualizarPerfil("nome com sobrecarga", "senha com sobrecarga", "email com sobrecarga", "telefone com sobrecarga");
		System.out.println(Eloy);
		
		
		//lista e consulta de prêmio
		List<Premio> premios = new ArrayList<Premio>();
		premios.add(new Premio(1, "Caneca", "100", "Uma caneca feita do lixo retirado dos oceanos", "20"));
		premios.add(new Premio(1, "Sofá", "1000", "Um sofá feito com os tecidos retirados dos mares", "30"));
		premios.add(new Premio(1, "Poltrona", "500", "Uma Poltrona feita do lixo retirado dos oceanos", "35"));
		
		String PremioConsultado = Eloy.consultarPremio(premios, "Poltrona");
		
		System.out.println("Prêmio encontrado: " + PremioConsultado);
		
		//utilizando o método consultaLixoRetirado
		System.out.println(Eloy.consultaLixoRetirado());
		
		// lista as instituições
		Instituicao teamsseas = new Instituicao(1, "teamseas", "projeto voltado para a preservação dos oceanos",
				"avenida teste 01", "122472MJ12");
		Instituicao O20 = new Instituicao(1, "O20", "projeto voltado para a preservação dos mares",
				"avenida teste 05", "1234864564MJ10");
		List<Instituicao> instituicoes = new ArrayList<Instituicao>();
		instituicoes.add(teamsseas);
		instituicoes.add(O20);
		
		Instituicao.ListarInstituicoes(instituicoes);
		
		//sobreescrita do método exibir
		Doacoes primeiraDoacao = new Doacoes(1, LocalDateTime.now(), 150.0, "pix");
		
		primeiraDoacao.exibirDetalhesDoacao();
		
		DoacaoAnonima primeiraDoacaoAnonima = new DoacaoAnonima(1, LocalDateTime.now(), 150.0, "pix");
		
		primeiraDoacaoAnonima.exibirDetalhesDoacao();
		
		
		
		
		
		
		
		
		
		System.out.println(Eloy);
		
		
		
		
		
	}

}

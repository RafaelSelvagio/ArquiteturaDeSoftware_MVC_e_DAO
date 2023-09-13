package controller;

import java.util.Scanner;

import dao.PlanetaDao;
import model.Planeta;
import view.PlanetaView;

public class PlanetaController {
	// Objeto planetaView do tipo da classe PlanetaView
	PlanetaView planetaView;
	
	// Objeto planetaDao do tipo da classe PlanetaDao
	PlanetaDao planetaDao;

	/*
	 * Método construtor da classe PlanetaController
	 */
	public PlanetaController() {
		/*
		 * Ao instanciar a classe PlanetaController, também criamos os objetos
		 * PlanetaView e PlanetaDao
		 */
		planetaView = new PlanetaView();
		planetaDao = new PlanetaDao();
	}

	/*
	 * Método inicializar não tem nenhum retorno, pois utiliza a palavra reservada void
	 * Método que inicia o sistema
	 */
	public void inicializar() {
		// Criação do objeto scan do tipo Scanner, vamos utilizar para ler as interações do usuário
		Scanner scan = new Scanner(System.in);
		
		// Invocamos o método apresentacao do objeto planetaView
		planetaView.apresentacao();

		// Váriavel do tipo inteiro, criada para servir de controle da estrutura de repetição while
		int cont = -1;

		/*
		 * Estrutura de repetição while, onde o trecho de código será repetido enquanto a variável 
		 * cont for diferente de 1
		 */
		while (cont != 0) {
			// Invoca o método menu do objeto planetaView
			planetaView.menu();
			
			// Lê o número inteiro que o usuário digitou para selecionar uma opção
			cont = scan.nextInt();
			
			// Limpa o scanner
			scan.nextLine();

			/*
			 * Estrutura condicional if
			 * Verifica se a opção escolhida pelo usuário é igual a 1
			 */
			if (cont == 1) {
				// Invoca o método adicionaNome do objeto planetaView
				planetaView.adicionaNome();
				
				/*
				 * Cria uma variável planeta do tipo String e recebe o texto digitado 
				 * pelo usuário no console através do objeto scan utilizando o método
				 * nextLine
				 */
				String nomePlaneta = scan.nextLine();
				
				// Cria um objeto planeta passando o nome do planeta no construtor
				Planeta planeta = new Planeta(nomePlaneta);
				
				// Adiciona o novo planeta a lista utilizando o método setListaPlanetas do objeto planetaDao
				planetaDao.setListaPlanetas(planeta);

			} 
			
			/*
			 * Estrutura condicional else-if
			 * Verifica se a opção escolhida pelo usuário é igual a 2
			 */
			else if (cont == 2) {
				/*
				 * Obtem a lista de planetas utilizando o método getListaPlanetas do objeto planetaDao
				 * (nossa classe que representa o banco de dados) e já passa a lista como parâmetro para
				 * o método exibirPlanetas do objeto planetaView
				 */
				planetaView.exibirPlanetas(planetaDao.getListaPlanetas());
			} 
			
			/*
			 * Estrutura condicional else-if
			 * Verifica se a opção escolhida pelo usuário é igual a 0
			 */
			else if (cont == 0) {
				// Invoca o método sairDoSistema do objeto planetaView
				planetaView.sairDoSistema();
			} 
			
			/*
			 * Estrutura condicional else
			 * Se o usuário não selecionou uma opção válida, o sistema entrará na opção else
			 */
			else {
				// Invoca o método opcaoInvalida do objeto planetaView
				planetaView.opcaoInvalida();
			}

		}
	}

}

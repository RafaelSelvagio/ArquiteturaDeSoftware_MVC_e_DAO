package view;

import java.util.ArrayList;

import model.Planeta;

public class PlanetaView {
	
	/*
	 * M�todo listaPlaneta n�o tem retorno, por isso utiliza a palavra reservada void.
	 * O m�todo recebe por par�metro a lista de planetas
	 */
	public void listaPlaneta(ArrayList<Planeta> listaDePlanetas) {
		// Come�a a exibi��o dos planetas escrevendo qual informa��o ser� exibida
		System.out.println("=== Lista de paises ===");
		System.out.println("=======================");
		
		/*
		 * Estrutura condicional if-else
		 * Utiliza o objeto listaDePlanetas e invoca o m�todo isEmpty, que retorna
		 * true ou false (verdadeiro ou falso) para a pergunta: a lista est� vazia?
		 */
		if(listaDePlanetas.isEmpty()) {
			// Para lista vazia, exibe no console uma mensagem mostrando que a lista est� vazia
			System.out.println("\nN�o h� pa�ses na lista!!!\n");
			System.out.println("=======================\n");
		} 
		
		/*
		 * Estrutura condicional if-else
		 * Para o caso da lista n�o estar vazia, o sistema executar� as instru��es do bloco else
		 */
		else {
			/*
			 * For diferente, conhecido como foreach, recebe a lista como par�metro
			 */
			for(Planeta planeta : listaDePlanetas) {
				// Escreve no console o nome do planeta, utilizando o objeto planeta e m�todo getNome
				System.out.println("\nNome: " + planeta.getNome() + "\n");
			}
			
			// Finaliza a exibi��o da lista
			System.out.println("=======================");
		}
	}
	
	/*
	 * M�todo menuPlaneta n�o tem retorno, por isso utiliza a palavra reservada void
	 * Exibe as op��es de menu do sistema
	 */
	public void menuPlaneta() {
		System.out.println("=== Menu ===");
		System.out.println("1. Cadastrar planeta");
		System.out.println("2. Exibir lista de planetas");
		System.out.println("0. Sair");
		System.out.println("Escolha uma op��o: ");
	}
}

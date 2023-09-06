package view;

import java.util.ArrayList;

import model.Planeta;

public class PlanetaView {
	
	/*
	 * Método listaPlaneta não tem retorno, por isso utiliza a palavra reservada void.
	 * O método recebe por parâmetro a lista de planetas
	 */
	public void listaPlaneta(ArrayList<Planeta> listaDePlanetas) {
		// Começa a exibição dos planetas escrevendo qual informação será exibida
		System.out.println("=== Lista de paises ===");
		System.out.println("=======================");
		
		/*
		 * Estrutura condicional if-else
		 * Utiliza o objeto listaDePlanetas e invoca o método isEmpty, que retorna
		 * true ou false (verdadeiro ou falso) para a pergunta: a lista está vazia?
		 */
		if(listaDePlanetas.isEmpty()) {
			// Para lista vazia, exibe no console uma mensagem mostrando que a lista está vazia
			System.out.println("\nNão há países na lista!!!\n");
			System.out.println("=======================\n");
		} 
		
		/*
		 * Estrutura condicional if-else
		 * Para o caso da lista não estar vazia, o sistema executará as instruções do bloco else
		 */
		else {
			/*
			 * For diferente, conhecido como foreach, recebe a lista como parâmetro
			 */
			for(Planeta planeta : listaDePlanetas) {
				// Escreve no console o nome do planeta, utilizando o objeto planeta e método getNome
				System.out.println("\nNome: " + planeta.getNome() + "\n");
			}
			
			// Finaliza a exibição da lista
			System.out.println("=======================");
		}
	}
	
	/*
	 * Método menuPlaneta não tem retorno, por isso utiliza a palavra reservada void
	 * Exibe as opções de menu do sistema
	 */
	public void menuPlaneta() {
		System.out.println("=== Menu ===");
		System.out.println("1. Cadastrar planeta");
		System.out.println("2. Exibir lista de planetas");
		System.out.println("0. Sair");
		System.out.println("Escolha uma opção: ");
	}
}

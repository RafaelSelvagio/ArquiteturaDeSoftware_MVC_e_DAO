package view;

import java.util.List;

import model.Planeta;

public class PlanetaView {
	/*
	 * Método apresentação não tem retorno, pois utiliza a palavra reservada void
	 * Método utilizado na inicialização do sistema, exibe uma mensagem de boas vindas
	 */
	public void apresentacao() {
		System.out.println("Seja bem vindo ao mais recente cadastro espacial!");
	}

	/*
	 * Método menu não tem retorno, pois utiliza a palavra reservada void
	 * Método que representa o menu do sistema
	 */
	public void menu() {
		System.out.println("\n1. Adicionar planeta :)");
		System.out.println("2. Exibir planeta");
		System.out.println("0. Sair do sistema");
		System.out.print("\nEscolha uma opção: ");
	}

	/*
	 * Método opcaoInvalida não tem retorno, pois utiliza a palavra reservada void
	 * Método que exibe uma mensagem quando uma opção inválida é selecionada
	 */
	public void opcaoInvalida() {
		System.out.println("\nOpção invalida tente novamente.");
	}

	/*
	 * Método adicionaNome não tem retorno, pois utiliza a palavra reservada void
	 * Método que exibe mensagem informativa para adicionar um planeta a lista
	 */
	public void adicionaNome() {
		System.out.println("\nDigite o nome do planeta: ");
	}

	/*
	 * Método exibirPlanetas não tem retorno, pois utiliza a palavra reservada void
	 * Método que exibe a lista de planetas
	 */
	public void exibirPlanetas(List<Planeta> listaPlaneta) {
		for (Planeta planeta : listaPlaneta) {
			System.out.println("-Nome: " + planeta.getNome());
		}
	}

	/*
	 * Método sairDoSistema não tem retorno, pois utiliza a palavra reservada void
	 * Método que exibe uma mensagem de saída do sistema
	 */
	public void sairDoSistema() {
		System.out.println("\nO sistema foi encerrado, volte logo.");
	}
}

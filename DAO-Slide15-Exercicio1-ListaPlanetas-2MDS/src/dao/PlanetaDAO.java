package dao;

import java.util.ArrayList;

import model.Planeta;

public class PlanetaDAO {
	/* 
	 * A camada de dados, � respons�vel apenas por manipular o dados, nesse momento, 
	 * estamos simulando um banco de dados, criando o ArrayList (lista em mem�ria)
	 * para ser nossa base de dados
	 */
	private ArrayList<Planeta> listaDePlanetas;

	/*
	 * Construtor de dados.
	 * Ao criar o classe, devemos instanciar nossa lista
	 */
	public PlanetaDAO() {
		// Cria uma nova lista, ou seja, instancia uma lista no atributo listaDePlanetas
		listaDePlanetas = new ArrayList<>();
	}
	
	/*
	 * M�todo getListaDePlanetas retorna a listaDePlanetas
	 */
	public ArrayList<Planeta> getListaDePlanetas() {
		// Retorna a lista de planetas
		return listaDePlanetas;
	}

	/*
	 * M�todo adicionaPlaneta n�o tem retorno, por isso utiliza a palavra reservada void
	 * O m�todo recebe um objeto do tipo planeta como par�metro.
	 */
	public void adicionaPlaneta(Planeta planeta) {
		// Adiciona o planeta a lista, ou seja, ao objeto do tipo ArrayList
		listaDePlanetas.add(planeta);
	}
}

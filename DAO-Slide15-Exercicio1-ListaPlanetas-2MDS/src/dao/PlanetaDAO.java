package dao;

import java.util.ArrayList;

import model.Planeta;

public class PlanetaDAO {
	/* 
	 * A camada de dados, é responsável apenas por manipular o dados, nesse momento, 
	 * estamos simulando um banco de dados, criando o ArrayList (lista em memória)
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
	 * Método getListaDePlanetas retorna a listaDePlanetas
	 */
	public ArrayList<Planeta> getListaDePlanetas() {
		// Retorna a lista de planetas
		return listaDePlanetas;
	}

	/*
	 * Método adicionaPlaneta não tem retorno, por isso utiliza a palavra reservada void
	 * O método recebe um objeto do tipo planeta como parâmetro.
	 */
	public void adicionaPlaneta(Planeta planeta) {
		// Adiciona o planeta a lista, ou seja, ao objeto do tipo ArrayList
		listaDePlanetas.add(planeta);
	}
}

package dao;

import java.util.ArrayList;
import java.util.List;

import model.Planeta;

public class PlanetaDao {
	// Atributo do tipo lista que armazenará objetos do tipo Planeta
	private List<Planeta> listaPlanetas;

	/*
	 * Método construtor da classe PlanetaDao
	 */
	public PlanetaDao() {
		// Ao criar a classe planetaDao, também criamos o objeto da lista
		listaPlanetas = new ArrayList<>();
	}

	/*
	 * Método getListaPlanetas tem um retorno do tipo List
	 * Método que retorna a lista de planetas
	 */
	public List<Planeta> getListaPlanetas() {
		return listaPlanetas;
	}

	/*
	 * Método setListaPlanetas não tem retorno, pois utiliza a palavra reservada void
	 * Método que adiciona planetas a lista
	 */
	public void setListaPlanetas(Planeta planeta) {
		this.listaPlanetas.add(planeta);
	}

}

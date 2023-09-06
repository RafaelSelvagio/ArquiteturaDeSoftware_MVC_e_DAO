package controller;

import dao.PlanetaDAO;
import model.Planeta;
import view.PlanetaView;

public class PlanetaController {
	/*
	 * O controller trabalha entre as camadas de dados, visualização e modelo,
	 * sendo assim, criamos os objetos da camada de view e dados
	 */
	private PlanetaView planetaView;
	private PlanetaDAO planetaDAO;

	/*
	 * Construtor da classe PlanetaController
	 */
	public PlanetaController() {
		/*
		 * Ao criar a instância de PlanetaController, criamos também os objetos
		 * de visualização e dados.
		 */
		planetaView = new PlanetaView();
		planetaDAO = new PlanetaDAO();
	}
	
	/*
	 * Método cadastraPlaneta não tem nenhum retorno, por isso tem a palavra void e
	 * recebe o nome do planeta como parâmetro.
	 */
	public void cadastraPlaneta(String nome) {
		/*
		 * Cria um novo planeta (modelo) passando o nome do planeta como parâmetro
		 */
		Planeta planeta = new Planeta(nome);
		
		/*
		 * Utiliza o objeto de dados (planetaDAO) e invoca o método adicionaPlaneta, passando
		 * o planeta, em forma de objeto (nova instância de Planeja, model) como parâmetro
		 */
		planetaDAO.adicionaPlaneta(planeta);
	}
	
	/*
	 * Método exibe planeta não tem nenhum retorno, por isso utiliza a palavra reservada void
	 */
	public void exibePlaneta() {
		/*
		 * Esse método nos mostra claramente o papel  fundamental  da  camada de  controller, 
		 * pois  ela  interage  com  as  demais  camadas  do  sistema  e  coloca elas para se 
		 * relacionar.  Nesse  momento,  obtemos  a  lista  de  planetas  utilizando o objeto 
		 * planetaDAO e invocando o método getListaDePlanetas.  Como  isso,  obtemos a lista,
		 * porém o controller em si, vai apenas repassar essa lista para  classe  responsável
		 * de visualização. Sendo assim, utilizamos a objeto planetaView e invocamos o método
		 * listaPlaneta que necessita receber a lista de planetas como parâmetro.
		 */
		planetaView.listaPlaneta(planetaDAO.getListaDePlanetas());
	}
	
	/*
	 * Método menuMain não tem nenhum retorno, por isso utiliza a palavra reservada void.
	 */
	public void menuMain() {
		// Utiliza o objeto planetaView
		planetaView.menuPlaneta();
	}
}

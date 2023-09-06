package controller;

import dao.PlanetaDAO;
import model.Planeta;
import view.PlanetaView;

public class PlanetaController {
	/*
	 * O controller trabalha entre as camadas de dados, visualiza��o e modelo,
	 * sendo assim, criamos os objetos da camada de view e dados
	 */
	private PlanetaView planetaView;
	private PlanetaDAO planetaDAO;

	/*
	 * Construtor da classe PlanetaController
	 */
	public PlanetaController() {
		/*
		 * Ao criar a inst�ncia de PlanetaController, criamos tamb�m os objetos
		 * de visualiza��o e dados.
		 */
		planetaView = new PlanetaView();
		planetaDAO = new PlanetaDAO();
	}
	
	/*
	 * M�todo cadastraPlaneta n�o tem nenhum retorno, por isso tem a palavra void e
	 * recebe o nome do planeta como par�metro.
	 */
	public void cadastraPlaneta(String nome) {
		/*
		 * Cria um novo planeta (modelo) passando o nome do planeta como par�metro
		 */
		Planeta planeta = new Planeta(nome);
		
		/*
		 * Utiliza o objeto de dados (planetaDAO) e invoca o m�todo adicionaPlaneta, passando
		 * o planeta, em forma de objeto (nova inst�ncia de Planeja, model) como par�metro
		 */
		planetaDAO.adicionaPlaneta(planeta);
	}
	
	/*
	 * M�todo exibe planeta n�o tem nenhum retorno, por isso utiliza a palavra reservada void
	 */
	public void exibePlaneta() {
		/*
		 * Esse m�todo nos mostra claramente o papel  fundamental  da  camada de  controller, 
		 * pois  ela  interage  com  as  demais  camadas  do  sistema  e  coloca elas para se 
		 * relacionar.  Nesse  momento,  obtemos  a  lista  de  planetas  utilizando o objeto 
		 * planetaDAO e invocando o m�todo getListaDePlanetas.  Como  isso,  obtemos a lista,
		 * por�m o controller em si, vai apenas repassar essa lista para  classe  respons�vel
		 * de visualiza��o. Sendo assim, utilizamos a objeto planetaView e invocamos o m�todo
		 * listaPlaneta que necessita receber a lista de planetas como par�metro.
		 */
		planetaView.listaPlaneta(planetaDAO.getListaDePlanetas());
	}
	
	/*
	 * M�todo menuMain n�o tem nenhum retorno, por isso utiliza a palavra reservada void.
	 */
	public void menuMain() {
		// Utiliza o objeto planetaView
		planetaView.menuPlaneta();
	}
}

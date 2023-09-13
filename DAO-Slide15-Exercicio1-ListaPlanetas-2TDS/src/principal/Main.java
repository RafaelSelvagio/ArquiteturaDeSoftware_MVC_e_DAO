package principal;

import controller.PlanetaController;

public class Main {

	public static void main(String[] args) {
		// Crie uma aplicação para cadastrar o nome dos
		// planetas do sistema solar, utilize os padrões MVC e DAO.
		
		// Cria o objeto planeta do tipo da classe PlanetaController
		PlanetaController planeta = new PlanetaController();
		
		// Utiliza o método inicializar do objeto planeta
		planeta.inicializar();

	}

}

package main;

import java.util.InputMismatchException;
import java.util.Scanner;
import controller.PlanetaController;

public class Main {

	public static void main(String[] args) {
		// Variável inteira que serve de controle na estrutura while
		int opcao = -1;

		// Cria um objeto do tipo PlanetaController
		PlanetaController planetaController = new PlanetaController();

		// Cria um objeto do tipo Scanner, para ler as interações do usuário via console
		Scanner ler = new Scanner(System.in);

		/*
		 * Estrutura de repetição while Enquanto a variável opcao for diferente de zero,
		 * o sistema continua executando, em outras palavras, enquanto a opcao for
		 * diferente de zero, o sistema fica "preso" dentro do while
		 */
		while (opcao != 0) {
			// Método para exibir as opções do menu
			planetaController.menuMain();

			/*
			 * Estrutura try-catch Usada sempre que existir um tratamento de exceções O
			 * Scanner espera ler um número inteiro, digitado pelo usuário. Porém, o sistema
			 * está preparado para uma leitura diferente, se o usuário não digitar um número
			 * inteiro, o sistema lança uma exceção.
			 */
			try {
				// Tenta ler o número inteiro que é esperado que o usuário digite
				opcao = ler.nextInt();
			}

			/*
			 * Bloco de código voltado para tratamento da exceção Se o usuário digitar algo
			 * diferente do que um número inteiro, esse bloco de código será executado.
			 */
			catch (InputMismatchException e) {
				// Informa ao usuário que ele digitou um caracter inválido
				System.out.println("O caracter digitado não é um número inteiro");

				// Limpa o buffer do scanner
				ler.nextLine();
			}

			/*
			 * Estrutura condicional, onde recebe uma variável (opcao),
			 * e trabalha com as possibilidades dessa variável, em outras
			 * palavras, para caa possibilidade da variável, escrevemos
			 * um case.
			 */
			switch (opcao) {
			// Case 1 - Cadastrar planeta
			case 1:
				// Solicita ao usuário o nome do planeta que ele deseja cadastrar
				System.out.println("Nome do planeta a ser cadastrado: ");
				
				// Limpa o scanner
				ler.nextLine();
				
				// Le o texto digitado no console e coloca na variável nome que é do tipo String
				String nome = ler.nextLine();
				
				/*
				 * Utiliza o objeto planetaController para invocar o método cadastraPlaneta, 
				 * passando o nome do planeta como parâmetro.
				 */
				planetaController.cadastraPlaneta(nome);
				
				// Finaliza o case
				break;
			case 2:
				/*
				 * Utiliza o objeto planetaController para invocar o método exibePlaneta
				 */
				planetaController.exibePlaneta();
				
				// Finaliza o case
				break;
			case 0:
				// Informa ao usuário que o programa será finalizado
				System.out.println("Saindo...");
				
				// Finaliza o case
				break;
			default:
				// Informa ao usuário que ele selecionou uma opção inválida
				System.out.println("Opção inválida!!!");
				
				// Finaliza o case
				break;
			}
		}
		
		// Fecha o objeto scanner
		ler.close();
	}

}

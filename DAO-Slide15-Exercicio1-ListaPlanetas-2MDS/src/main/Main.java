package main;

import java.util.InputMismatchException;
import java.util.Scanner;
import controller.PlanetaController;

public class Main {

	public static void main(String[] args) {
		// Vari�vel inteira que serve de controle na estrutura while
		int opcao = -1;

		// Cria um objeto do tipo PlanetaController
		PlanetaController planetaController = new PlanetaController();

		// Cria um objeto do tipo Scanner, para ler as intera��es do usu�rio via console
		Scanner ler = new Scanner(System.in);

		/*
		 * Estrutura de repeti��o while Enquanto a vari�vel opcao for diferente de zero,
		 * o sistema continua executando, em outras palavras, enquanto a opcao for
		 * diferente de zero, o sistema fica "preso" dentro do while
		 */
		while (opcao != 0) {
			// M�todo para exibir as op��es do menu
			planetaController.menuMain();

			/*
			 * Estrutura try-catch Usada sempre que existir um tratamento de exce��es O
			 * Scanner espera ler um n�mero inteiro, digitado pelo usu�rio. Por�m, o sistema
			 * est� preparado para uma leitura diferente, se o usu�rio n�o digitar um n�mero
			 * inteiro, o sistema lan�a uma exce��o.
			 */
			try {
				// Tenta ler o n�mero inteiro que � esperado que o usu�rio digite
				opcao = ler.nextInt();
			}

			/*
			 * Bloco de c�digo voltado para tratamento da exce��o Se o usu�rio digitar algo
			 * diferente do que um n�mero inteiro, esse bloco de c�digo ser� executado.
			 */
			catch (InputMismatchException e) {
				// Informa ao usu�rio que ele digitou um caracter inv�lido
				System.out.println("O caracter digitado n�o � um n�mero inteiro");

				// Limpa o buffer do scanner
				ler.nextLine();
			}

			/*
			 * Estrutura condicional, onde recebe uma vari�vel (opcao),
			 * e trabalha com as possibilidades dessa vari�vel, em outras
			 * palavras, para caa possibilidade da vari�vel, escrevemos
			 * um case.
			 */
			switch (opcao) {
			// Case 1 - Cadastrar planeta
			case 1:
				// Solicita ao usu�rio o nome do planeta que ele deseja cadastrar
				System.out.println("Nome do planeta a ser cadastrado: ");
				
				// Limpa o scanner
				ler.nextLine();
				
				// Le o texto digitado no console e coloca na vari�vel nome que � do tipo String
				String nome = ler.nextLine();
				
				/*
				 * Utiliza o objeto planetaController para invocar o m�todo cadastraPlaneta, 
				 * passando o nome do planeta como par�metro.
				 */
				planetaController.cadastraPlaneta(nome);
				
				// Finaliza o case
				break;
			case 2:
				/*
				 * Utiliza o objeto planetaController para invocar o m�todo exibePlaneta
				 */
				planetaController.exibePlaneta();
				
				// Finaliza o case
				break;
			case 0:
				// Informa ao usu�rio que o programa ser� finalizado
				System.out.println("Saindo...");
				
				// Finaliza o case
				break;
			default:
				// Informa ao usu�rio que ele selecionou uma op��o inv�lida
				System.out.println("Op��o inv�lida!!!");
				
				// Finaliza o case
				break;
			}
		}
		
		// Fecha o objeto scanner
		ler.close();
	}

}

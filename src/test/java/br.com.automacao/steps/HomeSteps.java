package br.com.automacao.steps;

import br.com.automacao.pageobjects.HomePage;

public class HomeSteps extends BaseSteps {

	public HomeSteps(){

		Dado("que estou na pagina de login do sistema", () -> {
			HomePage.clicarNoButtonDemo();
			HomePage.clicarNoButtonLogin();
		});

	}
}

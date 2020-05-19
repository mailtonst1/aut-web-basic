package br.com.automacao.steps;

import br.com.automacao.pageobjects.HomePage;
import cucumber.api.java8.Pt;

public class HomeSteps implements Pt {
	public HomeSteps(){

		Dado("que estou na pagina de login do sistema", () -> {
			HomePage.clicarNoButtonDemo();
			HomePage.clicarNoButtonLogin();
		});

	}
}

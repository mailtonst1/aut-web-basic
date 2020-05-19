package br.com.automacao.steps;

import br.com.automacao.pageobjects.HomePage;
import br.com.automacao.pageobjects.PrincipalPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java8.Pt;
import static org.junit.Assert.assertEquals;

public class PrincipalSteps extends BaseSteps implements Pt{
    public PrincipalSteps(){

        Entao("devo ver minha página principal", () -> {
            assertEquals(PrincipalPage.validoNomeUsuarioLogado(),"Hi, Demo User");
        });

    }

}

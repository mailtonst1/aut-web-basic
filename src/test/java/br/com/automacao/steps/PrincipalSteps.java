package br.com.automacao.steps;

import br.com.automacao.pageobjects.PrincipalPage;
import cucumber.api.java8.Pt;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class PrincipalSteps implements Pt{
    public PrincipalSteps(){

        Entao("devo ver minha página principal", () -> {
            Assert.assertEquals(PrincipalPage.validoNomeUsuarioLogado(),"Hi, Demo User");
        });

    }

}

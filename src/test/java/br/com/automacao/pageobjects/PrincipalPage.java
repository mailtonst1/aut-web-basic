package br.com.automacao.pageobjects;

import org.openqa.selenium.By;

public class PrincipalPage extends BasePage {

    private static final By nomeUsuario = By.cssSelector("body > div.body-inner > div.main-wrapper.scrollspy-action > div:nth-child(2) > div > div > div:nth-child(1) > div > div.col-md-8 > h3");


    public static String validoNomeUsuarioLogado(){
        return element(nomeUsuario).getText();
    }


}

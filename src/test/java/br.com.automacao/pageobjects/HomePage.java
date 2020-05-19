package br.com.automacao.pageobjects;


import org.openqa.selenium.By;

public class HomePage extends BasePage {

    /* Mapeamento de seletores */

    private static final By seletorBtDemo = By.cssSelector("li:nth-child(3) a:nth-child(1) i");
    private static final By seletorBtLogin = By.cssSelector("a[href='https://www.phptravels.net/login']");
    /* Função */

    public static void clicarNoButtonDemo(){
        click(seletorBtDemo);
    }

    public static void clicarNoButtonLogin(){
        click(seletorBtLogin);
    }


}

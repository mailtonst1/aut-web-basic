package br.com.automacao.pageobjects;


import org.openqa.selenium.By;

public class HomePage extends BasePage {

    /* Mapeamento de seletores */

    private static final By seletorBtDemo = By.cssSelector("#header-waypoint-sticky > div.header-top > div > div > div.col-md-8.col-10.o1 > div > ul > li:nth-child(3) > div > a");
    private static final By seletorBtLogin = By.cssSelector("#header-waypoint-sticky > div.header-top > div > div > div.col-md-8.col-10.o1 > div > ul > li:nth-child(3) > div > div > div > a.dropdown-item.active.tr");
    /* Função */

    public static void clicarNoButtonDemo(){
        click(seletorBtDemo);
    }

    public static void clicarNoButtonLogin(){
        click(seletorBtLogin);
    }


}

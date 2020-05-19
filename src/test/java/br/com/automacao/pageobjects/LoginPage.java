package br.com.automacao.pageobjects;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private static final By InputCampoLogin = By.cssSelector("#loginfrm > div.wow.fadeIn > div:nth-child(1) > label > input[type=email]");
    private static final By InputSenhaLogin = By.cssSelector("#loginfrm > div.wow.fadeIn > div:nth-child(2) > label > input[type=password]");
    private static final By BtLogin = By.cssSelector("#loginfrm#loginfrm > button");


    public static void preencherInputUsuario(String email) {
        preencherInput(InputCampoLogin, email);
    }

    public static void preencherInputSenha(String senha) {
        preencherInput(InputSenhaLogin, senha);
    }

    public static void clicarNoButtonLogin(){
        click(BtLogin);
    }

}

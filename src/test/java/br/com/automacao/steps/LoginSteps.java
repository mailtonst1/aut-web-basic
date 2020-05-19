package br.com.automacao.steps;

import br.com.automacao.pageobjects.LoginPage;
import cucumber.api.java8.Pt;

public class LoginSteps implements Pt {
    public LoginSteps() {

        E("que preencho um login é uma senha valido (.*) (.*)", (String email, String senha) -> {
            LoginPage.preencherInputUsuario(email);
            LoginPage.preencherInputSenha(senha);
        });

        Quando("confirmo para logar", () -> {
            LoginPage.clicarNoButtonLogin();
        });
    }



}


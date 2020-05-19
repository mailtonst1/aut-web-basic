package br.com.automacao.steps;

import br.com.automacao.utils.Browser;
import cucumber.api.java8.Pt;
import org.openqa.selenium.JavascriptExecutor;
import static br.com.automacao.utils.Browser.driver;
import static br.com.automacao.utils.Browser.loadPage;

public class BaseSteps implements Pt {
	public BaseSteps() {
		Before(() -> {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			loadPage("https://www.phptravels.net/home");
		});

		After(scenario -> {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.sessionStorage.clear();");
		});



	}
}

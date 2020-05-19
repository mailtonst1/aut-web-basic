package br.com.automacao.steps;

import br.com.automacao.utils.Browser;
import cucumber.api.java8.Pt;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static br.com.automacao.utils.Browser.driver;

public class BaseSteps implements Pt {
	public BaseSteps() {
		Before(() -> {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			Browser.loadPage("https://www.phptravels.net/home");
		});

		After(scenario -> {
			if (scenario.isFailed()) {
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			}
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.sessionStorage.clear();");
		});



	}
}

package br.com.automacao.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Element extends Browser {

	protected static WebElement element(By by) {
		waitElement(by);
		return  driver.findElement(by);
	}

	protected static List<WebElement> elements(By by) {
		waitElement(by);
		return driver.findElements(by);
	}

	protected static boolean exist(By by) {
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		return driver.findElement(by).isDisplayed();
	}

	protected static boolean elementIsVisible(By by) { return driver.findElement(by).isDisplayed();
	}

	protected static boolean elementNotPresent(By by) {
		return waitNot.until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(by)));
	}

	protected static void waitElement(By by) {
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	protected static void waitElementToNotBeVisible(By by) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}
}

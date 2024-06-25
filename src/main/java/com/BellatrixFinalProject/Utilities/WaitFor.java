package com.BellatrixFinalProject.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.NoSuchElementException;

import com.BellatrixFinalProject.stepDefinations.TestBase;

public class WaitFor {
	private static FluentWait<WebDriver> wait;
	static {
		wait = new FluentWait<WebDriver>(TestBase.getDriver());
		wait.pollingEvery(java.time.Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class);
		wait.withTimeout(java.time.Duration.ofSeconds(100));
		

	}

	public static void staleElement(WebElement element) {
		wait.until(ExpectedConditions.stalenessOf(element));
	}

	public static void elementToBePresentInList(By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static void elementToBeVisiable(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void elementToBeVisiable(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
}
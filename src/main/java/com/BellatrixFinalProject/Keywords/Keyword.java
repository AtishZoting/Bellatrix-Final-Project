package com.BellatrixFinalProject.Keywords;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BellatrixFinalProject.stepDefinations.TestBase;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Keyword {

	public void enterText(WebElement ele, String textToEnter) {
		ele.sendKeys(textToEnter);
	}

	public WebElement getWebElement(String locatorType, String locatorValue) {
		if (locatorType.equalsIgnoreCase("id")) {
			return TestBase.driver.findElement(By.id(locatorValue));
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			return TestBase.driver.findElement(By.xpath(locatorValue));
		} else if (locatorType.equalsIgnoreCase("css")) {
			return TestBase.driver.findElement(By.cssSelector(locatorValue));
		} else
			return null;
	}

	public List<WebElement> getWebElements(String locatorType, String locatorValue) {
		if (locatorType.equalsIgnoreCase("id")) {
			return TestBase.driver.findElements(By.id(locatorValue));
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			return TestBase.driver.findElements(By.xpath(locatorValue));
		} else if (locatorType.equalsIgnoreCase("css")) {
			return TestBase.driver.findElements(By.cssSelector(locatorValue));
		} else
			return null;
	}

	public void enterText(String locatorType, String locatorValue, String textToEnter) {
		getWebElement(locatorType, locatorValue).sendKeys(textToEnter);
	}

	public void click(String locatorType, String locatorValue) {
		getWebElement(locatorType, locatorValue).click();

	}

	public String getText(String locatorType, String locatorValue) {
		return getWebElement(locatorType, locatorValue).getText();
	}

	public List<String> getTexts(String locatorType, String locatorValue) {
		List<WebElement> data = getWebElements(locatorType, locatorValue);

		List<String> stringData = new LinkedList<>();
		for (WebElement element : data) {
			stringData.add(element.getText());
		}
		return stringData;

	}

	public void enterText(String locator, String textToEnter) {
		String parts[] = locator.split("##");
		enterText(parts[0], parts[1], textToEnter);
	}

	public void click(String locator) {
		String[] parts = locator.split("##");
		click(parts[0], parts[1]);
	}

	public List<String> getTexts(String locator) {
		String[] parts = locator.split("##");
		return getTexts(parts[0], parts[1]);
	}

	public List<String> getTexts(List<WebElement> elements) {
		List<String> data = new ArrayList<>();
		for (WebElement element : elements) {
			data.add(element.getText());
		}
		return data;
	}

	public void dropDown(WebElement element, String textToEnter) {
		Select select = new Select(element);
		select.selectByVisibleText(textToEnter);

	}

	public void captureFullPageScreenShot(String filePath) throws IOException {
		Date date = new Date();
		String dateFormat = date.toString().replace(" ", "-").replace(":", "-");
		AShot ashot = new AShot();
		BufferedImage img = ashot.shootingStrategy(ShootingStrategies.viewportPasting(2000))
				.takeScreenshot(TestBase.getDriver()).getImage();

		String baseDir = System.getProperty("user.dir");
		ImageIO.write(img, "jpg", new File(baseDir + filePath + dateFormat + ".jpg"));

	}

}

package com.BellatrixFinalProject.stepDefinations;


import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.BellatrixFinalProject.Configuration.Configuration;
import com.BellatrixFinalProject.Keywords.Keyword;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class TestBase {

	private static final Logger LOG = Logger.getLogger(TestCasesStepDef.class);

	Configuration config = new Configuration();

	public static RemoteWebDriver driver;

	public static RemoteWebDriver getDriver() {
		return driver;
	}

	@Before
	public void openBrowser() throws FileNotFoundException {
		if (config.getBrowserName().equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (config.getBrowserName().equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (config.getBrowserName().equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			LOG.error("Invalid Browser Name : " + config.getBrowserName());
		}

		driver.get(config.getUrl());
		driver.manage().window().maximize();

	}

	@After
	public void takeScreenShotWhenTestCaseIsFailed(Scenario scenario) {
		try {
			if (scenario.isFailed()) {
				Keyword keyword = new Keyword();
				keyword.captureFullPageScreenShot("/src/main/resources/failedTestCasesScreenshots");
			}
		} catch (Exception e) {

		}
		driver.quit();
	}

}
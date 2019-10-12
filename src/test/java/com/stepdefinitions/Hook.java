package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;

	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "D:\\gow\\MavenFirst2\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
driver.get("https://www.airnewzealand.co.nz/home-1/");
	}

	@After
	public void after() {

		driver.close();
	}
}

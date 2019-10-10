package com.objectrepository;
import com.stepdefinitions.Hook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage   {
	
	
	public Homepage() {
		PageFactory.initElements(Hook.driver, this);
	}
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement add;
	
	
	public WebElement getAdd() {
		return add;
	}
	
	

}

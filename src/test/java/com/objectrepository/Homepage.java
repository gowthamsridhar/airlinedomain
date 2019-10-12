package com.objectrepository;
import com.stepdefinitions.Hook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage   {
	
	
	public Homepage() {
		PageFactory.initElements(Hook.driver, this);
	}
	@FindBy(id="depart-from")
	private WebElement from;
	
	
	@FindBy(id="depart-to")
	private WebElement to;
	
	
	@FindBy(id="field-search-journey-type-oneway")
	private WebElement onewaybtn;
	
	@FindBy(id="leaveDate")
	private WebElement date;
	
	
	@FindBy(xpath="//button[@name='search']")
	private WebElement searchBtn;


	public WebElement getFrom() {
		return from;
	}


	public WebElement getTo() {
		return to;
	}


	public WebElement getOnewaybtn() {
		return onewaybtn;
	}


	public WebElement getDate() {
		return date;
	}


	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	
	
	}
	
	



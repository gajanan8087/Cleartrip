package com.flightbooking.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flightbooking.base.Base;

public class LoginPage extends Base{
	
	//PageFactory
@FindBy(xpath="//input[@name='origin']")
WebElement origincity;

@FindBy(name="destination")
WebElement destinationcity;

@FindBy(id="DepartDate")
WebElement calender;

@FindBy(xpath="//span[@class='ui-datepicker-month']")
WebElement month;

@FindBy(xpath="//a[@class='nextMonth ']")
WebElement nextmonth;

@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr/td/a")
WebElement dates;

@FindBy(xpath="//select[@name='adults']")
WebElement adultcount;

@FindBy(id="Childrens")
WebElement childcount;

@FindBy(id="Infants")
WebElement infantcount;

@FindBy(id="SearchBtn")
WebElement searchbutton;


public LoginPage() {
	PageFactory.initElements(driver, this);
}

public void enterorigincity(String city1) {
	origincity.sendKeys(city1);
}

public void enterdestinationcity(String city2) {
	destinationcity.sendKeys(city2);
}

public void entercalender() {
	calender.click();
}

public void month() {
	month.getText();
}
public void date() {
	dates.getText();
}

	

}

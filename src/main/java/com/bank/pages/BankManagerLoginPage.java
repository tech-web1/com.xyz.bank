package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By BankManager=By.xpath("//button[contains(text(),'Bank Manager Login')]");

    By Customer=By.xpath("//button[normalize-space()='Add Customer']");

    By FirstName= By.xpath("//input[@placeholder='First Name']");

    By LastName=By.xpath("input[placeholder='Last Name']");

    By PostCode=By.xpath("input[placeholder='Post Code']");

    By AddCustomer=By.xpath("button[type='submit']");




    public void bankManagerLogin(){
        clickOnElement(BankManager);
    }
    public void clickOnCustomer(){
        clickOnElement(Customer);
    }

    public void enterFirstName(){
        sendTextToElement(FirstName,"Bhumi");
    }

    public void enterLastName(){
        sendTextToElement(LastName,"Limbani");
    }
    public void enterPostCode(){
        sendTextToElement(PostCode,"cv1 2dg");
    }
    public void addCustomer(){
        clickOnElement(AddCustomer);
    }
}

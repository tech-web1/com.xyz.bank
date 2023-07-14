package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {
    By Customer=By.xpath("//button[contains(text(),'Customer Login')]");

    By CustomerId=By.xpath("//select[@id='userSelect']");

    By Login=By.xpath("//button[contains(text(),'Login')]");

    By Deposit=By.xpath("//button[normalize-space()='Deposit']");

    By Amount=By.xpath("//input[@placeholder='amount']");

    By DepositButton=By.xpath("//button[@type='submit']");


    

    public void clickCustomer(){
        clickOnElement(Customer);
    }
    public void searchCustomer(){
        selectByVisibleTextFromDropDown(CustomerId,"Bhumi Limbani");
    }
    public void clickOnLogin(){
        clickOnElement(Login);
    }

    public void clickOnDeposit(){
        clickOnElement(Deposit);
    }

    public void enterAmount(){
       // sendTextToAlert(Amount,);
    }
    public void clickOnDepositButton(){
        clickOnElement(DepositButton);
    }
}

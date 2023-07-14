package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By Customer=By.xpath("//button[contains(text(),'Customer Login')]");

    By CustomerId=By.xpath("//select[@id='userSelect']");

    By Login=By.xpath("//button[contains(text(),'Login')]");

    By LogOut=By.xpath("//button[contains(text(),'Logout')]");












    public void clickCustomer(){
        clickOnElement(Customer);
    }
    public void searchCustomer(){
        selectByVisibleTextFromDropDown(CustomerId,"Bhumi Limbani");
    }
    public void clickOnLogin(){
        clickOnElement(Login);
    }
    public void clickOnLogOut(){
        clickOnElement(LogOut);
    }
}

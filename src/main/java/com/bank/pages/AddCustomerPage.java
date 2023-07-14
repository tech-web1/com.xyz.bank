package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By BankManager=By.xpath("//button[contains(text(),'Bank Manager Login')]");

    By Account=By.xpath(".btn.btn-lg.tab[ng-class='btnClass2']");

    By SearchCustomer=By.xpath("//select[@id='userSelect']");

    By Currency=By.xpath("//select[@id='currency']");

    By Process=By.xpath("//button[contains(text(),'Process')]");










    public void bankManagerLogin(){
        clickOnElement(BankManager);
    }
    public void clickOnAccountTab(){
        clickOnElement(Account);
    }
    public void selectCustomer(){
        //selectByVisibleTextFromDropDown(selectCustomer(),);
    }
    public void selectCurrency(){
        selectByVisibleTextFromDropDown(Currency,"Pound");
    }
    public void clickOnProcess(){
        clickOnElement(Process);
    }
}

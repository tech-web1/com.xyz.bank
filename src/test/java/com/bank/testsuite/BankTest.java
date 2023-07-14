package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    AccountPage accountPage = new AccountPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();

    BankManagerLoginPage bankMangerLoginPage = new BankManagerLoginPage();

    CustomerLoginPage customerLoginPage = new CustomerLoginPage();

    CustomersPage customersPage = new CustomersPage();

    HomePage homePage = new HomePage();

    OpenAccountPage openAccountPage = new OpenAccountPage();

    @Test
    public void ShouldAddCustomerSuccessfully() {

        //click On "Bank Manager Login" Tab
        bankMangerLoginPage.bankManagerLogin();
        //click On "Add Customer" Tab
        bankMangerLoginPage.clickOnCustomer();
        //enter FirstName
        bankMangerLoginPage.enterFirstName();
        //enter LastName
        bankMangerLoginPage.enterLastName();
        //enter PostCode
        bankMangerLoginPage.enterPostCode();
        //click On "Add Customer" Button
        bankMangerLoginPage.addCustomer();
        //popup display
        //verify message "Customer added successfully"
       // Customer added successfully with customer id :6
        //click on "ok" button on p
    }
    @Test
    public void ShouldOpenAccountSuccessfully(){
        //click On "Bank Manager Login" Tab
        addCustomerPage.bankManagerLogin();
        //click On "Open Account" Tab
        addCustomerPage.clickOnAccountTab();
        //	Search customer that created in first test
        addCustomerPage.selectCustomer();
        //	Select currency "Pound"
        addCustomerPage.selectCurrency();
        //	click on "process" button
        addCustomerPage.clickOnProcess();
        //	popup displayed
        //Account created successfully with account Number :1016
        //	verify message "Account created successfully"
        //	click on "ok" button on popup.
    }@Test
    public void ShouldLoginAndLogoutSuccessfully(){
        //click on "Customer Login" Tab
        customerLoginPage.clickCustomer();
        //	search customer that you created.
        customerLoginPage.searchCustomer();
        //	click on "Login" Button
        customerLoginPage.clickOnLogin();
        //	verify "Logout" Tab displayed.


        //	click on "Logout"
        customerLoginPage.clickOnLogOut();
        //	verify "Your Name" text displayed.

    }
    @Test
    public void ShouldDepositMoneySuccessfully(){
        //click on "Customer Login" Tab
        customersPage.clickCustomer();
        //	search customer that you created.
        customersPage.searchCustomer();
        //	click on "Login" Button
        customersPage.clickOnLogin();
        //	click on "Deposit" Tab
        customersPage.clickOnDeposit();
        //	Enter amount 100

        //	click on "Deposit" Button
        customersPage.clickOnDepositButton();
        //	verify message "Deposit Successful


    }
    @Test
    public void ShouldWithdrawMoneySuccessfully(){
        //click on "Customer Login" Tab

        //	search customer that you created.
        //	click on "Login" Button
        //	click on "Withdrawl" Tab
        //	Enter amount 50
        //	click on "Deposit" Button
        //	verify message "Transaction Successful"
    }

}
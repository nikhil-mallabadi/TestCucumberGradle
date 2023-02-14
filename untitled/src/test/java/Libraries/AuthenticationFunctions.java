package Libraries;

import Elements.WebELements;

public class AuthenticationFunctions {
    WebELements elements;
    {
        elements = new WebELements(DriverSetup.webdriver);
    }
    public AuthenticationFunctions(){

    }

    public void enterEmail(){
        elements.loginButton.click();
    }

    public void verifyUserName(){

    }
}

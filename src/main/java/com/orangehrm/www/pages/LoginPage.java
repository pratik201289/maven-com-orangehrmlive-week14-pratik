package com.orangehrm.www.pages;

import com.orangehrm.www.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By enterUserName= By.name("username");
    By enterPassword= By.name("password");

    By clickLoginButton = By.xpath("//button[@type = 'submit']");

    By getDashboardText= By.xpath("//span/h6[text() = 'Dashboard']");

    public void setUserName(String username){
        sendTextToElement(enterUserName,username);
    }
    public void setPassword(String password){
        sendTextToElement(enterPassword,password);
    }
    public void setClickLoginButton(){
        clickOnElement(clickLoginButton);
    }
    public String getSuccessMessage(){
        return getTextFromElement(getDashboardText);
    }

}

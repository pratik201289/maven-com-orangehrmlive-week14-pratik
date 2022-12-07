package com.orangehrm.www.pages;

import com.orangehrm.www.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPassword extends Utility {

By clickForgotPasswordLink = By.xpath("//div[@class = 'orangehrm-login-forgot']/p[text() = 'Forgot your password? ']");

By actualTextPassword = By.xpath("//div[@class = 'orangehrm-card-container']/form/h6[text() = 'Reset Password']");

public void clickOnForgotPasswordLink(){

    clickOnElement(clickForgotPasswordLink);

}
public String verifyActualTextResetPassword(){
    return getTextFromElement(actualTextPassword);
}

}

package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    //login er jonno
    @FindBy(id="email")
    WebElement txtEmail; //element er nam dilam r koi thake ki diye niche seta bollam

    @FindBy(id = "password")
    WebElement txtPassword;

    @FindBy(tagName = "button")
    WebElement btnLogin;
    //.............eta logout er jonno
    @FindBy(css="button[type='button']")
    WebElement btnprofile;

    @FindBy(css = "[role=menuitem]")
    List<WebElement> menuItem;

    public LoginPage(WebDriver driver){ // page factor diye page er element gula k initialize korlam
        PageFactory.initElements(driver,this);
    }

public void dologin(String email,String password){ // ei method a amder login er jonno ja ja kaj kora lagbe seta korlam and data parameter diye nilam
        txtEmail.sendKeys(email);// parameter thake j email ta pailam seta bosailam //r age bole diche email er field a dhorlam kamne
        txtPassword.sendKeys(password);// amra justa ei method a bole dilam data gula koi tahke nibo field a r neyar por ki kaj korbo
        btnLogin.click(); // bt run  korbo runner cls thake

}

public void dologout(){
btnprofile.click();
menuItem.get(1).click();
}

}

package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage {
@FindBy(tagName = "input")
List<WebElement> txtInput;// bes koyta data cilo input nam a setar akta nam diye nich a index get korci

@FindBy(id = "register")
 WebElement btnregister;

    public RegisterPage(WebDriver driver){ //elemetnt gula pass korci r constractoro bnaice oi cls er nam diye
        PageFactory.initElements(driver,this);
    }
    public void forminput(String firstname,String lastname,String email, String password,String phonenumber,String address){ //amra soja soji dta na diye perameter diye data diche
        txtInput.get(0).sendKeys(firstname);// parameter diye data input diche
        txtInput.get(1).sendKeys(lastname);
        txtInput.get(2).sendKeys(email);
        txtInput.get(3).sendKeys(password);
        txtInput.get(4).sendKeys(password);
        txtInput.get(5).sendKeys(address);
        txtInput.get(6).click();//selected male
        txtInput.get(8).click();
        btnregister.click(); // er por data powar por click korce ri data sob paice amra runner cls thake

    }
}

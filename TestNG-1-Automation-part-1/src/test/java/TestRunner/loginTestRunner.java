package TestRunner;

import Config.Setup;
import Page.LoginPage;
import org.testng.annotations.Test;

public class loginTestRunner extends Setup {

 @Test(priority = 1,description = "Admin user login")
    public void adminlogin(){
        LoginPage login =new LoginPage(driver); //login page cls thake object banaice r seta diye setup a j dricer cilo seta pass kore diche
        login.dologin("admin@test.com","admin123"); // er por login cls er do logi method ta \r maje parameter diye call korci pore oi mehod ta kaj suru kore btn click kore diche

    }
    @Test  (priority = 2,description = "Admin user loginout") // ami alada vabe eta ei khan a a bosai diche
    public void logout(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.dologout();
    }
}

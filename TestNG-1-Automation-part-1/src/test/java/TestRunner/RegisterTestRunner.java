package TestRunner;

import Config.Setup;
import Page.RegisterPage;
import Utils.Utiles;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegisterTestRunner extends Setup {
    @Test
    public void UserRegister() throws InterruptedException {
        driver.findElement(By.partialLinkText("Register")).click(); //ei khan a register page a jowar jonno element call korci
        RegisterPage registerPage = new RegisterPage(driver);//object creat korci stear Page.RegisterPage thake r data parameter diche
        Faker faker = new Faker();// faker niche randomly sob create korar jonno then faker diye sob banay seta
        String firstname = faker.name().firstName();// pore register page er parameter er vitor a pass korci
        String lastname = faker.name().lastName();
        String email = (firstname + lastname + Utiles.generateRandomNumber(1000, 9999) + "@gmail.com");
        String password = "12345";
        String number = "01345" + Utiles.generateRandomNumber(1234987, 120987);// utiles static class tai object lage nai sojs soji call kore use korci
        String address = faker.address().fullAddress();// faker diye j data gula creat kore variable er maje rakci seta pore
        registerPage.forminput(firstname, lastname, email, password, number, address);// register er j object banaice seta diye oi page er method ta call kore parameter diye ran korar sate oi method er kaj suru hoye gace

        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); //explicit waiter
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Toastify__toast"))); // j toast msg ta dey seta ber kora

        String successfulmsgActual = driver.findElement(By.className("Toastify__toast")).getText();// class name age thake same er por
        System.out.println(successfulmsgActual);
        String Expectedmsg = "registered successfully!";
        Assert.assertTrue(successfulmsgActual.contains(Expectedmsg)); // assertion korci
        
    }
}

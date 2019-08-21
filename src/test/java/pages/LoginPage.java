package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver navegador) {
        super(navegador);
    }

    public LoginPage login(String email){
        navegador.findElement(By.xpath("//input[@placeholder='E-mail']")).sendKeys(email);

        return this;
    }
    public LoginPage senha(String senha){
        navegador.findElement(By.xpath("//input[@placeholder='Senha']")).sendKeys(senha);

        return this;
    }
    public HomePage entrar(){
        navegador.findElement(By.xpath("//*[@value='Entrar com Email']")).click();

        return new HomePage(navegador);
    }

    public HomePage fazerLogin(String email, String senha){
        return login(email).senha(senha).entrar();
    }
}

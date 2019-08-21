package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import suporte.Screenshot;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    public RegistrarPage clickButtonRegistrar(){

        return new RegistrarPage(navegador);
    }
    public LoginPage clickButtonLogin(){
        navegador.findElement(By.linkText("Entrar")).click();

        return new LoginPage(navegador);
    }
    public ContatoPage clickMenuContato(){

        return new ContatoPage(navegador);
    }
    public MeuPerfilPage clickIconPerfil(){
        navegador.findElement(By.xpath("//*[@id=\"UCMenuSuperior_ctl01_btnOpcoes\"]")).click();
        navegador.findElement(By.linkText("Perfil")).click();

        return new MeuPerfilPage(navegador);
    }
    public HomePage clickButtonSair(){

        return this;
    }
}

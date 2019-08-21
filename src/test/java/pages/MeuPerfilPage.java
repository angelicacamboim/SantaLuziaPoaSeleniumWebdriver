package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MeuPerfilPage extends BasePage {

    public MeuPerfilPage(WebDriver navegador) {
        super(navegador);
    }

    public EditarPerfilPage clickButtonEditar(){
        navegador.findElement(By.xpath("//*[@value='Editar']")).click();

        return new EditarPerfilPage(navegador);
    }
}

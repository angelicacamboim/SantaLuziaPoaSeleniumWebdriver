package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditarPerfilPage extends BasePage {

    public EditarPerfilPage(WebDriver navegador) {
        super(navegador);
    }

    public EditarPerfilPage addFoto(){
        WebElement UploadImg = navegador.findElement(By.xpath("//*[@id='MainContent_fileAvatar']"));

        UploadImg.sendKeys("C:\\Users\\Angelica\\Documents\\My Projects\\santaluziapoaseleniumwebdriver\\photos\\icone1.png");

        return this;
    }
    public EditarPerfilPage alterarNome(String name){
        WebElement text = navegador.findElement(By.xpath("//*[.='Nome Completo']/following-sibling::input"));
        text.clear();
        text.sendKeys(name);

        return this;
    }
    public EditarPerfilPage alterarDataNascimento(String data){
        navegador.findElement(By.xpath("//*[.='Data Nascimento']/following-sibling::input")).sendKeys(data);

        return this;
    }

    public HomePage buttonSalvar(){
        navegador.findElement(By.xpath("//*[@value='Salvar']")).click();
        navegador.findElement(By.xpath("//*[.='Fechar']")).click();
        return new HomePage(navegador);
    }

    public HomePage editarPerfil(String name, String data){
        return addFoto().alterarNome(name).alterarDataNascimento(data).buttonSalvar();
    }
}

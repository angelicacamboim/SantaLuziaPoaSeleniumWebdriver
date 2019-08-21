package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import suporte.Web;

import java.util.LinkedList;

public class SantaLuziaTest {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createChrome("http://teste.santaluziapoa.org.br");
    }
    @Test
    public void editarPerfil(){
        HomePage home = new HomePage(navegador).clickButtonLogin().fazerLogin("vhds@hubwebsite.tk", "12345678")
                .clickIconPerfil().clickButtonEditar().editarPerfil("Teste automatizado (Editado)", "20/10/1999");
    }

   // @After
    public void tearDown() {
        navegador.quit();
    }

}

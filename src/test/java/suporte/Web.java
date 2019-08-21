package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Web extends Thread {

    public static final String USERNAME = "username";
    public static final String AUTOMATE_KEY = "password";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static WebDriver createChrome(String url) {
        /* Abrindo o navegador */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        navegador.get(url);

        return navegador;
    }
    public static WebDriver createFirefox(String url) {
        /* Abrindo o navegador */
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver navegador = new FirefoxDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       navegador.get(url);

        return navegador;
    }

    public static WebDriver createBrowserStack(String url) {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "60.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1280x800");
        caps.setCapability("browserstack.debug", "true");

        WebDriver navegador = null;

        try {
            navegador = new RemoteWebDriver(new URL(URL), caps);
            navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Navegando para a página do Taskit!
            navegador.get(url);
        } catch (MalformedURLException e) {
            System.out.println("Houveram problemas com a URL: " + e.getMessage());
        }
        return navegador;
    }
}

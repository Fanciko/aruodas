import org.example.models.Plot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class PlotTests {
    public static WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        acceptcookies();
    }

    private void acceptcookies() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11&offer_type=1");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @Test
    public void positiveTest(){
        Plot a = new Plot(driver,"Klaipeda","Klaipėdos m.","laukinink","laukinink","22","1111-1111-1111","27",new int[]{1,2,3},new int[]{1,2,3},true,false,"Parduodu sklypa","selling a plot","Ruski karabliki***",new String[]{","},"https://www.youtube.com/watch?v=xawlGMAdpAo","https://www.klapty.com/p/mag-b/t/example-virtual-tour-apartment-1-41145","279999","64345599","jonas@moneymaker.com",true,true,4,true);
        a.fill();

    }
}

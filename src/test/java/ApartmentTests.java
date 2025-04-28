import org.example.models.Apartament;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ApartmentTests {
    public static WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        acceptcookies();
    }

    private void acceptcookies() {
        driver.get("https://en.aruodas.lt/ideti-skelbima/?obj=1");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @Test
    public void positiveTest(){
        Apartament a = new Apartament(driver,"Klaipeda","Klaipėdos m.","laukinink","laukinink","22","27","1111-1111-1111","64",3,"9","9","1994",1,1, new int[]{1, 2},1, new int[]{1, 2}, new int[]{2, 4, 13, 15, 22, 26, 35, 37},false,false,1,"Geras butas","Nice apartment","Paruski nepagavari",new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"},"www.youtube.com/gerasbutas","www.3dtour.com/gerasbutas","127999","64345599","jonas@moneymaker.com",true,true,1,true);
        a.fill();
    }
}

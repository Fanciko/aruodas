import org.example.Helper;
import org.example.models.Apartament;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ApartmentTests {
    public static WebDriver driver;

    @BeforeClass
    public void setUp() {
        Helper.setUp();
        driver = Helper.driver;
    }

    @BeforeMethod
    public void beforeMethod(){
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=1&offer_type=1");
    }

    @Test
    public void positiveTest() {
        Apartament a = new Apartament("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "Geras butas", "Nice apartment", "Paruski nepagavari", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "www.youtube.com/gerasbutas", "www.3dtour.com/gerasbutas", "127999", "64345599", "jonas@moneymaker.com", true, true, 1, true, "27", "22", "64", 3, "9", "9", "1994", 1, 1, new int[]{1, 2}, 1, new int[]{1, 2}, new int[]{2, 4, 13, 15, 22, 26, 35, 37}, 1);
        a.fill();
    }
}

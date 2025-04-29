import org.example.Helper;
import org.example.models.Plot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlotTests {
    public static WebDriver driver;

    @BeforeClass
    public void setUp() {
        Helper.setUp();
        driver = Helper.driver;
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11&offer_type=1");
    }

    @Test
    public void positiveTest() {
        Plot a = new Plot("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "Parduodu sklypa", "selling a plot", "Ruski karabliki***", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "https://www.klapty.com/p/mag-b/t/example-virtual-tour-apartment-1-41145", "279999", "64345599", "jonas@moneymaker.com", true, true, 4, true, "27", "22", new int[]{1, 2, 3}, new int[]{1, 2, 3});
        a.fill();
    }
}

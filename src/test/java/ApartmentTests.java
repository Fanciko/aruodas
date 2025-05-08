import org.example.Helper;
import org.example.models.Apartament;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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
        Apartament a = new Apartament("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "Geras butas", "Nice apartment", "Paruski nepagavari", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "www.3dtour.com/gerasbutas", "127999", "64345599", "jonas@moneymaker.com", true, true, 1, true, "27", "22", "64", 3, "9", "9", "1994", 1, 1, new int[]{1, 2}, 1, new int[]{1, 2}, new int[]{2, 4, 13, 15, 22, 26, 35, 37}, 1);
        a.fill();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div[1]/div[2]")).click();
        driver.findElement(By.id("submitFormButton")).click();
        wait(3000);
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/span")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(actual, "Paslaugų paketo pasirinkimas");
    }

    @Test
    public void withoutRcnumber() {
        Apartament a = new Apartament("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "", true, false, "Geras butas", "Nice apartment", "Paruski nepagavari", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "www.3dtour.com/gerasbutas", "127999", "64345599", "jonas@moneymaker.com", true, true, 1, true, "27", "22", "64", 3, "9", "9", "1994", 1, 1, new int[]{1, 2}, 1, new int[]{1, 2}, new int[]{2, 4, 13, 15, 22, 26, 35, 37}, 1);
        a.fill();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div[1]/div[2]")).click();
        driver.findElement(By.id("submitFormButton")).click();
        wait(3000);
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/span")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(actual, "Paslaugų paketo pasirinkimas");
    }

    @Test
    public void withoutNotes() {
        Apartament a = new Apartament("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "", "", "", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "www.3dtour.com/gerasbutas", "127999", "64345599", "jonas@moneymaker.com", true, true, 1, true, "27", "22", "64", 3, "9", "9", "1994", 1, 1, new int[]{1, 2}, 1, new int[]{1, 2}, new int[]{2, 4, 13, 15, 22, 26, 35, 37}, 1);
        a.fill();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div[1]/div[2]")).click();
        driver.findElement(By.id("submitFormButton")).click();
        wait(3000);
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/span")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(actual, "Paslaugų paketo pasirinkimas");
    }

    @Test
    public void withoutPhoto() {
        Apartament a = new Apartament("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "Geras butas", "Nice apartment", "Paruski nepagavari", new String[]{""}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "www.3dtour.com/gerasbutas", "127999", "64345599", "jonas@moneymaker.com", true, true, 1, true, "27", "22", "64", 3, "9", "9", "1994", 1, 1, new int[]{1, 2}, 1, new int[]{1, 2}, new int[]{2, 4, 13, 15, 22, 26, 35, 37}, 1);
        a.fill();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div[1]/div[2]")).click();
        driver.findElement(By.id("submitFormButton")).click();
        wait(3000);
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/span")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(actual, "Paslaugų paketo pasirinkimas");
    }

    @Test
    public void withoutLocation() {
        Apartament a = new Apartament("", "", "", "", "1111-1111-1111", true, false, "Geras butas", "Nice apartment", "Paruski nepagavari", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "www.3dtour.com/gerasbutas", "127999", "64345599", "jonas@moneymaker.com", true, true, 1, true, "27", "22", "64", 3, "9", "9", "1994", 1, 1, new int[]{1, 2}, 1, new int[]{1, 2}, new int[]{2, 4, 13, 15, 22, 26, 35, 37}, 1);
        a.fill();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div[1]/div[2]")).click();
        driver.findElement(By.id("submitFormButton")).click();
        wait(3000);
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/span")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(actual, "Paslaugų paketo pasirinkimas");
    }

    @Test
    public void withoutPhoneNumber() {
        Apartament a = new Apartament("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "Geras butas", "Nice apartment", "Paruski nepagavari", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "www.3dtour.com/gerasbutas", "127999", "", "jonas@moneymaker.com", true, true, 1, true, "27", "22", "64", 3, "9", "9", "1994", 1, 1, new int[]{1, 2}, 1, new int[]{1, 2}, new int[]{2, 4, 13, 15, 22, 26, 35, 37}, 1);
        a.fill();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div[1]/div[2]")).click();
        driver.findElement(By.id("submitFormButton")).click();
        wait(3000);
        String actual = "";
        try {
            actual = driver.findElement(By.className("error-arrow")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(actual, "Neteisingas telefono numeris");
    }

    @Test
    public void withoutHouseNumber() {
        Apartament a = new Apartament("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "Geras butas", "Nice apartment", "Paruski nepagavari", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "www.3dtour.com/gerasbutas", "127999", "64345599", "jonas@moneymaker.com", true, true, 1, true, "", "22", "64", 3, "9", "9", "1994", 1, 1, new int[]{1, 2}, 1, new int[]{1, 2}, new int[]{2, 4, 13, 15, 22, 26, 35, 37}, 1);
        a.fill();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div[1]/div[2]")).click();
        driver.findElement(By.id("submitFormButton")).click();
        wait(3000);
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/span")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(actual, "Paslaugų paketo pasirinkimas");
    }

    @Test
    public void withoutPlot() {
        Apartament a = new Apartament("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "Geras butas", "Nice apartment", "Paruski nepagavari", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "www.3dtour.com/gerasbutas", "127999", "64345599", "jonas@moneymaker.com", true, true, 1, true, "27", "22", "", 3, "9", "9", "1994", 1, 1, new int[]{1, 2}, 1, new int[]{1, 2}, new int[]{2, 4, 13, 15, 22, 26, 35, 37}, 1);
        a.fill();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div[1]/div[2]")).click();
        driver.findElement(By.id("submitFormButton")).click();
        wait(3000);
        String actual = "";
        try {
            actual = driver.findElement(By.className("error-arrow")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(actual, "Įveskite bendrą plotą");
    }

    @Test
    public void WithoutPrice() {
        Apartament a = new Apartament("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "Geras butas", "Nice apartment", "Paruski nepagavari", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "www.3dtour.com/gerasbutas", "", "64345599", "jonas@moneymaker.com", true, true, 1, true, "27", "22", "64", 3, "9", "9", "1994", 1, 1, new int[]{1, 2}, 1, new int[]{1, 2}, new int[]{2, 4, 13, 15, 22, 26, 35, 37}, 1);
        a.fill();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div[1]/div[2]")).click();
        driver.findElement(By.id("submitFormButton")).click();
        wait(3000);
        String actual = "";
        try {
            actual = driver.findElement(By.className("error-arrow")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(actual, "Neteisinga kaina");
    }

    @Test
    public void withoutEmail() {
        Apartament a = new Apartament("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "Geras butas", "Nice apartment", "Paruski nepagavari", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "www.3dtour.com/gerasbutas", "127999", "64345599", "", true, true, 1, true, "27", "22", "64", 3, "9", "9", "1994", 1, 1, new int[]{1, 2}, 1, new int[]{1, 2}, new int[]{2, 4, 13, 15, 22, 26, 35, 37}, 1);
        a.fill();
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div[1]/div[2]")).click();
        driver.findElement(By.id("submitFormButton")).click();
        wait(3000);
        String actual = "";
        try {
            actual = driver.findElement(By.className("error-arrow")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(actual, "Nurodykite el. pašto adresą, kad vėliau galėtumėte redaguoti arba pašalinti skelbimą");
    }

    public void wait(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
        }
    }
}

import org.example.Helper;
import org.example.models.Plot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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
        Plot a = new Plot("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "Parduodu sklypa", "selling a plot", "Ruski nypanimaju", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "https://www.klapty.com/p/mag-b/t/example-virtual-tour-apartment-1-41145", "279999", "64345599", "jonas@moneymaker.com", true, true, 4, true, "27", "22", new int[]{1, 2, 3}, new int[]{1, 2, 3});
        a.fill();
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
        Plot a = new Plot("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "", true, false, "Parduodu sklypa", "selling a plot", "Ruski nypanimaju", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "https://www.klapty.com/p/mag-b/t/example-virtual-tour-apartment-1-41145", "279999", "64345599", "jonas@moneymaker.com", true, true, 4, true, "27", "22", new int[]{1, 2, 3}, new int[]{1, 2, 3});
        a.fill();
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/span")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(actual, "Paslaugų paketo pasirinkimas");
    }

    @Test
    public void withoutNotes() {
        Plot a = new Plot("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "", "", "", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "https://www.klapty.com/p/mag-b/t/example-virtual-tour-apartment-1-41145", "279999", "64345599", "jonas@moneymaker.com", true, true, 4, true, "27", "22", new int[]{1, 2, 3}, new int[]{1, 2, 3});
        a.fill();
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/span")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(actual, "Paslaugų paketo pasirinkimas");
    }

    @Test
    public void withoutPhoto() {
        Plot a = new Plot("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "Parduodu sklypa", "selling a plot", "Ruski nypanimaju", new String[]{""}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "https://www.klapty.com/p/mag-b/t/example-virtual-tour-apartment-1-41145", "279999", "64345599", "jonas@moneymaker.com", true, true, 4, true, "27", "22", new int[]{1, 2, 3}, new int[]{1, 2, 3});
        a.fill();
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
        Plot a = new Plot("", "", "", "", "1111-1111-1111", true, false, "Parduodu sklypa", "selling a plot", "Ruski nypanimaju", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "https://www.klapty.com/p/mag-b/t/example-virtual-tour-apartment-1-41145", "279999", "64345599", "jonas@moneymaker.com", true, true, 4, true, "27", "22", new int[]{1, 2, 3}, new int[]{1, 2, 3});
        a.fill();
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
        Plot a = new Plot("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "Parduodu sklypa", "selling a plot", "Ruski nypanimaju", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "https://www.klapty.com/p/mag-b/t/example-virtual-tour-apartment-1-41145", "279999", "", "jonas@moneymaker.com", true, true, 4, true, "27", "22", new int[]{1, 2, 3}, new int[]{1, 2, 3});
        a.fill();
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
        Plot a = new Plot("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "Parduodu sklypa", "selling a plot", "Ruski nypanimaju", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "https://www.klapty.com/p/mag-b/t/example-virtual-tour-apartment-1-41145", "279999", "64345599", "jonas@moneymaker.com", true, true, 4, true, "", "22", new int[]{1, 2, 3}, new int[]{1, 2, 3});
        a.fill();
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
    public void withoutHectar() {
        Plot a = new Plot("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "Parduodu sklypa", "selling a plot", "Ruski nypanimaju", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "https://www.klapty.com/p/mag-b/t/example-virtual-tour-apartment-1-41145", "279999", "64345599", "jonas@moneymaker.com", true, true, 4, true, "27", "", new int[]{1, 2, 3}, new int[]{1, 2, 3});
        a.fill();
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
    public void withoutPrice() {
        Plot a = new Plot("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "Parduodu sklypa", "selling a plot", "Ruski nypanimaju", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "https://www.klapty.com/p/mag-b/t/example-virtual-tour-apartment-1-41145", "", "64345599", "jonas@moneymaker.com", true, true, 4, true, "27", "22", new int[]{1, 2, 3}, new int[]{1, 2, 3});
        a.fill();
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
        Plot a = new Plot("Klaipeda", "Klaipėdos m.", "laukinink", "laukinink", "1111-1111-1111", true, false, "Parduodu sklypa", "selling a plot", "Ruski nypanimaju", new String[]{"C:\\Users\\Jonas\\IdeaProjects\\aruodas\\src\\photos\\parduodamas.jpg"}, "https://www.youtube.com/watch?v=xawlGMAdpAo", "https://www.klapty.com/p/mag-b/t/example-virtual-tour-apartment-1-41145", "279999", "64345599", "", true, true, 4, true, "27", "22", new int[]{1, 2, 3}, new int[]{1, 2, 3});
        a.fill();
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



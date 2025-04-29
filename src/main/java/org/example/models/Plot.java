package org.example.models;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Plot extends RealEstate {
    public String houseNumber;
    public String hectar;
    public int[] intendances;
    public int[] specials;

    public Plot(String region, String district, String quartal, String street, String rcNumber, boolean interestedChange, boolean auction, String notes_lt, String notes_en, String notes_ru, String[] photos, String video, String tour3d, String price, String phone, String email, boolean dontShowEmail, boolean dontWantChat, int accountType, boolean cbagreeToRules, String houseNumber, String hectar, int[] intendances, int[] specials) {
        super(region, district, quartal, street, rcNumber, interestedChange, auction, notes_lt, notes_en, notes_ru, photos, video, tour3d, price, phone, email, dontShowEmail, dontWantChat, accountType, cbagreeToRules);
        this.houseNumber = houseNumber;
        this.hectar = hectar;
        this.intendances = intendances;
        this.specials = specials;
    }

    @Override
    public void fill() {
        super.fill();
        fillHectar();
        fillIntendances();
        fillSpecials();
        fillHouseNumber();
    }

    private void fillSpecials() {
        List<WebElement> specials = driver.findElements(By.xpath("//input[@name='Special[]']/following-sibling::label"));
        for (int i = 0; i < this.specials.length; i++) {
            switch (this.specials[i]) {
                case 1: specials.get(0).click();break;
                case 2: specials.get(1).click();break;
                case 3: specials.get(2).click();break;
                case 4: specials.get(3).click();break;
                case 5: specials.get(4).click();break;
                case 6: specials.get(5).click();break;
                case 7: specials.get(6).click();break;
                case 8: specials.get(7).click();break;
                case 9: specials.get(8).click();break;
            }
        }
    }

    private void fillIntendances() {
        List<WebElement> intendances = driver.findElements(By.xpath("//input[@name='FIntendance[]']/following-sibling::label"));
        for (int i = 0; i < this.intendances.length; i++) {
            switch (this.intendances[i]) {
                case 1: intendances.get(0).click();break;
                case 2: intendances.get(1).click();break;
                case 3: intendances.get(2).click();break;
                case 4: intendances.get(3).click();break;
                case 5: intendances.get(4).click();break;
                case 6: intendances.get(5).click();break;
                case 7: intendances.get(6).click();break;
                case 8: intendances.get(7).click();break;
                case 9: intendances.get(8).click();break;
                case 10: intendances.get(9).click();break;
            }
        }
    }
    private void fillHouseNumber() {
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/input")).sendKeys(this.houseNumber);
    }

    private void fillHectar() {
        this.driver.findElement(By.xpath("//*[@id=\"fieldFAreaOverAll\"]")).sendKeys(this.hectar);
    }

    public void wait(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
        }
    }
}

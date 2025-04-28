package org.example.models;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Plot {
    public WebDriver driver;
    public String region;
    public String district;
    public String quartal;
    public String street;
    public String houseNumber;
    public String rcNumber;
    public String hectar;
    public int[] intendances;
    public int[] specials;
    public boolean interestedChange;
    public boolean auction;
    public String notes_lt;
    public String notes_en;
    public String notes_ru;
    public String[] photos;
    public String video;
    public String tour3d;
    public String price;
    public String phone;
    public String email;
    public boolean dontShowInAds;
    public boolean cbdontWantChat;
    public int accountType;
    public boolean cbagreeToRules;

    public Plot() {
    }

    public Plot(WebDriver driver, String region, String district, String quartal, String street, String houseNumber, String rcNumber, String hectar, int[] intendances, int[] specials, boolean interestedChange, boolean auction, String notes_lt, String notes_en, String notes_ru, String[] photos, String video, String tour3d, String price, String phone, String email, boolean dontShowInAds, boolean cbdontWantChat, int accountType, boolean cbagreeToRules) {
        this.driver = driver;
        this.region = region;
        this.district = district;
        this.quartal = quartal;
        this.street = street;
        this.houseNumber = houseNumber;
        this.rcNumber = rcNumber;
        this.hectar = hectar;
        this.intendances = intendances;
        this.specials = specials;
        this.interestedChange = interestedChange;
        this.auction = auction;
        this.notes_lt = notes_lt;
        this.notes_en = notes_en;
        this.notes_ru = notes_ru;
        this.photos = photos;
        this.video = video;
        this.tour3d = tour3d;
        this.price = price;
        this.phone = phone;
        this.email = email;
        this.dontShowInAds = dontShowInAds;
        this.cbdontWantChat = cbdontWantChat;
        this.accountType = accountType;
        this.cbagreeToRules = cbagreeToRules;
    }

    public void fill() {
        fillRegion();
        fillDistrict();
        fillQuartal();
        fillStreet();
        fillHouseNumber();
        fillRcNumber();
        fillHectar();
        fillIntendances();
        fillSpecials();
        fillInterestedChange();
        fillAuction();
        fillNotes_lt();
        fillNotes_en();
        fillNotes_ru();
        fillPhotos();
        fillVideo();
        fillTour3d();
        fillPrice();
        fillPhone();
        fillEmail();
        fillDontShowInAds();
        fillCbdontWantChat();
        fillAccountType();
        fillCbagreeToRules();


    }

    private void fillCbagreeToRules() {
        if (this.cbagreeToRules) {
            this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[41]/span[1]/div/div/label/span")).click();
        }
    }

    private void fillAccountType() {
    List<WebElement> opts = driver.findElement(By.xpath("//div[@data-key='AccountType']")).findElements(By.className("input-button"));
    opts.get(this.accountType-1).click();
    }

    private void fillCbdontWantChat() {
        if (this.cbdontWantChat) {
            this.driver.findElement(By.xpath("//input[@name='dont_want_chat']/following-sibling::label")).click();
        }
    }

    private void fillDontShowInAds() {
        if (this.dontShowInAds) {
            this.driver.findElement(By.xpath("//input[@name='dont_show_in_ads']/following-sibling::label")).click();
        }
    }

    private void fillEmail() {
        this.driver.findElement(By.name("email")).sendKeys(this.email);
    }

    private void fillPhone() {
        this.driver.findElement(By.name("phone")).sendKeys(this.phone);
    }

    private void fillPrice() {
        this.driver.findElement(By.id("priceField")).sendKeys(this.price);
    }

    private void fillTour3d() {
        this.driver.findElement(By.name("tour_3d")).sendKeys(this.tour3d);
    }

    private void fillVideo() {
        this.driver.findElement(By.name("Video")).sendKeys(this.video);
    }

    private void fillPhotos() {
        this.driver.findElement(By.xpath("//*[@id=\"uploadPhotoBtn\"]/input")).sendKeys(this.photos);
    }

    private void fillNotes_ru() {
        wait(2000);
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[26]/div/div[3]/label")).click();
        this.driver.findElement(By.name("notes_ru")).sendKeys(this.notes_ru);
    }

    private void fillNotes_en() {
        wait(2000);
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[26]/div/div[2]/label")).click();
        this.driver.findElement(By.name("notes_en")).sendKeys(this.notes_en);
    }

    private void fillNotes_lt() {
        this.driver.findElement(By.name("notes_lt")).sendKeys(this.notes_lt);
    }

    private void fillAuction() {
        if (this.auction) {
            this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[23]/div/div/div/label/span")).click();
        }
    }

    private void fillInterestedChange() {
        if (this.interestedChange) {
            this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[22]/div/div/div/label/span")).click();
        }

    }

    private void fillSpecials() {
        this.driver.findElement(By.xpath("//*[@id=\"showMoreFields\"]")).click();
        List<WebElement> specials = driver.findElements(By.xpath("//input[@name='Special[]']/following-sibling::label"));
        for (int i = 0; i < this.specials.length; i++) {
            switch (this.specials[i]) {
                case 1:
                    specials.get(0).click();
                    break;
                case 2:
                    specials.get(1).click();
                    break;
                case 3:
                    specials.get(2).click();
                    break;
                case 4:
                    specials.get(3).click();
                    break;
                case 5:
                    specials.get(4).click();
                    break;
                case 6:
                    specials.get(5).click();
                    break;
                case 7:
                    specials.get(6).click();
                    break;
                case 8:
                    specials.get(7).click();
                    break;
                case 9:
                    specials.get(8).click();
                    break;
            }
        }
    }

    private void fillIntendances() {
        List<WebElement> intendances = driver.findElements(By.xpath("//input[@name='FIntendance[]']/following-sibling::label"));
        for (int i = 0; i < this.intendances.length; i++) {
            switch (this.intendances[i]) {
                case 1:
                    intendances.get(0).click();
                    break;
                case 2:
                    intendances.get(1).click();
                    break;
                case 3:
                    intendances.get(2).click();
                    break;
                case 4:
                    intendances.get(3).click();
                    break;
                case 5:
                    intendances.get(4).click();
                    break;
                case 6:
                    intendances.get(5).click();
                    break;
                case 7:
                    intendances.get(6).click();
                    break;
                case 8:
                    intendances.get(7).click();
                    break;
                case 9:
                    intendances.get(8).click();
                    break;
                case 10:
                    intendances.get(9).click();
                    break;
            }
        }
    }

    private void fillHectar() {
        this.driver.findElement(By.xpath("//*[@id=\"fieldFAreaOverAll\"]")).sendKeys(this.hectar);
    }

    private void fillRcNumber() {
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[11]/div[1]/input")).sendKeys(this.rcNumber);
    }

    private void fillHouseNumber() {
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/input")).sendKeys(this.houseNumber);
    }

    private void fillStreet() {
        this.driver.findElements(By.className("dropdown-input-value-title")).get(3).click();
        this.driver.findElement(By.xpath("//*[@id=\"streets_7\"]/li[1]/input")).sendKeys(this.street);
        this.driver.findElement(By.xpath("//*[@id=\"streets_7\"]/li[514]")).click();
    }

    private void fillQuartal() {
        this.driver.findElements(By.className("dropdown-input-value-title")).get(2).click();
        this.driver.findElement(By.xpath("//*[@id=\"quartals_7\"]/li[1]/input")).sendKeys(this.quartal);
        this.driver.findElement(By.xpath("//*[@id=\"quartals_7\"]/li[33]")).click();

    }

    private void fillDistrict() {
//        this.driver.findElements(By.className("dropdown-input-value-title")).get(1).click();
//        this.driver.findElement(By.className("dropdown-input-search-value")).sendKeys(this.region);
//        this.driver.findElement(By.className("dropdown-input-search-value")).sendKeys(Keys.ENTER);
    }

    private void fillRegion() {
        this.driver.findElements(By.className("dropdown-input-value-title")).get(0).click();
        this.driver.findElement(By.className("dropdown-input-search-value")).sendKeys(this.region);
        wait(2000);
        this.driver.findElement(By.className("dropdown-input-search-value")).sendKeys(Keys.ENTER);
    }

    public void wait(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
        }
    }
}

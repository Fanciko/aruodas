package org.example.models;
import org.example.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class RealEstate {
    public WebDriver driver;
    public String region;
    public String district;
    public String quartal;
    public String street;
    public String rcNumber;
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
    public boolean dontShowEmail;
    public boolean dontWantChat;
    public int accountType;
    public boolean cbagreeToRules;

    public RealEstate(String region, String district, String quartal, String street, String rcNumber, boolean interestedChange, boolean auction, String notes_lt, String notes_en, String notes_ru, String[] photos, String video, String tour3d, String price, String phone, String email, boolean dontShowEmail, boolean dontWantChat, int accountType, boolean cbagreeToRules) {
        this.driver = Helper.driver;
        this.region = region;
        this.district = district;
        this.quartal = quartal;
        this.street = street;
        this.rcNumber = rcNumber;
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
        this.dontShowEmail = dontShowEmail;
        this.dontWantChat = dontWantChat;
        this.accountType = accountType;
        this.cbagreeToRules = cbagreeToRules;
    }

    public void fill() {
        fillRegion();
        fillDistrict();
        fillQuartal();
        fillStreet();
        fillRcNumber();
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
        filldontShowEmail();
        fillDontWantChat();
        fillAccountType();
        fillcCbagreeToRules();
    }

    private void fillcCbagreeToRules() {
        if (this.cbagreeToRules) {
            this.driver.findElement(By.xpath("//input[@name='agree_to_rules']/following-sibling::label/span")).click();
        }
    }

    private void fillAccountType() {
        List<WebElement> opts = driver.findElement(By.xpath("//div[@data-key='AccountType']")).findElements(By.className("input-button"));
        opts.get(this.accountType - 1).click();
    }

    private void fillDontWantChat() {
        if (this.dontWantChat) {
            this.driver.findElement(By.xpath("//input[@name='dont_want_chat']/following-sibling::label")).click();
        }
    }

    private void filldontShowEmail() {
        if (this.dontShowEmail) {
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
        this.driver.findElement(By.xpath("//input[@id='langRu']/following-sibling::label")).click();
        this.driver.findElement(By.name("notes_ru")).sendKeys(this.notes_ru);
    }

    private void fillNotes_en() {
        wait(2000);
        this.driver.findElement(By.xpath("//input[@id='langEn']/following-sibling::label")).click();
        this.driver.findElement(By.name("notes_en")).sendKeys(this.notes_en);
    }

    private void fillNotes_lt() {
        this.driver.findElement(By.name("notes_lt")).sendKeys(this.notes_lt);
    }

    private void fillAuction() {
        if (this.auction) {
            this.driver.findElement(By.xpath("//input[@name='auction']/following-sibling::label")).click();
        }
    }

    private void fillInterestedChange() {
        if (this.interestedChange) {
            this.driver.findElement(By.id("showMoreFields")).click();
            this.driver.findElement(By.xpath("//input[@name='InterestedChange']/following-sibling::label")).click();
        }
    }

    private void fillRcNumber() {
        this.driver.findElement(By.name("RCNumber")).sendKeys(this.rcNumber);
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

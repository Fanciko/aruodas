package org.example.models;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Apartament extends RealEstate {
    public String houseNumber;
    public String apartmentNumber;
    public String plot;
    public int rooms;
    public String floors;
    public String floors2;
    public String buildingYears;
    public int buildingType;
    public int equipment;
    public int[] heatingSystem;
    public int type;
    public int[] windowOrientation;
    public int[] specials;
    public int buildingEnergyClass;

    public Apartament(String region, String district, String quartal, String street, String rcNumber, boolean interestedChange, boolean auction, String notes_lt, String notes_en, String notes_ru, String[] photos, String video, String tour3d, String price, String phone, String email, boolean dontShowEmail, boolean dontWantChat, int accountType, boolean cbagreeToRules, String houseNumber, String apartmentNumber, String plot, int rooms, String floors, String floors2, String buildingYears, int buildingType, int equipment, int[] heatingSystem, int type, int[] windowOrientation, int[] specials, int buildingEnergyClass) {
        super(region, district, quartal, street, rcNumber, interestedChange, auction, notes_lt, notes_en, notes_ru, photos, video, tour3d, price, phone, email, dontShowEmail, dontWantChat, accountType, cbagreeToRules);
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.plot = plot;
        this.rooms = rooms;
        this.floors = floors;
        this.floors2 = floors2;
        this.buildingYears = buildingYears;
        this.buildingType = buildingType;
        this.equipment = equipment;
        this.heatingSystem = heatingSystem;
        this.type = type;
        this.windowOrientation = windowOrientation;
        this.specials = specials;
        this.buildingEnergyClass = buildingEnergyClass;
    }

    @Override
    public void fill() {
        super.fill();
        fillHouseNumber();
        fillApartmentNumber();
        fillPlot();
        fillRooms();
        fillFloors();
        fillFloors2();
        fillBuildingYears();
        fillBuildingType();
        fillEquipment();
        fillHeatingSystem();
        fillType();
        fillWindowOrientation();
        fillSpecials();
        fillBuildingEnergyClass();
    }

    private void fillBuildingEnergyClass() {
        List<WebElement> opts = driver.findElement(By.xpath("//div[@data-key='house_efficiency']")).findElements(By.className("input-button"));
        opts.get(this.buildingEnergyClass - 1).click();
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
                case 10: specials.get(9).click();break;
                case 11: specials.get(10).click();break;
                case 12: specials.get(11).click();break;
                case 13: specials.get(12).click();break;
                case 14: specials.get(13).click();break;
                case 15: specials.get(14).click();break;
                case 16: specials.get(15).click();break;
                case 17: specials.get(16).click();break;
                case 18: specials.get(17).click();break;
                case 19: specials.get(18).click();break;
                case 20: specials.get(19).click();break;
                case 21: specials.get(20).click();break;
                case 22: specials.get(21).click();break;
                case 23: specials.get(22).click();break;
                case 24: specials.get(23).click();break;
                case 25: specials.get(24).click();break;
                case 26: specials.get(25).click();break;
                case 27: specials.get(26).click();break;
                case 28: specials.get(27).click();break;
                case 29: specials.get(28).click();break;
                case 30: specials.get(29).click();break;
                case 31: specials.get(30).click();break;
                case 32: specials.get(31).click();break;
                case 33: specials.get(32).click();break;
                case 34: specials.get(33).click();break;
                case 35: specials.get(34).click();break;
                case 36: specials.get(35).click();break;
                case 37: specials.get(36).click();break;
            }
        }
    }

    private void fillWindowOrientation() {
        List<WebElement> windowOrientation = driver.findElements(By.xpath("//input[@name='windows_direction[]']/following-sibling::label"));
        for (int i = 0; i < this.windowOrientation.length; i++) {
            switch (this.windowOrientation[i]) {
                case 1: windowOrientation.get(0).click();break;
                case 2: windowOrientation.get(1).click();break;
                case 3: windowOrientation.get(2).click();break;
                case 4: windowOrientation.get(3).click();break;
            }
        }
    }

    private void fillType() {
        List<WebElement> opts = driver.findElement(By.xpath("//div[@data-key='ApartmentType']")).findElements(By.className("input-button"));
        opts.get(this.type - 1).click();
    }

    private void fillHeatingSystem() {
        List<WebElement> heatingSystem = driver.findElements(By.xpath("//input[@name='FWarmSystem[]']/following-sibling::label"));
        for (int i = 0; i < this.heatingSystem.length; i++) {
            switch (this.heatingSystem[i]) {
                case 1: heatingSystem.get(0).click();break;
                case 2: heatingSystem.get(1).click();break;
                case 3: heatingSystem.get(2).click();break;
                case 4: heatingSystem.get(3).click();break;
                case 5: heatingSystem.get(4).click();break;
                case 6: heatingSystem.get(5).click();break;
                case 7: heatingSystem.get(6).click();break;
                case 8: heatingSystem.get(7).click();break;
                case 9: heatingSystem.get(8).click();break;
                case 10: heatingSystem.get(9).click();break;
            }
        }
    }

    private void fillEquipment() {
        List<WebElement> opts = driver.findElement(By.xpath("//div[@data-key='FHouseState']")).findElements(By.className("input-button"));
        opts.get(this.equipment - 1).click();
    }

    private void fillBuildingType() {
        List<WebElement> opts = driver.findElement(By.xpath("//div[@data-key='FHouseType']")).findElements(By.className("input-button"));
        opts.get(this.buildingType - 1).click();
    }

    private void fillBuildingYears() {
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/div[1]/span[1]/span/input")).sendKeys(this.buildingYears);
    }

    private void fillFloors2() {
        this.driver.findElement(By.xpath("//*[@id=\"fieldRow_FHouseHeight\"]/span[1]/input")).sendKeys(this.floors2);
    }

    private void fillFloors() {
        this.driver.findElement(By.xpath("//*[@id=\"fieldRow_FFloor\"]/div[1]/span[2]/input")).sendKeys(this.floors);
    }

    private void fillRooms() {
        List<WebElement> rooms = driver.findElement(By.xpath("//div[@data-key='FRoomNum']")).findElements(By.className("input-button"));
        rooms.get(this.rooms - 1).click();
    }

    private void fillPlot() {
        this.driver.findElement(By.xpath("//*[@id=\"fieldFAreaOverAll\"]")).sendKeys(this.plot);
    }


    private void fillApartmentNumber() {
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[8]/span[1]/input")).sendKeys(this.apartmentNumber);
    }

    private void fillHouseNumber() {
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/input")).sendKeys(this.houseNumber);
    }
}



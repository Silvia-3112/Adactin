package Pom;

import Base.Base_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search_Hotel extends Base_Class {
    WebDriver driver;

    public Search_Hotel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "location")
    private WebElement selectlocation;

    @FindBy(id = "hotels")
    private WebElement selecthotel;

    @FindBy(id = "room_type")
    private WebElement selectroom;

    @FindBy(id = "room_nos")
    private WebElement noofrooms;

    @FindBy(id = "datepick_in")
    private WebElement checkindate;

    @FindBy(id = "datepick_out")
    private WebElement checkoutdate;

    @FindBy(id = "adult_room")
    private WebElement adultperroom;

    @FindBy(id = "child_room")
    private WebElement childrenperroom;

    @FindBy(id = "Submit")
    private WebElement searchBtn;

    public boolean verifyUrl(String link) {
        String currentUrl = driver.getCurrentUrl();
        boolean containsUrl = currentUrl.contains(link);
        return containsUrl;
    }

    public void selLocation() {
        Select s = new Select(selectlocation);
        s.selectByVisibleText("Los Angeles");
    }

    public void selhotel() {
        Select s = new Select(selecthotel);
        s.selectByVisibleText("Hotel Hervey");
    }

    public void selroom() {
        Select s = new Select(selectroom);
        s.selectByVisibleText("Double");
    }

    public void roomnos() {
        Select s = new Select(noofrooms);
        s.selectByValue("2");
    }

    public void selCheckInDate(String checkin) {
        checkindate.sendKeys(checkin);
    }

    public void selCheckOutDate(String checkout) {
        checkoutdate.sendKeys(checkout);
    }
    public void selAdultRoom(){
        Select s = new Select(adultperroom);
        s.selectByValue("2");
    }
    public void selChildRoom(){
        Select s = new Select(childrenperroom);
        s.selectByValue("2");
    }
    public void clickSearchBtn(){
        searchBtn.click();
    }
}
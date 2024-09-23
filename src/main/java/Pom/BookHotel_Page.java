package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookHotel_Page {
    WebDriver driver;

    public BookHotel_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "first_name")
    private WebElement firstname;

    @FindBy(id = "last_name")
    private WebElement lastname;

    @FindBy(id = "address")
    private WebElement billingAddress;

    @FindBy(id = "cc_num")
    private WebElement creditCardNo;

    @FindBy(id = "cc_type")
    private WebElement ccType;

    @FindBy(id = "cc_exp_month")
    private WebElement expiryMonth;

    @FindBy(id = "cc_exp_year")
    private WebElement expiryYear;

    @FindBy(id = "cc_cvv")
    private WebElement cvvNumber;

    @FindBy(id = "book_now")
    private WebElement bookNowBtn;

    public boolean verifyUrl(String link) {
        String currentUrl = driver.getCurrentUrl();
        boolean containsUrl = currentUrl.contains(link);
        return containsUrl;
    }

    public void addFirstName(String name1) {
        firstname.sendKeys(name1);
    }

    public void addLastName(String name2) {
        lastname.sendKeys(name2);
    }

    public void addAddress(String address) {
        billingAddress.sendKeys(address);
    }

    public void addCreditCard(String num) {
        creditCardNo.sendKeys(num);
    }
    public void selCcType(){
        Select s = new Select(ccType);
        s.selectByVisibleText("American Express");
    }
    public void selExpMonth(){
        Select s = new Select(expiryMonth);
        s.selectByVisibleText("December");
    }
    public void selExpYear(){
        Select s = new Select(expiryYear);
        s.selectByVisibleText("2030");
    }
    public void selCVV(String num){
        cvvNumber.sendKeys(num);
    }
    public void clickBookBtn(){
        bookNowBtn.click();
    }
}
package Pom;

import Base.Base_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel extends Base_Class {
    WebDriver driver;
    public Select_Hotel(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public boolean verifyUrl(String link) {
        String currentUrl = driver.getCurrentUrl();
        boolean containsUrl = currentUrl.contains(link);
        return containsUrl;
    }
    @FindBy(id="radiobutton_0")
    private WebElement radioButton;

    @FindBy(id="continue")
    private WebElement continueButton;

    public void clickRadBtn(){
        radioButton.click();
    }
    public void clickContBtn(){
        continueButton.click();
    }
}

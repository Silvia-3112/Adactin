package Pom;

import Base.Base_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page extends Base_Class {
    WebDriver driver;
    public Login_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="username")
    private WebElement enterusername;

    @FindBy(id="password")
    private WebElement enterpassword;

    @FindBy(id="login")
    private WebElement loginBtn;

    public boolean verifyurl(String url) {
        String currentUrl = driver.getCurrentUrl();
        boolean containsUrl = currentUrl.contains(url);
        return containsUrl;
    }

    public void login(String username,String password) {
        enterusername.sendKeys("SilviaAlwin");
        enterpassword.sendKeys("silvia3112");
    }
    public void clickLoginBtn(){
        loginBtn.click();
    }
}

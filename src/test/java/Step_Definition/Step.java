package Step_Definition;


import Base.Base_Class;
import Pom.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;

import static Base.Base_Class.driver;
import static Base.Base_Class.quit;
import static java.awt.SystemColor.text;

public class Step {
    Login_Page login_page;
    Search_Hotel search_hotel;
    Select_Hotel select_hotel;
    BookHotel_Page bookhotel_page;
    Confirmation_Page confirmation_page;

    @Given("Launch {string} and url {string}")
    public void launchAndUrl(String browser, String url) {
        Base_Class.initializeBrowser(browser);
        Base_Class.windowMax();
        Base_Class.launchBrowser(url);
        Base_Class.waitImplicitly();
        login_page = new Login_Page(driver);
        search_hotel = new Search_Hotel(driver);
        select_hotel = new Select_Hotel(driver);
        bookhotel_page = new BookHotel_Page(driver);
        confirmation_page = new Confirmation_Page(driver);
    }

    @When("User login by entering username as {string} and password as {string}")
    public void userLoginByEnteringUsernameAsAndPasswordAs(String username, String password) {
        login_page.login(username,password);
        login_page.clickLoginBtn();
    }

    @Then("User lands on search hotel page and verifies the URL contains {string} text")
    public void userLandsOnSearchHotelPageAndVerifiesTheURLContainsText(String text) {
        Assert.assertTrue(search_hotel.verifyUrl(text));
    }

    @When("User selects Los Angeles in location")
    public void userSelectsLosAngelesInLocation() {
        search_hotel.selLocation();
    }

    @When("User selects Hotel Hervey")
    public void userSelectsHotelHervey() {
        search_hotel.selhotel();
    }

    @When("User selcts Double room type")
    public void userSelctsDoubleRoomType() {
        search_hotel.selroom();
    }

    @When("User selects two number of rooms")
    public void userSelectsTwoNumberOfRooms() {
        search_hotel.roomnos();
    }

    @When("User adds check in date {string}")
    public void userAddsCheckInDate(String indate) {
        search_hotel.selCheckInDate(indate);
    }

    @When("User adds check out date {string}")
    public void userAddsCheckOutDate(String outdate) {
        search_hotel.selCheckOutDate(outdate);
    }

    @When("User selects two adults")
    public void userSelectsTwoAdults() {
        search_hotel.selAdultRoom();
    }

    @When("User selects two children")
    public void userSelectsTwoChildren() {
        search_hotel.selChildRoom();
    }

    @When("User clicks on search button")
    public void userClicksOnSearchButton() {
        search_hotel.clickSearchBtn();
    }

    @Then("User lands on select hotel page and verifies the URL contains {string} text")
    public void userLandsOnSelectHotelPageAndVerifiesTheURLContainsText(String text1) {
        Assert.assertTrue(select_hotel.verifyUrl(text1));
    }

    @When("User selects radio button")
    public void userSelectsRadioButton() {
        select_hotel.clickRadBtn();
    }

    @When("User clicks on continue button")
    public void userClicksOnContinueButton() {
        select_hotel.clickContBtn();
    }

    @Then("User lands on book hotel page and verifies the URL contains {string} text")
    public void userLandsOnBookHotelPageAndVerifiesTheURLContainsText(String text2) {
   Assert.assertTrue(bookhotel_page.verifyUrl(text2));
    }

    @Then("User enters first name as {string}")
    public void userEntersFirstNameAs(String name1) {
   bookhotel_page.addFirstName(name1);
    }

    @Then("User enters last name as {string}")
    public void userEntersLastNameAs(String name2) {
        bookhotel_page.addLastName(name2);
    }

    @Then("User enters billing address as {string}")
    public void userEntersBillingAddressAs(String address) {
        bookhotel_page.addAddress(address);
    }

    @Then("User enters credit card number {string}")
    public void userEntersCreditCardNumber(String num) {
        bookhotel_page.addCreditCard(num);
    }

    @Then("User selects Visa credit card")
    public void userSelectsVisaCreditCard() {
        bookhotel_page.selCcType();
    }

    @Then("User selects month and year in expiry date")
    public void userSelectsMonthAndYearInExpiryDate() {
        bookhotel_page.selExpMonth();
        bookhotel_page.selExpYear();
    }

    @Then("User enters CVV number {string}")
    public void userEntersCVVNumber(String num) {
        bookhotel_page.selCVV(num);
    }

    @Then("User click on book now button")
    public void userClickOnBookNowButton() {
        bookhotel_page.clickBookBtn();
    }

    @Given("User takes screenshot of the booking confirmation page")
    public void userTakesScreenshotOfTheBookingConfirmationPage() throws IOException, InterruptedException {
    confirmation_page.screenShot();
    }

    @Then("User quits the browser")
    public void userQuitsTheBrowser() {
    quit();
    }
}
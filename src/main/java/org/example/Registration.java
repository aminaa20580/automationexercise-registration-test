package org.example;//package org.example;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Registration {
     protected WebDriver driver ;
    protected WebDriverWait wait;
    private final By nameField = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
    private final By emailField = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
    private final By signUpButton = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
    public final By password = By.id("password");
    public final By day = By.id("days");
    public final By month = By.id("months");
    public final By year = By.id("years");
    public final By newsletterCheckbox = By.xpath("//*[@id=\"newsletter\"]");
    public final By specialOffersCheckbox = By.xpath("//*[@id=\"optin\"]");

    public final By firstName = By.id("first_name");
    public final By lastName = By.id("last_name");
    public final By company = By.id("company");
    public final By address1 = By.id("address1");
    public final By address2 = By.id("address2");
    public final By country = By.id("country");
    public final By state = By.id("state");
    public final By city = By.id("city");
    public final By zipcode = By.id("zipcode");
    public final By mobileNumber = By.id("mobile_number");
    public final By createButton = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");

    public Registration (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }



    public void click(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void newUser (String userName , String email) {
        driver.findElement(nameField).sendKeys(userName);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(signUpButton).click();
//        return this;

    }
    public void randomOption (By dropdownLocator) {
        Select select = new Select(driver.findElement(dropdownLocator));
        int randomIndex = new Random().nextInt(select.getOptions().size()-1) +1 ;
        select.selectByIndex(randomIndex);

    }

    public void randomRadioBut() {
        List<WebElement> radios = driver.findElements(By.cssSelector("input[type='radio']"));
        int randomIndex = new Random().nextInt(radios.size());
        radios.get(randomIndex).click();
    }

    public void type(By locator, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator))
                .sendKeys(text);
    }

    public static String getEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }







}
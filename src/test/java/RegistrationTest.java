import org.example.Registration;
import org.testng.annotations.Test;


public class RegistrationTest extends BaseTest{


    @Test (priority = 0)
    public void testCase1 () {
        driver.get("https://www.automationexercise.com/login");
        Registration page = new Registration(driver);
        page.newUser("Amina" , page.getEmail());
        page.randomRadioBut();
        page.type(page.password, "Amina123");
        page.randomOption(page.day);
        page.randomOption(page.month);
        page.randomOption(page.year);
        page.click(page.newsletterCheckbox);
        page.click(page.specialOffersCheckbox);
        page.type(page.firstName,"Amina");
        page.type(page.lastName,"Ahmed");
        page.type(page.company,"srfcg");
        page.type(page.address1,"8 Gamal El-Din Yassin St., behind Sesel Hotel");
        page.type(page.address2,"8 Gamal El-Din Yassin St., behind Sesel Hotel");
        page.type(page.country,"Egypt");
        page.type(page.state,"Cairo");
        page.type(page.city,"cairo");
        page.type(page.zipcode,"141584");
        page.type(page.mobileNumber,"0121548");
        page.click(page.createButton);










    }
}

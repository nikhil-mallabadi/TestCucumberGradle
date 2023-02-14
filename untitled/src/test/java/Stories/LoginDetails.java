package Stories;

import Libraries.AuthenticationFunctions;
import Libraries.DriverSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDetails{
    static WebDriver driver;
    AuthenticationFunctions functions = new AuthenticationFunctions();

    static{
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
        DriverSetup.webdriver = new ChromeDriver();
        driver = DriverSetup.webdriver;
    }

    @Given("user navigates to flipkart")
    public void hitWebsite(){

        driver.get("https://www.amazon.in");
        String title = driver.getTitle();
        System.out.println("TITLE : "+title);
        driver.manage().window().maximize();
    }

    @When("user enters credentials")
    public void enterCredentials() {
        functions.enterEmail();
    }

    @Then("user's first name should be displayed.")
    public void verifyFirstName(){

    }
}

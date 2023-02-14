package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebELements {
    WebDriver driver;
    public  WebELements(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath  = "//span[text()='Account & Lists']")
    public WebElement loginButton;

    @FindBy(xpath = "userName")
    public WebElement userName;

}


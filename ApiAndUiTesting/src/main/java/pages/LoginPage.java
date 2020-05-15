package pages;

import elements.Button;
import elements.Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public Field emailField = new Field(By.cssSelector("input[id='user']"));
    public Field passwordField = new Field(By.cssSelector("input[id='password']"));
    public Button submitButton = new Button(By.cssSelector("button[id='login-submit']"));
    public By passwordBlock = By.id("password-entry");
}

package pages;
import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardPage extends Page {
    public CardPage(WebDriver driver) {
        super(driver);
    }
    public Button closeButton = new Button(By.cssSelector("div.window-overlay > div > div > a"));
    public Button moveButton = new Button(By.cssSelector("div.window-overlay div:nth-child(4) > div > a.button-link.js-move-card"));
    public Button positionButton = new Button(By.cssSelector("div.pop-over.is-shown  div:nth-child(2) > div > div > div > div > div:nth-child(3) > div:nth-child(2) > select"));
    public Button positionButton2 = new Button(By.cssSelector("div.pop-over.is-shown > div > div:nth-child(2) > div > div > div > div > div:nth-child(3) > div:nth-child(2) > select > option:nth-child(2)"));
    public Button moveToButton = new Button(By.cssSelector("div.pop-over.is-shown > div > div:nth-child(2) > div > div > div > div > input"));
}

package pages;


import elements.Button;
import elements.Container;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoardsPage extends Page {
    public BoardsPage(WebDriver driver) {
        super(driver);
    }
    public Container allBoardsContainer = new Container(By.cssSelector("div.all-boards"));
    public Button boardButton = new Button(By.xpath("//*[@id=\"content\"]/div/div[2]//div[2]//div[2]/ul/li[1]/a/div"));
}

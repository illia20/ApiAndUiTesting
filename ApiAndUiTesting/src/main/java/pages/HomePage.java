package pages;

import elements.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class HomePage extends Page{
    public String url = "https://trello.com";
    public String title = "Trello";

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public Link loginLink = new Link(By.cssSelector("a[href='/login']"));
}

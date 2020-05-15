package pages;

import elements.Header;
import elements.Container;
import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import elements.Label;
import elements.Field;

public class BoardPage extends Page {
    public BoardPage(WebDriver driver) {
        super(driver);
    }
    public Container firstList = new Container(By.cssSelector("div:nth-child(1) div.list-header-target.js-editing-target"));
    public Container secondList = new Container(By.cssSelector("div:nth-child(2) div.list-header-target.js-editing-target"));
    public Header firstListHeader = new Header(By.cssSelector("div:nth-child(1) h2"));
    public Header secondListHeader = new Header(By.cssSelector("div:nth-child(2) h2"));
    public Button firstCard = new Button(By.cssSelector("div:nth-child(1) a:nth-child(1) > div.list-card-details.js-card-details"));
    public Button secondCard = new Button(By.cssSelector("div:nth-child(1) a:nth-child(2) > div.list-card-details.js-card-details > span"));
    public Button newCardSecondList = new Button(By.xpath("//*[@id=\"board\"]/div[2]/div/div[3]/div"));
    public Button secondCardSecondList = new Button(By.xpath("//*[@id=\"board\"]/div[2]/div/div[2]/a[2]"));
    public Button moreButton = new Button(By.cssSelector("div.board-menu.js-fill-board-menu div.board-menu-content.u-fancy-scrollbar.js-board-menu-content-wrapper ul:nth-child(2) > li:nth-child(5)"));
    public Button labelButton = new Button(By.cssSelector("div.board-menu.js-fill-board-menu div.board-menu-content.u-fancy-scrollbar.js-board-menu-content-wrapper ul:nth-child(1) > li:nth-child(2)"));
    public Button newLabelButton = new Button(By.cssSelector("div.board-menu.js-fill-board-menu div.board-menu-content.u-fancy-scrollbar.js-board-menu-content-wrapper > div > div:nth-child(3) > div > button.button.full.js-add-label"));
    public Field nameLabel = new Field(By.cssSelector("#labelName"));
    public Button createLabelButton = new Button(By.cssSelector("div.pop-over.is-shown > div > div:nth-child(2) > div > div > form > div:nth-child(6) > input"));
    public Label newLabel = new Label(By.cssSelector("div.board-menu.js-fill-board-menu div.board-menu-content.u-fancy-scrollbar.js-board-menu-content-wrapper > div > div:nth-child(3) > ul > li:nth-child(8) > span"));
}

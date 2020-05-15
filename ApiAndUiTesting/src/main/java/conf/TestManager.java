package conf;

import API.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.HomePage;
import pages.LoginPage;
import pages.BoardPage;
import pages.BoardsPage;
import pages.CardPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestManager {

    protected static WebDriver driver;

    protected RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
    protected String boardId;
    protected String boardIdTwo;
    protected String listId;
    protected String listIdTwo;
    protected String listIdTM;
    protected String cardId;
    protected Card card = new Card();
    protected Board board = new Board();
    protected List list = new List();
    protected Label label = new Label();

    @BeforeSuite
    public void checkCreateBoardOne() throws IOException {
        String name = "New board";
        Board createdBoard = retrofitBuilder.getTrelloApi().createBoard(board, name).execute().body();
        boardId = createdBoard.getId();
        Board createdBoard2 = retrofitBuilder.getTrelloApi().createBoard(board, name).execute().body();
        boardIdTwo = createdBoard2.getId();
    }
    @BeforeSuite
    public void createLists() throws IOException {
        String name1 = "Testing list";
        List createdList = retrofitBuilder.getTrelloApi().createList(list, name1, boardId).execute().body();
        listId = createdList.getId();
        String listName = "Testing list2";
        List secondList = retrofitBuilder.getTrelloApi().createList(list, listName, boardId).execute().body();
        listIdTwo = secondList.getId();
        List thirdList = retrofitBuilder.getTrelloApi().createList(list, listName, boardId).execute().body();
        listIdTM = thirdList.getId();
        String cardName = "Testing card";
        String cardName2 = "Testing card2";
        String cardName3 = "Testing card3";
        Card newCard = retrofitBuilder.getTrelloApi().createCard(card, listId, cardName).execute().body();
        cardId = newCard.getId();
        Card newCard2 = retrofitBuilder.getTrelloApi().createCard(card, listId, cardName2).execute().body();
        Card newCard3 = retrofitBuilder.getTrelloApi().createCard(card, listId, cardName3).execute().body();
    }
    @BeforeSuite
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
        HomePage homePage = new HomePage(driver);
        homePage.openPage(homePage.url);
        // login
        homePage.loginLink.click();
        LoginPage loginPage = new LoginPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        loginPage.emailField.sendKeys("trelloqa@gmail.com");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loginPage.passwordBlock));
        loginPage.emailField.sendKeys(Keys.ENTER.toString());
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.submitButton.compose()));
        loginPage.passwordField.sendKeys("56zbA9eA5j7CDnE" + Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }
    @AfterSuite
    public static void tearDown(){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}

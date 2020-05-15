package pages;

import org.openqa.selenium.WebDriver;

public abstract class Page {
    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }
    public void openPage(String url){
        driver.get(url);
    }
    public String getTitle(){
        return driver.getTitle();
    }
}

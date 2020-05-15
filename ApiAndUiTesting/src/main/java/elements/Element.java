package elements;

import org.openqa.selenium.*;
import static conf.TestManager.getDriver;
public abstract class Element{
    protected By by;
    protected WebDriver driver = getDriver();

    public Element(By by) {
        this.by = by;
    }

    public WebElement compose(){
        return driver.findElement(by);
    }

    public void click(){
        compose().click();
    }

    public boolean isExist(){
        try {
            compose();
            return true;
        } catch (NullPointerException e){
            return false;
        }
    }
}

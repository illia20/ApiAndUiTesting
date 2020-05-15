package elements;
import org.openqa.selenium.By;
public class Field extends Element{

    public void sendKeys(String text){
        compose().sendKeys(text);
    }

    public Field(By by) {
        super(by);
    }
}

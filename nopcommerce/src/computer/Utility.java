package computer;

import homepage.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends Base {
    //This method will click on element
    public void clickOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();}

}

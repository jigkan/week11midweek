package homepage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuTest extends Base {
    String baseurl="https://demo.nopcommerce.com/";
    @Before
    public void setup(){openBrowser(baseurl);}


   // 1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    public void selectMenu(String menu){

            List<WebElement> topMenuList = driver.findElements(By.xpath("//div[@class='header-menu']/ul[1]"));
            try {
                for (WebElement element : topMenuList) {
                    if (element.getText().equalsIgnoreCase(menu)) {
                        element.click();
                    }
                }
            } catch (StaleElementReferenceException e) {

                        topMenuList = driver.findElements(By.xpath("//div[@class='header-menu']/ul[1]"));
            }
        }

//1.2 This method should click on the menu whatever name is passed as parameter.
//1.3. create the @Test    method name verifyPageNavigation.use selectMenu method to
   // select the Menu and click on it and verify the page navigation.
@Test
public void verifyPageNavigation(){
        selectMenu("top-menu notmobile");
}

}

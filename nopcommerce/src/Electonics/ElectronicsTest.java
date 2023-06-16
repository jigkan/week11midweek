package Electonics;

import computer.Utility;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElectronicsTest extends Utility {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void verified() {
        //1.1 Mouse Hover on “Electronics” Tab
        Actions action = new Actions(driver);
        WebElement mousehover = driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a"));
        action.moveToElement(mousehover).build().perform();
        //1.2 Mouse Hover on “Cell phones” and click
        Actions actions = new Actions(driver);
        WebElement mousehover1 = driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/ul[1]/li[2]/a"));
        action.moveToElement(mousehover1).click().build().perform();
        //1.3 Verify the text “Cell phones”
        String expectedcelltext = driver.findElement(By.xpath("//div[@class='center-2']/div[1]/div[1]/h1")).getText();
        System.out.println(expectedcelltext);
        String actualcelltext = "Cell phones";
        Assert.assertEquals("text", expectedcelltext, actualcelltext);
    }
        @Test
        public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully(){
        //2.1 Mouse Hover on “Electronics” Tab
            Actions action = new Actions(driver);
            WebElement mousehover = driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a"));
            action.moveToElement(mousehover).build().perform();
        //2.2 Mouse Hover on “Cell phones” and click
            Actions actions = new Actions(driver);
            WebElement mousehover1 = driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/ul[1]/li[2]/a"));
          mousehover1.click();
            //2.3 Verify the text “Cell phones”
            String expectedcelltext = driver.findElement(By.xpath("//div[@class='center-2']/div[1]/div[1]/h1")).getText();
            System.out.println(expectedcelltext);
            String actualcelltext = "Cell phones";
            Assert.assertEquals("text", expectedcelltext, actualcelltext);
        //2.4 Click on List View Tab
            driver.findElement(By.xpath("//div[@class='page-body']/div[1]/div[1]/a[2]")).click();
        //2.5 Click on product name “Nokia Lumia 1020” link
            //driver.findElement(By.className("href")).click();
        //2.6 Verify the text “Nokia Lumia 1020”///html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a
            String expectednokiatext = driver.findElement(By.xpath("//form[@id='product-details-form']/div[2]/div[1]/div[2]/div[1]/h1")).getText();
            System.out.println(expectednokiatext);
           String actualnokiatext = "Nokia Lumia 1020";
            Assert.assertEquals("text", expectednokiatext,actualnokiatext);
        //2.7 Verify the price “$349.00”
            String expectedpricetext=driver.findElement(By.id("price-value-20")).getText();
            System.out.println(expectedpricetext);
            String actualpricetext="$349.00";
           // Assert.assertEquals("text",expectedpricetext,actualpricetext);
        //2.8 Change quantity to 2
            WebElement quantity=driver.findElement(By.id("product_enteredQuantity_20"));
            quantity.click();
            quantity.clear();
            quantity.sendKeys("2");
        //2.9 Click on “ADD TO CART” tab
            driver.findElement(By.id("add-to-cart-button-20")).click();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
            String expectedmtext=driver.findElement(By.xpath("//div[@id='bar-notification']/div[1]/p")).getText();
            System.out.println(expectedmtext);
           String actualmtext="The product has been added to your shopping cart";
           Assert.assertEquals("text",expectedmtext,actualmtext);
        //After that close the bar clicking on the cross button.
            driver.findElement(By.xpath("//div[@id='bar-notification']/div[1]/span")).click();
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        Actions mousehover2=new Actions(driver);
        WebElement cartclick=driver.findElement(By.xpath("//li[@id='topcartlink']/a[1]/span[1]"));
        action.moveToElement(cartclick).build().perform();
        driver.findElement(By.xpath("//div[@class='header-links-wrapper']/div[2]/div[1]/div[4]/button[1]")).click();

        //2.12 Verify the message "Shopping cart"
            String expectedshoptext=driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div[1]/div[1]/div[1]/div[1]/h1")).getText();
            System.out.println(expectedshoptext);
            String actualshoptext="Shopping cart";
            Assert.assertEquals("text",expectedshoptext,actualshoptext);
        //2.13 Verify the quantity is 2
            //String expectedtext2=driver.findElement(By.xpath("//input[@id='itemquantity11237']")).getText();
            //System.out.println(expectedtext2);
            //String actualtext2="2";
            //Assert.assertEquals("text",expectedtext2,actualtext2);
        //2.14 Verify the Total $698.00
            String expectedtext3=driver.findElement(By.xpath("//div[@class='table-wrapper']/table[1]/tbody/tr[1]/td[6]/span[1]")).getText();
            System.out.println(expectedtext3);
            String actualtext3="$698.00";
            Assert.assertEquals("text",expectedtext3,actualtext3);
        //2.15 click on checkbox “I agree with the terms of service”
            driver.findElement(By.xpath("//div[@class='cart-footer']/div[2]/div[3]/input[1]")).click();
        //2.16 Click on checkout
            driver.findElement(By.xpath("//div[@class='cart-footer']/div[2]/div[4]/button")).click();
        //“2.17 Verify the Text “Welcome, Please Sign In!”
            String expectedweltext1=driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div[1]/div[1]/div[1]/div[1]/h1")).getText();
            System.out.println(expectedweltext1);
            String actuallweltext1="Welcome, Please Sign In!";
            Assert.assertEquals("very text",expectedweltext1,actuallweltext1);
        //2.18 Click on “REGISTER” tab
            driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[2]")).click();
        //2.19 Verify the text “Register”
            String expectedtext4=driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div[1]/div[1]/div[1]/div[1]/h1")).getText();
            System.out.println(expectedtext4);
            String actualltext4="Register";
            Assert.assertEquals("very text",expectedtext4,actualltext4);
        //2.20 Fill the mandatory fields
            driver.findElement(By.id("FirstName")).sendKeys("jignes");
            driver.findElement(By.id("LastName")).sendKeys("kanan");
            driver.findElement(By.id("Email")).sendKeys("jignesh3@gmail.com");
            driver.findElement(By.id("Password")).sendKeys("123456");
            driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        //2.21 Click on “REGISTER” Button
            driver.findElement(By.id("register-button")).click();
        //2.22 Verify the message “Your registration completed”
            String expectedregtext=driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div[1]/div[1]/div[1]/div[2]//div[1]")).getText();
            System.out.println(expectedregtext);
            String actualregtext="Your registration completed";
            Assert.assertEquals("text",expectedregtext,actualregtext);
        //2.23 Click on “CONTINUE” tab
            driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div[1]/div[1]/div[1]/div[2]//div[2]/a")).click();
        //2.24 Verify the text “Shopping cart”
            String expectedtext5=driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div[1]/div[1]/div[1]/div[1]/h1")).getText();
            System.out.println(expectedtext5);
            String actualtext5="Shopping cart";
            Assert.assertEquals("text",expectedtext5,actualtext5);
        //2.25 click on checkbox “I agree with the terms of service”
        //2.26 Click on “CHECKOUT”
        //2.27 Fill the Mandatory fields
        //2.28 Click on “CONTINUE”
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        //2.30 Click on “CONTINUE”
        //2.31 Select Radio Button “Credit Card”
        //2.32 Select “Visa” From Select credit card dropdown
        //2.33 Fill all the details
        //2.34 Click on “CONTINUE”CHECKOUT”
        //
        //2.35 Verify “Payment Method” is “Credit Card”
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        //2.37 Verify Total is “$698.00”
        //2.38 Click on “CONFIRM”
        //2.39 Verify the Text “Thank You”
        //2.40 Verify the message “Your order has been successfully processed!”
        //2.41 Click on “CONTINUE”
        //2.42 Verify the text “Welcome to our store”
        //2.43 Click on “Logout” link
        //2.44 Verify the URL is “https://demo.nopcommerce.com/”
    }
}
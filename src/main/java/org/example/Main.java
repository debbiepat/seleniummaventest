package org.example;
import java.lang.Thread;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class Main  {

    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://konga.com");
        try {


            // Sign in to Konga successfully
            driver.findElement(By.linkText("Login / Signup")).click();
            driver.findElement(By.id("username")).sendKeys("debbievalour@gmail.com");
            //enter password
            driver.findElement(By.id("password")).sendKeys("joshpat@1809");
            driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
            Thread.sleep(5000);
            // From the Categories, click on the “Computers and Accessories”
            driver.findElement(By.linkText("Computers and Accessories")).click();
            Thread.sleep(5000);
            driver.findElement(By.linkText("Laptops")).click();
            Thread.sleep(5000);
            // Click on the Laptop SubCategory
            // driver.findElement(By.linkText("/html[1]/body[1]")).click();
            // driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[3]/section/div/section/div[2]/div[2]/ul/li[4]/a/label/span")).click();

            // Click on the Apple MacBooks
            driver.findElement(By.linkText("Apple MacBooks")).click();
            Thread.sleep(5000);
            // Add an item to the cart
            driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/section/section/section/ul/li[1]/div/div/div[3]/form/div[2]/button")).click();
            // driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
            Thread.sleep(5000);
            //click My Cart
            driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/a[2]")).click();
            Thread.sleep(5000);
            //click CheckOut
            driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/section/section/aside/div[3]/div/div[2]/button")).click();
            //Thread.sleep(10000);

            //Add address
           // driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/button")).click();
           // Thread.sleep(5000);
            //driver.findElement(By.id("firstname")).sendKeys("Deborah");
            //driver.findElement(By.id("lastname")).sendKeys("Patrick");
           // driver.findElement(By.id("telephone")).sendKeys("07067807847");
           // driver.findElement(By.id("street")).sendKeys("Ogunsatien");
           // driver.findElement(By.id("city")).sendKeys("Lagos");
           // driver.findElement(By.name("regionId")).sendKeys("Lagos");
           // Thread.sleep(5000);
           // driver.findElement(By.name("areaId")).sendKeys("Abule egba");
            //click save
           // driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[2]/div/div/form/div[8]/div[1]/button")).click();
            //Thread.sleep(5000);
            //select the address details
           // driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[2]/div/div/div[2]/div/form/button")).click();
            //Thread.sleep(5000);
            //select use this address
            //driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[3]/div/div/div/a")).click();


            Thread.sleep(5000);
            WebElement elementToClick;
            elementToClick = new RemoteWebElement();
            //select payment option

            driver.findElement(By.xpath("//html/body/div[1]/div/section/div[2]/section/main/div/form/div/div[1]/section[2]/div/div[2]/div[1]/div[1]/span/input")).click();
            Thread.sleep(8000);

            // Scroll down to the element
           // JavascriptExecutor js = (JavascriptExecutor) driver;
           // js.executeScript("arguments[0].scrollIntoView(true);", elementToClick);
            // Click the element
           // elementToClick.click();

            driver.findElement(By.name("placeOrder")).click();
            Thread.sleep(10000);


            //Select payment method
            WebElement payment = driver.findElement(By.tagName("iframe"));
            driver.switchTo().frame("kpg-frame-component");
            Thread.sleep(8000);
            driver.findElement(By.className("Card")).click();
            Thread.sleep(8000);

            //Input invalid card details
            //invalid card number
            driver.findElement(By.xpath("//*[@id=\"card-number\"]")).sendKeys("4960091812582855");
            Thread.sleep(3000);
            //invalid Expiry date
            driver.findElement(By.xpath("//*[@id=\"expiry\"]")).sendKeys("0530");
            Thread.sleep(3000);
            //Invalid cvv
            driver.findElement(By.xpath("//*[@id=\"cvv\"]")).sendKeys("231");
            Thread.sleep(3000);
            //submit
            driver.findElement(By.xpath("//*[@id=\"validateCardForm\"]")).click();
            Thread.sleep(3000);


            //prints the error message
            WebElement message = driver.findElement(By.xpath("//*[@id=\"card-number_unhappy\"]"));
            System.out.println(message.getText());
            Thread.sleep(5000);


            //Close the iFrame that displays the input card Mode
            driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[1]/aside")).click();
            Thread.sleep(5000);

            //// Switch to default browser
            driver.switchTo().defaultContent();
            Thread.sleep(5000);

            //quit the browser
            driver.quit();

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

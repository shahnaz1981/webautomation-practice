package base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonApi {

 public WebDriver driver=null;

 @Parameters({"url"})
@BeforeMethod
    public void setup(String url){
System.setProperty("webdriver.chrome.driver","C:\\Users\\mohamed .LAPTOP-QCE4AIJL\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get(url);
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

      }
/*@AfterMethod
    public void cleanUp(){
    driver.close();
}*/
}

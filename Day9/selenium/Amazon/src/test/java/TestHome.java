import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestHome extends CommonApi {

    @Test
    public void test1(){
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("bookmarks");
        //click on bookmarks
        driver.findElement(By.className("nav-input")).click();


    }




}

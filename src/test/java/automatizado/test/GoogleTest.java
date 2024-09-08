package automatizado.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleTest extends BaseTest{
    
    @Test
    public void devePesquisarNoGoogle(){
        
        WebElement inputPesquisa =  driver.findElement(By.name("q"));

        inputPesquisa.sendKeys("Goku" + Keys.ENTER);
    }
}

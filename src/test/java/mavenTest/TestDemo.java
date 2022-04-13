package mavenTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


public class TestDemo {
	@Test
	public void idDemo() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsaty\\Downloads\\Dxc Selenium Automation Class\\TestNGLunch\\Cromejars\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.easycalculation.com/");
        driver.findElement(By.xpath("//*[@id=\"googleSearchId\"]")).sendKeys("AWS Cetification Banglore");
        driver.findElement(By.xpath("//*[@id=\"cse-search-box\"]/span[2]/button")).click();
        List<WebElement>Links =driver.findElements(By.xpath("//a"));
        int Nolinks = Links.size();
        System.out.println("Number of links"+ Nolinks);
        
        driver.findElement(By.xpath("//*[@id=\"e1\"]/div[1]/a")).click();
        
        driver.quit();
}
}
package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "D:\\chrome selenium\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/HTML/tryit.asp?filename=tryhtml_intro");
		
	
	    driver.findElement(By.xpath("//img[@class=\"i-amphtml-fill-content i-amphtml-replaced-content\"]")).click();
	
		Alert alt = driver.switchTo().alert();
	
	
	
	}	
	
	
}

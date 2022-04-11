package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
}		


}



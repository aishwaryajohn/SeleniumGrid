package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Node {
	
	
	
	
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		//to run on the remote machine
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.9:4444/wd/hub"), dc);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id= 'btnLogin']")).click();
	
		

	}

}

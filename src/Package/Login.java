package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://magento.com/");
		d.findElement(By.partialLinkText("Get a Free Demo")).click();
	}

}

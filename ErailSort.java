package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver objcrmdriver = new ChromeDriver();
		objcrmdriver.get("https://erail.in/");
		objcrmdriver.manage().window().maximize();
		objcrmdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement formstation = objcrmdriver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		formstation.clear();
		formstation.sendKeys("TPJ",Keys.TAB);
		WebElement Destinationstation = objcrmdriver.findElement(By.xpath("//input[@id='txtStationTo']"));
		Destinationstation.clear();
		Destinationstation.sendKeys("MS",Keys.TAB);
		WebElement dateselect = objcrmdriver.findElement(By.xpath("//input[@id='chkSelectDateOnly']"));
		if(dateselect.isSelected()) {
			dateselect.click();
		}
		else {
			System.out.println("The check box is not checked");
		}
		objcrmdriver.findElement(By.id("buttonFromTo")).click();
		Thread.sleep(1000);
		List<String> trainname=new ArrayList<String>();
		List<WebElement> table = objcrmdriver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr/td[2]"));
		for (WebElement column : table) {
			String nametext = column.getText();
			System.out.println(nametext);
			trainname.add(nametext);
		}	    

		Collections.sort(trainname);
		System.out.println(trainname); 
	}

}

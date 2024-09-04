package automationTesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class LanchBrowser {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

	
		System.out.println(	driver.getTitle());
		String title = driver.getTitle();
		
		if (title.contains("Platform")) {
			System.out.println("Verified");
			
		} 
		else {
			
			System.out.println("Not Verified");

		}
			
		
		driver.close();
			
			
		}

	}

package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanchBrowser {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		// driver.close();
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("QEagle");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suriyakala");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("babu");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("40");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suriyababu@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("swetha");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("priya");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("new perugalathur");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("kamaraj nagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600063");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamilnadu");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("6098");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		if (title.contains("View Lead")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}
	}
}

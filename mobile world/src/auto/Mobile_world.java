package auto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobile_world {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.findElement(By.cssSelector("button.btn.btn-warning.my-2.my-sm-0")).click();
		driver.findElement(By.linkText("Sign up")).click();
		//driver.findElement(By.xpath("//p/a")).click();
		driver.findElement(By.id("myName")).sendKeys("Bhavadharani");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("P");
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("bhava123@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("q1w2e3");
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("05");
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("27");
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("2000");
		driver.findElement(By.xpath("//form/div[3]/div[4]")).click();
		driver.findElement(By.cssSelector("input[type='number']")).sendKeys("9898989898");
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("My hobbies are playing games");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//form/div[6]/div[3]")).click();
		//driver.switchTo().alert().accept();
		
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Bhavadharani");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("q1w2e3");
		driver.findElement(By.xpath("//a[@type='submit']")).click();
		
		
		driver.findElement(By.linkText("All Mobiles")).click();
		driver.findElement(By.cssSelector("input#myInput")).sendKeys("samsung");
		//driver.findElement(By.cssSelector("a.btn.btn-primary.waves-effect.waves-light")).click();
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]/a")).click();
		
		
		
		
		
	}

}

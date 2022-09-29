package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login 
{


	@BeforeMethod
	public void start()
     {
         System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
     }
	
	@Test(dataProvider="getData")
	public void setup(String user,String lpassword) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Pom login=new Pom(driver);
		login.goTo();
		login.loginpage(user,lpassword);
						
	}
	
	@Test
	public void username_specialcharacter() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Pom login=new Pom(driver);
		login.goTo();
		String Expected="Proper error message should be display";
		String user="!@#$%^&";
		String lpassword="1q2w3";
		login.loginpage(user,lpassword);
		Assert.assertEquals(user, Expected);
	}
		
		
	@Test
	public void password_morethan_10char_() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Pom login=new Pom(driver);
		login.goTo();
		String Expected="Proper error message should be display";
		String user="bhava";
		String lpassword="1q2w3r45t6y7u8i9o0oi88u7y6t4r54rt5t6t";
		login.loginpage(user,lpassword);
		Assert.assertEquals(lpassword, Expected);
	}
	
	@DataProvider
	public Object[][] getData()
	{
        Object[][] data=new Object[1][2];
		//correct data
		data[0][0]="Bhava";
		data[0][1]="1q2w3e";
			
		return data;
	}

}

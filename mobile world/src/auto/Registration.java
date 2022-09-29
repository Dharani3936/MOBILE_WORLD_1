package auto;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Registration
{
	@BeforeMethod
	public void start()
     {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
     }
	
	
	@Test(dataProvider="getData")
	public void setup(String firstname,String lastname,String email,String password,
			String dob,String mobilenumber,String shortbio) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Pom signin=new Pom(driver);
		signin.goTo();
		signin.registration(firstname, lastname, email, password, dob, mobilenumber, shortbio);
		
	
	}
			
	@Test
	public void firstname_lessthan_3char() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Pom signin=new Pom(driver);
		signin.goTo();
		String Expected="Proper error message should be display";
		String firstname="bh";
		String lastname="dharani";
		String email="bj@gmail.com";
		String password="q22ws";
		String dob="12/3/2000";
		String mobilenumber="12345";
		String shortbio="my hobbies are playing games";
		signin.registration(firstname, lastname, email, password, dob, mobilenumber, shortbio);
		Assert.assertEquals(firstname, Expected);
		
	}
	
	@Test
	public void lastname_morethan_20char() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Pom signin=new Pom(driver);
		signin.goTo();
		String Expected="Proper error message should be display";
		String firstname="bhava";
		String lastname="abacwsjgdcjxghjhghjzgxhzvcsxbcnbs";
		String email="b12j@gmail.com";
		String password="q22ws";
		String dob="12/3/2000";
		String mobilenumber="12345";
		String shortbio="my hobbies are playing games";
		signin.registration(firstname, lastname, email, password, dob, mobilenumber, shortbio);
		Assert.assertEquals(lastname, Expected);
		
	}
	
	@Test
	public void password_morethan_10alphanumeric() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Pom signin=new Pom(driver);
		signin.goTo();
		String Expected="Proper error message should be display";
		String firstname="bhava";
		String lastname="dharani";
		String email="bj@gmail.com";
		String password="q22ws2w3e4r5t6y7t65t67y5y6t5";
		String dob="12/3/2000";
		String mobilenumber="12345";
		String shortbio="my hobbies are playing games";
		signin.registration(firstname, lastname, email, password, dob, mobilenumber, shortbio);
		Assert.assertEquals(password, Expected);
		
	}
	
	@Test
	public void mobilenumber_lessthan_3numbers() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Pom signin=new Pom(driver);
		signin.goTo();
		String Expected="Proper error message should be display";
		String firstname="bhava";
		String lastname="dharani";
		String email="bj@gmail.com";
		String password="q22ws";
		String dob="12/3/2000";
		String mobilenumber="12";
		String shortbio="my hobbies are playing games";
		signin.registration(firstname, lastname, email, password, dob, mobilenumber, shortbio);
		Assert.assertEquals(mobilenumber, Expected);
		
	}
	
	@DataProvider
    public Object[][] getData()
	{
		Object[][] data=new Object[1][7];
		
		//correct data
		data[0][0]="Bhava";
		data[0][1]="dharani";
		data[0][2]="bhava123@gmail.com";
		data[0][3]="q1w2e3";
		data[0][4]="05/27/2000";
		data[0][5]="9898989898";
		data[0][6]="My hobbies are playing games";
		
		return data;
	}
	
	
	
}

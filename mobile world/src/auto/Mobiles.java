package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Mobiles {
	
	@BeforeMethod
	public void start()
     {
         System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
     }

	
	@Test(dataProvider="getData")
	public void setup(String searchbox) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Pom all=new Pom(driver);
		all.goTo();
		all.mobiles(searchbox);
		
	}

        
    @Test
    public void searchbox_morethan_20char() throws InterruptedException
    	{
    		WebDriver driver=new ChromeDriver();
    		driver.manage().window().maximize();
    		Pom all=new Pom(driver);
    		all.goTo();
    		String Expected="Proper error message should be display";
    		String searchbox="samsung 20 pixel with dual camera";
    		all.mobiles(searchbox);
    		Assert.assertEquals(searchbox, Expected);
    	}
    	

    		@DataProvider
    		public Object[][] getData()
    		{
    	        Object[][] data=new Object[1][1];
    			
    	        data[0][0]="samsung";
        
		      return data;
            }
}

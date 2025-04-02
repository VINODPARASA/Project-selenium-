package TestCases;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.testng.annotations.Test;
 
 
import Pages.homepage;
 
public class TestCase1 {
 
@Test
 
	public void loginTest() throws InterruptedException{
 
	WebDriver driver;
 
	driver = new ChromeDriver();
	//opening MRS Login Page
 
 
	driver.get("https://o2.openmrs.org/openmrs/referenceapplication/login.page");
 
 
	homepage h = new homepage(driver);
	//Login Using  wrong credentials
 
	h.login("vinod","2121");
	//login using blank credentials
	h.login(" ","");
	//login using correct credentials
 
	h.login("admin","Admin123");
	//registering the user
 
	h.Register("raam","sree","parasa");
//editing the user
	h.Editpage();
 
	}
 
}
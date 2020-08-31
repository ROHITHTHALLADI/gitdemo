import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create Driver object for chrome Browser
		// we will strictly implements  methods of webdriver
		// invoke .exe file frst 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohith Thalladi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.get("https://instagram.com");
		//driver.findElement(By.id("email")).sendKeys("rohith");
		//driver.findElement(By.name("pass")).sendKeys("123");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.close();
		//driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		//driver.findElement(By.cssSelector("#u_0_b")).click();
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rohith");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rohith");
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		//driver.findElement(By.cssSelector("input[id='email']")).sendKeys("rohith");
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rohith");
		//driver.findElement(By.cssSelector("input[value='Log In']")).click();
	    driver.findElement(By.cssSelector("input#username)")).sendKeys("rohith");
	    driver.findElement(By.xpath("//input[@aria-label='password']")).sendKeys("rohith");
	
	
	
	
	
	}
	
}
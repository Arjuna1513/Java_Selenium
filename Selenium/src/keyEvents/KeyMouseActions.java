package keyEvents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyMouseActions 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,60);
		driver.get("file:///C:/Users/mallikar/Desktop/Text.html");
		Thread.sleep(2000);
		Robot r = new Robot();
		//WebElement user = driver.findElement(By.name("userId"));
		/*//Entering Password with CAPS lock ON
				r.keyPress(KeyEvent.VK_CAPS_LOCK);
				r.keyRelease(KeyEvent.VK_CAPS_LOCK);*/
		//user.sendKeys("Arjuna");
		/*driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Arjuna@123");*/
		
		//KeyEvent VK_ENTER
		/*r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);*/
		
		/*//VK_BACK_SPACE
		//enter any content on text field and using this will result in back spacing of one character.
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);*/
		
		/*//VK_TAB
		//If u r in username field using VK_TAB will move the cursor to password field.
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);*/
		
		//VK_CLEAR
		//This cab be used to clear the content of the text box
		/*Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		//Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CLEAR);
		r.keyRelease(KeyEvent.VK_CLEAR);*/
		
		//Switching to Previous tab ex:alt + control
	/*	r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ALT);*/
		
		/*//VK_SPACE
		//e.g. enter any content in text field and use VK_SPACE "Arjuna "
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);*/
		
		//VK_PAGE_DOWN
		//in case of scrollable webpage use VK_PAGE_DOWN and VK_PAGE_UP to scroll up and down.
		/*r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);*/
		
		//To enter "," in to the current text field.
		/*r.keyPress(KeyEvent.VK_COMMA);
		r.keyRelease(KeyEvent.VK_COMMA);*/
		
		//To enter "." in to the current text field.
		/*r.keyPress(KeyEvent.VK_PERIOD);
		r.keyRelease(KeyEvent.VK_PERIOD);*/
		
		//To enter "/" in to the current text field.
		/*r.keyPress(KeyEvent.VK_SLASH);
		r.keyRelease(KeyEvent.VK_SLASH);*/
		
		//To enter ";" in to the current text field.
		/*r.keyPress(KeyEvent.VK_SEMICOLON);
		r.keyRelease(KeyEvent.VK_SEMICOLON);*/
		
		//To enter "=" in to the current text field.
		/*r.keyPress(KeyEvent.VK_EQUALS);
		r.keyRelease(KeyEvent.VK_EQUALS);*/
		
		//To enter ":" in to the current text field.
		/*r.keyPress(KeyEvent.VK_COLON);
		r.keyRelease(KeyEvent.VK_COLON);*/
		
		//To turn the CAPS LOCK on and enter "A" in to the current text field.
		/*r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);*/
		
		//VK_OPEN_BRACKET and VK_CLOSE_BRACKET
		/*r.keyPress(KeyEvent.VK_OPEN_BRACKET);
		r.keyRelease(KeyEvent.VK_OPEN_BRACKET);
		
		r.keyPress(KeyEvent.VK_CLOSE_BRACKET);
		r.keyRelease(KeyEvent.VK_CLOSE_BRACKET);*/
		
		//to add "+" for the text field
		/*r.keyPress(KeyEvent.VK_ADD);
		r.keyRelease(KeyEvent.VK_ADD);*/
		
		//to add "." to text field.
		/*r.keyPress(KeyEvent.VK_DECIMAL);
		r.keyRelease(KeyEvent.VK_DECIMAL);*/
		
		//to add "-" to text field.
		/*r.keyPress(KeyEvent.VK_SUBTRACT);
		r.keyRelease(KeyEvent.VK_SUBTRACT);*/
		
		/*//select th contect of the text field and delete the content.
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);*/
		
		//selecting the text letter by letter using SHIFT and LEFT arrow keys
		/*r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_SHIFT);*/
		
		//For Developer tools
		/*r.keyPress(KeyEvent.VK_F12);
		r.keyRelease(KeyEvent.VK_F12);*/

		//for viewing the full screen.
		/*r.keyPress(KeyEvent.VK_F11);
		r.keyRelease(KeyEvent.VK_F11);*/
		
		/*//to refresh the page using function+F5
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);*/
		
		//to insert "`" in the text field.
		/*r.keyPress(KeyEvent.VK_BACK_QUOTE);
		r.keyRelease(KeyEvent.VK_BACK_QUOTE);*/
		
		//to insert "'" in the text field.
		/*r.keyPress(KeyEvent.VK_QUOTE);
		r.keyRelease(KeyEvent.VK_QUOTE);*/
		
		/*//for keypad cursor keys LEFT
		r.keyPress(KeyEvent.VK_KP_LEFT);
		r.keyRelease(KeyEvent.VK_KP_LEFT);*/
				
		/*//for keypad cursor keys RIGHT
		r.keyPress(KeyEvent.VK_KP_RIGHT);
		r.keyRelease(KeyEvent.VK_KP_RIGHT);*/
		
		//To enter asterisk
		/*r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_8);
		r.keyRelease(KeyEvent.VK_8);
		r.keyRelease(KeyEvent.VK_SHIFT);*/
		
		//to add @symbol
		/*r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_SHIFT);*/
		
		//to enter : just use shift and then use VK_Semicolon
		/*r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_SEMICOLON);
		r.keyRelease(KeyEvent.VK_SEMICOLON);
		r.keyRelease(KeyEvent.VK_SHIFT);*/
		
		//to enter < just use shift and then use VK_comma
		/*r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_COMMA);
		r.keyRelease(KeyEvent.VK_COMMA);
		r.keyRelease(KeyEvent.VK_SHIFT);*/
		
		//to enter > use shift followed by period.
		/*r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_PERIOD);
		r.keyRelease(KeyEvent.VK_PERIOD);
		r.keyRelease(KeyEvent.VK_SHIFT);*/
		
		//copy and paste user VK_C and VK_V to copy and paste. don't use VK_COPY and VK_PASTE
		/*r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);		
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);*/
		
		/*r.keyPress(KeyEvent.VK_EQUALS);
		r.keyRelease(KeyEvent.VK_EQUALS);
		
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_EQUALS);
		r.keyRelease(KeyEvent.VK_EQUALS);
		r.keyRelease(KeyEvent.VK_SHIFT);*/
		
		//[,] and { , }
		/*r.keyPress(KeyEvent.VK_OPEN_BRACKET);
		r.keyRelease(KeyEvent.VK_OPEN_BRACKET);
		r.keyPress(KeyEvent.VK_CLOSE_BRACKET);
		r.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
		
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_OPEN_BRACKET);
		r.keyRelease(KeyEvent.VK_OPEN_BRACKET);
		r.keyRelease(KeyEvent.VK_SHIFT);
	
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_CLOSE_BRACKET);
		r.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
		r.keyRelease(KeyEvent.VK_SHIFT);*/
		
		//for key board UP, DOWN, RIGHT and LEFT arrow keys.
		/*driver.findElement(By.tagName("textarea")).click();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);*/
		
		
		
	
		
	/*	NOTES:
			1. for ` use VK_BACK_QUOTE but for ~ use shift and VK_BACK_QUOTE. 
			2. for 1 use VK_1 but for ! use shift and VK_1.
			3. for 2 use VK_2 but for @ use VK_SHIFT and VK_2
			4. for 3 use VK_3 but for # use VK_SHIFT and VK_3
			5. for 4 use VK_4 but for $ use VK_SHIFT and VK_4
			6. for 5 use VK_5 but for % use VK_SHIFT and VK_5
			7. for 6 use VK_6 but for ^ use VK_SHIFT and VK_6
			8. for 7 use VK_7 but for & use VK_SHIFT and VK_7
			9. for 8 use VK_8 but for * use VK_SHIFT and VK_8
			10. for 9 use VK_9 but for ( use VK_SHIFT and VK_9
			11. for 0 use VK_0 but for ) use VK_SHIFT and VK_0
			12. for - use VK_SUBTRACT but for _ use VK_SHIFT and VK_SUBTRACT
			13. for = use VK_EQUALS but for + either use VK_ADD or VK_SHIFT followed by VK_EQUALS
			14. for  [ use VK_OPEN_BRACKET but for { use VK_SHIFT and VK_OPEN_BRACKET
			15. for  ] use VK_CLOSE_BRACKET but for { use VK_SHIFT and VK_CLOSE_BRACKET	
			16. for ; use VK_SEMICOLON but for : use VK_SHIFT and VK_SEMICOLON
			17. for ' use VK_QUOTE but for "" use VK_SHIFT and VK_QUOTE
			18. for , use VK_COMMA but for < use VK_SHIFT and VK_COMMA
			19. for . use VK_PERIOD but for > use VK_SHIFT and VK_PERIOD
			20. for / use VK_SLASH but for ? use VK_SHIFT and VK_SLASH
			21. for \ use VK_BACK_SLASH but for | use VK_SHIFT and VK_BACK_SLASH 
			22. for CAPS LOCK use VK_CAPS_LOCK
			23. for alt button use VK_ALT
			24. for tab button use VK_TAB
			25. for space use VK_SPACE
			26. for control use VK_CONTROL
			27. for scroll down use VK_PAGE_DOWN
			28. for scroll up use VK_PAGE_UP
			29. for Deleting use VK_CONTROL followed by VK_A and VK_DELETE
			30. for clearing use VK_CONTROL followed by VK_A and VK_CLEAR
			31. for upper arrow key use VK_UP
			32. for down arrow key use VK_DOWN
			33. for <- key use VK_LEFT
			34. for -> key use VK_RIGHT
			*/	
		
		
		
	}
}

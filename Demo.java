package Sample;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hemarevanth.chayala\\Downloads\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/List_of_music_festivals#India");
		
		List<WebElement> musicFestivals = driver.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/div[13]/ul"));
		System.out.println('r');
		System.out.println(musicFestivals);
		System.out.println('r');
		List<WebElement> sortedMusicFestivals = musicFestivals.stream().sorted().collect(Collectors.toList());     
		sortedMusicFestivals.forEach(System.out::println); 

	}
}

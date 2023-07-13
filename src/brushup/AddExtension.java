package brushup;

import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddExtension {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File(""));
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
	}

}

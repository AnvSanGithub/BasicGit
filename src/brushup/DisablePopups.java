package brushup;


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DisablePopups {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable.popup-blocking"));
		WebDriver driver = new ChromeDriver(options);

	}
}

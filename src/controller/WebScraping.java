package controller;

import java.util.Collections;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WebScraping {

	public static void main(String[] args) {
		rasparDados();

	}
	
	private static void rasparDados() {
        System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");

        EdgeOptions options = new EdgeOptions();

        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", null);

        EdgeDriver driver = new EdgeDriver(options = options);

        driver.get("https://www.linkedin.com/");

    }


}

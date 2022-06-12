package teste.senai;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCursosSenai {
	
	private WebDriver driver;
	
	@Before
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void TesteNavegabilidade() {
		
		driver.get("https://www.mundosenai.com.br/");
		driver.findElement(By.xpath("/html/body/header/div/div/div[3]/nav/ul/li[8]/img")).click();
		driver.findElement(By.id("termo_busca")).sendKeys("Excel");
		driver.findElement(By.id("termo_busca")).sendKeys(Keys.ENTER);
		
	}
	
}

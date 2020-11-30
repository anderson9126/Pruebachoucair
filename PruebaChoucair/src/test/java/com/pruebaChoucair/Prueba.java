package com.pruebaChoucair;

import static org.junit.Assert.assertEquals;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba {
	
	private WebDriver driver;
	
	@Before
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chomedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/empleos-testing/");
		
	}
	
	@Test 
	public void testnavbar() {
		
		WebElement tag =driver.findElement(By.id("menu-item-6142"));
		tag.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("Servicios-Choucair Testing", driver.getTitle());
		
		
	}
	
	@After
	public void terminar() {
		driver.quit();
	}

}

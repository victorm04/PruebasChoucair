package com.choucairtesting.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleChromeTest {

	private WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/servicio/");
	}

	@Test
	public void testServiciosPage() throws InterruptedException {

		assertEquals("Servicios – Choucair Testing", driver.getTitle());
		
		/*
		 * Este segmento de codigo pretende buscar por nombre cada elemento dentro del widget de caracteristicas,
		 * para luego verificar que tenga los enlaces a las ubicaciones adecuadas.
		 * Para lograr este objetivo se debe de colocar una propiedad "name" a los elementos y listarlos en un arreglo,
		 * para automatizar la prueba de forma sencilla.
		 * 
		 * WebElement element = driver.findElement(By.name( nombre del elemento ));
		 * element.click();
		 * 
		 * assertEquals("titulo de la pagina", driver.getTitle());
		 * 
		 * 
		 */

		Thread.sleep(5000);

	}

	@After
	public void testDown() {
		driver.quit();
	}
}

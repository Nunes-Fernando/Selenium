package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage  {

	private WebDriver browser;

	public HomePage() {
	}

	public HomePage(WebDriver browser) {
		this.browser = browser;
	}

	public void acessarAplicacao() {
		browser.get("https://qazando.com.br/curso.html");
		Assert.assertEquals(true, browser.findElement(By.id("btn-ver-cursos")).isDisplayed());
	}

	public void preencherEmail() {
		browser.findElement(By.id("email")).sendKeys("teste@gmail.com");
	}

	public void clickBtn() throws InterruptedException {
		Thread.sleep(5000);
		browser.findElement(By.id("button")).click();
	}

	public void codigoGerado() {
		String text = browser.findElement(By.cssSelector("#cupom > h2 > span")).getText();

		System.out.println(text);
	}
}

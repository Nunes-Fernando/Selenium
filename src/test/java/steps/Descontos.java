package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import runner.RunCucumber;

public class Descontos extends RunCucumber{
	

	@Dado("que estou no site da qazando")
	public void acessarSite() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) browser;
		jse.executeScript("window.scroll(0, 1000)");
	
		browser.get("https://qazando.com.br/curso.html");
		
		Assert.assertEquals(true, browser.findElement(By.id("btn-ver-cursos")).isDisplayed());
		
	}
	
	@Quando("preencho meu e-mail")
	public void preencho_meu_e_mail()  {
		browser.findElement(By.id("email")).sendKeys("teste@gmail.com");
	}
	
	@E("clico em ganhar cupom")
	public void clickBtn() throws InterruptedException {
		Thread.sleep(5000);
		browser.findElement(By.id("button")).click();
	}
	
	@Então("visuliza o código de desconto")
	public void seeCupom() {
		String text = browser.findElement(By.cssSelector("#cupom > h2 > span")).getText();
		
		System.out.println(text);
		
	}
}

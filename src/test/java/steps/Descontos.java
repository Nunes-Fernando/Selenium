package steps;

import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumber;

public class Descontos extends RunCucumber{
	
	HomePage homePage = new HomePage(browser);

	@Dado("que estou no site da qazando")
	public void acessarSite() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) browser;
		jse.executeScript("window.scroll(0, 1000)");
	
		homePage.acessarAplicacao();
		
	}
	
	@Quando("preencho meu e-mail")
	public void preencho_meu_e_mail()  {
		homePage.preencherEmail();
	}
	
	@E("clico em ganhar cupom")
	public void clickBtn() throws InterruptedException {
		homePage.clickBtn();
	}
	
	@Então("visuliza o código de desconto")
	public void seeCupom() {
		homePage.codigoGerado();
		
	}
}

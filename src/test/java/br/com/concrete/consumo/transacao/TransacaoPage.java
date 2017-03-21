package br.com.concrete.consumo.transacao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by assis on 16/03/17.
 */
public class TransacaoPage {

    private WebDriver driver;

    @FindBy(linkText = "Home")
    private WebElement home;

    @FindBy(id = "titulo")
    WebElement titulo;

    @FindBy(id="listaDeUsuarios")
    WebElement listaDeUsuarios;

    public TransacaoPage(WebDriver driver){
        this.driver = driver;
    }

    public void home(){
        home.click();
    }

    public TransacaoPageAssert assertThat() {
        return new TransacaoPageAssert(this);
    }
}

package automatizado.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO{

    @FindBy(name = "q")
    public WebElement inputPesquisa;

    @FindBy(name = "btnI")
    public WebElement buttonPesquisa;
    

    /**
     * Construtor para criação da página do Google
     * @param driver Drive da página do google
     */
    public GooglePO(WebDriver driver) {
        super(driver);
    }

    /**
     * Método que irá efetuar uma pesquisa no google, baseando no texto informado, e concluindo com ENTER
     * @param texto Texto a ser pesquisado
     */
    public void pesquisar(String texto){
        inputPesquisa.sendKeys(texto + Keys.ENTER);
    }

    public void limpar(){
        inputPesquisa.clear();
    }
    
}

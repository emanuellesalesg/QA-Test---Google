package automatizado.test;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizado.page.GooglePO;

public class GoogleTest extends BaseTest{
    
    private static GooglePO googlePage;
    
    @BeforeClass
    public static void prepararTestes(){
        googlePage = new GooglePO(driver);
    }

    @Test
    public void TC002_pesquisaNoGoogleGoku(){
        
        googlePage.limpar();
        googlePage.pesquisar("Goku");

    }

    @Test
    public void TC001_pesquisarNoGoogleBatataFrita(){

        googlePage.pesquisar("Batata Frita");

    }
}

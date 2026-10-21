package Task;

import PageObjects.FinishPage;
import PageObjects.GenericPage;
import Validacao.FinnishValidacao;
import Validacao.GenericValidacao;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class FinishTask {

    private WebDriver driver;
    private FinishPage finishPage;
    private GenericValidacao genericValidacao;
    private FinnishValidacao finnishValidacao;
    private LoginValidacao loginValidacao;



    public FinishTask (WebDriver driver){

        this.driver = driver;
        finishPage = new FinishPage(this.driver);
        finnishValidacao = new FinnishValidacao(this.driver);
    }

    public void finalizarCompra(){

        genericValidacao.validationTitlePages("Checkout: Complete!");
        finishValidacao.validationSucessoCompra();
        finnishValidacao

    }

}

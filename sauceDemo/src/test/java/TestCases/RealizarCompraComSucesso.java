package TestCases;

import Framework.TesteBase;
import Task.LoginTask;
import Task.ProdutoTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompraComSucesso extends TesteBase {

    private final WebDriver driver = getDriverManager();

    LoginTask loginTask = new LoginTask(driver);
    ProdutoTask produtoTask = new ProdutoTask(driver);

    @Test
    public void realizarCompra() throws InterruptedException{

        loginTask.efetuarLogin();
        produtoTask.selecionarProduto();


    }

}

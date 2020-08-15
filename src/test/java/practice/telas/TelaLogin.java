package practice.telas;

import com.evandrofranca.frameworkautomacao.tela.TelaWeb;

public class TelaLogin extends TelaWeb {

    public void preencherCampoEmail(String email) throws Exception {
        this.recuperarElemento("input", "id", "email").sendKeys(email);
    }

    public void preencherCampoPassword(String password) throws Exception {
        this.recuperarElemento("input", "id", "passwd").sendKeys(password);
    }

    public void clicarBotaoSignIn() throws Exception {
        this.recuperarElemento("button", "id", "SubmitLogin").click();
    }
}

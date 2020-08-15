package practice.steps;

import com.evandrofranca.frameworkautomacao.controle.ControleTeste;
import com.evandrofranca.frameworkautomacao.controle.Navegador;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import practice.contexto.TestContext;
import practice.telas.TelaLogin;
import practice.telas.TelaPrincipal;


public class LoginSteps {

    private final TestContext testContext;

    public LoginSteps(final TestContext testContext) {
        this.testContext = testContext;
    }

    @Dado("que acessei o site {string} com sucesso")
    public void que_acessei_o_site_com_sucesso(String url) {
        ControleTeste.determinarNavegador(Navegador.CHROME);
        ControleTeste.abrirBrowser(url);
    }

    @Dado("que acessei a tela de login")
    public void que_acessei_a_tela_de_login() throws Exception {
        TelaPrincipal tela = new TelaPrincipal();
        tela.clicarBotaoSignIn();
    }
    @Quando("preencho o campo email com {string}")
    public void preencho_o_campo_email(String email) throws Exception {
        TelaLogin tela = new TelaLogin();
        tela.preencherCampoEmail(email);
        testContext.setEmail(email);
    }

    @Quando("preencho o campo password com {string}")
    public void preencho_o_campo_password(String password) throws Exception {
        TelaLogin tela = new TelaLogin();
        tela.preencherCampoPassword(password);
    }

    @Quando("clico no botao login")
    public void clico_no_botao_login() throws Exception {
        TelaLogin tela = new TelaLogin();
        tela.clicarBotaoSignIn();
    }

}

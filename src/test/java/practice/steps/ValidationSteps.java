package practice.steps;

import io.cucumber.java.pt.Entao;
import practice.contexto.TestContext;
import practice.telas.TelaMyAccount;


public class ValidationSteps {

    private final TestContext testContext;

    public ValidationSteps(final TestContext testContext) {
        this.testContext = testContext;
    }

    @Entao("o sistema permite o login")
    public void o_sistema_permite_o_login() throws Exception {
        TelaMyAccount tela = new TelaMyAccount();
        tela.validarLogin();
    }

    @Entao("a API retorna mensagem de sucesso")
    public void aAPIRetornaMensagemDeSucesso() {
        testContext.getUserResponse().statusCode(200);
    }

    @Entao("a API retorna mensagem de erro de requisição")
    public void aAPIRetornaMensagemDeErroDeRequisicao() {
        testContext.getUserResponse().statusCode(400);
    }
}

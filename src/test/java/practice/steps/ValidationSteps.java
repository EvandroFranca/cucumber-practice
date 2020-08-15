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

        System.out.println("Testando picocontainer para email: " + testContext.getEmail());
        System.out.println("Testando picocontainer para password: " + testContext.getPassword());
    }
}

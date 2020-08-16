package practice.steps;

import br.com.six2six.fixturefactory.Fixture;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import practice.api.models.UserDto;
import practice.api.requests.UserRequest;
import practice.contexto.TestContext;
import practice.fixture.templates.UserTemplate;

import static org.junit.Assert.fail;

public class UserSteps {

    private final TestContext testContext;
    private final UserRequest userRequest;

    private UserDto user;

    public UserSteps(final TestContext testContext, final UserRequest userRequest) {
        this.testContext = testContext;
        this.userRequest = userRequest;
    }

    @Dado("que informo dados de usuário {string} na API")
    public void queInformoDadosDeUsuarioNaAPI(String tipoUsuario) {

        switch (tipoUsuario) {
            case "válido":
                user = Fixture.from(UserDto.class).gimme(UserTemplate.DADOS_VALIDOS);
                break;

            default:
                fail("Tipo de usuário não especificado");
        }

    }

    @Entao("que não informo o campo userName")
    public void naoEnvioOCampoUserName() {
        user.setUserName(null);
    }

    @Quando("realizo a chamada da API de usuários")
    public void realizoChamadaDaAPIDeUsuarios() {
        testContext.setUserResponse(userRequest.getSpec().body(user).when().post("/user").then());
    }
}

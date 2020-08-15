package cucumber.telas;

import com.evandrofranca.frameworkautomacao.tela.TelaWeb;

public class TelaMyAccount extends TelaWeb {

    public void validarLogin() throws Exception {
        this.recuperarElemento("a", "title", "View my customer account");
    }
}

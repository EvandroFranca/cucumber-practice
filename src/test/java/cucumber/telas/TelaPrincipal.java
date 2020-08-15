package cucumber.telas;

import com.evandrofranca.frameworkautomacao.tela.TelaWeb;

public class TelaPrincipal extends TelaWeb {

    public void clicarBotaoSignIn() throws Exception {
        this.recuperarElemento("a", "class", "login").click();
    }

}

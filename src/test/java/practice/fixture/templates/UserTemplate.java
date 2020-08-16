package practice.fixture.templates;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import practice.api.models.UserDto;
import practice.util.Utils;

public class UserTemplate implements TemplateLoader {

    public static final String DADOS_VALIDOS = "NOVO_USUARIO_VALIDO";

    public void load() {
        Fixture.of(UserDto.class).addTemplate(DADOS_VALIDOS, new Rule() {{
            add("id", Utils.gerarNumeroAleatorio(1, 200));
            add("userName", Utils.gerarStringAleatoria(5));
            add("firstName", "Evandro");
            add("lastName", "Sampaio");
            add("email", "evs.ftw@gmail.com");
            add("password", "12345");
            add("phone", "99775467");
            add("userStatus", 0);
        }});
    }
}

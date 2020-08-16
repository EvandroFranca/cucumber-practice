package practice.fixture.loaders;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

public class FixturesLoader {

    public static void carregarTemplates() {
        FixtureFactoryLoader.loadTemplates("practice.fixture.templates");
    }
}

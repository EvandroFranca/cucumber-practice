package practice.util;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import org.junit.BeforeClass;

public class TestSetup {

    @BeforeClass
    public static void carregarTemplates() {
        FixtureFactoryLoader.loadTemplates("practice.fixture.templates");
    }
}

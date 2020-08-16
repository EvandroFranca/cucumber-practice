package practice.util;

import org.junit.BeforeClass;
import practice.fixture.loaders.FixturesLoader;

public class GlobalHooks {

    @BeforeClass
    public static void testSetups() {
        FixturesLoader.carregarTemplates();
    }
}

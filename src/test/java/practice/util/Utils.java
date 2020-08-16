package practice.util;

import org.apache.commons.lang.RandomStringUtils;

public class Utils {

    public static String gerarStringAleatoria(Integer tamanho) {
        return RandomStringUtils.randomAlphabetic(tamanho);
    }

    public static Integer gerarNumeroAleatorio(Integer minimo, Integer maximo) {
        return (int) ((Math.random() * (maximo - minimo)) + minimo);
    }
}

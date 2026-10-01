package s8_HerramientasSoftware;

public class Factor {

    public static long calcular(int n) {
        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }

        return resultado;
    }
}

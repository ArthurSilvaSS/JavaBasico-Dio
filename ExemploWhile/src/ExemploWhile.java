import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valarAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce de valor: " + valorDoce + "adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("mesada: " + mesada);
        System.out.println("a mesada acabou");
    }

    public static double valarAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}

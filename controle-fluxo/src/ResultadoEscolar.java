public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        /*
        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Prova de recuperacao");
        else
            System.out.println("Reprovado");
         */

        /*
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
         */

        String resultado = nota >= 7 ? "Aprovado"
                : nota >= 5 && nota < 7 ? "Recuperacao" : "Reprovado";

        System.out.println(resultado);
    }
}

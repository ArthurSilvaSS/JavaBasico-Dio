public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"Arthur", "Silva"};

        /*
        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x= " + x + " e " + alunos[x]);
        }

         */

        for(String aluno : alunos){
            System.out.println("Nome do aluno e " + aluno);
        }
    }
}

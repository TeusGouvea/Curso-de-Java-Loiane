package Aula43;

public class Teste {

    public static void main(String[] args){

        Aluno aluno = new Aluno();

        aluno.setCursos("Ciência da computação");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "adkasjdkal";
        String s2 = "jahdsdao";

        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();

        aluno.setCursos("Ciência da computação");
        double[] notas2 = {10, 9, 8, 7};
        aluno.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));

    }

}

package Aula41;

public class Aluno extends Pessoa {


    private String curso;
    private double[] notas;

    public Aluno(){
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso){
        super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCursos() {
        return curso;
    }

    public void setCursos(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }

    public void metodoQUalquer(){
        super.setCpf("54564545646646");
    }

    public String obterEtiquetaEndereco(){

        String s = "Endereço do Aluno: ";
        s += super.getEndereco();

        return s;

    }


    public  void imprimirEtiquetaEndereco(){
        System.out.println("Imprimindo endereço do Aluno");
        System.out.println(this.obterEtiquetaEndereco());
    }

}

package Aula39;

public class Professor extends Pessoa {

    private String departamento;
    private double salario;
    private String nomeCurso;


    public void verificarAcesso(){

        this.nomeVisibilidade = "Maria";
        super.nomeVisibilidade = "Maria";

        this.setNomeVisibilidade("Maria");

    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

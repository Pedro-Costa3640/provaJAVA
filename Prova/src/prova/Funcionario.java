
package prova;

import java.time.LocalDate;

public abstract class Funcionario extends Fisica{
    
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected Setor setor;
    protected double salario;

    public Funcionario(String cpf, String rg, String matricula, Setor setor, double salario, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(dataNascimento, genero, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public double getSalario() {
        return salario;
    }

     @Override
    public String toString() {
        return
                "Informações do Funcionário= " + 
                super.toString() +
                "\n CPF: " + cpf + 
                "\n RG: " + rg + 
                "\n Matrícula:" + matricula + 
                "\n Setor: " + setor.area + 
                "\n Salário: " + salario;
    }
    
}

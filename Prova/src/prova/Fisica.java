
package prova;

import java.time.LocalDate;
import java.time.Period;

public abstract class Fisica extends Pessoa{
    
    protected LocalDate dataNascimento;
    protected Genero genero;

    public Fisica(LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "\n Pessoa Física = " + 
                super.toString() +
                "\n Data de Nascimento: " + dataNascimento + 
                "\n Idade: "+ getIdade() +
                "\n Gênero: " + genero.getTexto() +
                "\n Caractere: " + genero.getCaractere();
    }
    
    
}


package prova;

public class Juridica extends Pessoa{
    
    private String cnpj;
    private String inscricaoEstadual;

    public Juridica(String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "Pessoa Jurídica: " + 
                super.toString() +
                "\n CNPJ: " + cnpj + 
                "\n Inscrição Estadual: " + inscricaoEstadual;
    }
    
    
    
}


package prova;

public abstract class Pessoa {
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;

    public Pessoa(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return  
                "\n Nome: " + nome + 
                "\n Telefone:" + telefone + 
                "\n E-mail: " + email + 
                "\n Endereço: " + endereco;
    }
    
    
    
}


package prova;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
    
        Juridica juridico = new Juridica("123456789", "AAB456", "Rafael", "(71) 99999-9999", "rafa@gmail.com", 
                new Endereco("rua 1", "12", "", "41414-41", "Salvador", UnidadeFederativa.BAHIA));
        
        Cliente cliente = new Cliente(0, LocalDate.of(2000, Month.MARCH, 21), Genero.FEMININO, "Júlia", "(71) 99999-9999", "julia@gmail.com", 
                new Endereco("Bloco C", "1", "proximo ao", "14144-56", "Lapa", UnidadeFederativa.SAO_PAULO));
        
        Motoboy motoboy = new Motoboy("1111222", "123.456.789-10", "4545.4545.4545", "5555", Setor.OPERACOES, 1350, LocalDate.of(1999, Month.MARCH, 10), Genero.MASCULINO, "Paulo", "(71) 99999-9999", "paulo@gmail.com", 
                new Endereco("Rua 7", "15", "próximo ao campo", "15155-12", "Morro", UnidadeFederativa.RIO_DE_JANEIRO));
        
        Medico medico = new Medico("11144aa", "123.456.789-10", "4545.4545.4545", "456456-4", Setor.SAUDE, 6550, LocalDate.of(2000, Month.MARCH, 20), Genero.MASCULINO, "Douglas", "(71) 99999-9999", "douglas@gmail.com", 
                new Endereco("Condomínio", "25", "", "15155-56", "Salvador", UnidadeFederativa.BAHIA));
        
        Advogado advogado = new Advogado("45665", "123.456.789-10", "4545.4545.4545", "456456-aa", Setor.JURIDICO, 4000, LocalDate.of(1998, Month.MARCH, 13), Genero.FEMININO, "Mirtes", "(71) 99999-9999", "mirtes@gmail.com", 
                new Endereco("Rua", "150", "Próximo a rua2", "45645-56", "São Paulo", UnidadeFederativa.SAO_PAULO));
        
        System.out.println("Informações: ");
        System.out.println(juridico.toString());
        System.out.println("");
        System.out.println(cliente.toString());
        System.out.println("");
        System.out.println(motoboy.toString());
        System.out.println("");
        System.out.println(medico.toString());
        System.out.println("");
        System.out.println(advogado.toString());
        
    }
    
}

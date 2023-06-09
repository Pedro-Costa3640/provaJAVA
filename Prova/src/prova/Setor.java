
package prova;

public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Jurídico"), 
    OPERACOES("Operações");
    
    public String area;

    private Setor(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }
    
    
}

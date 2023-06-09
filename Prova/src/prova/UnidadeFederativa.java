
package prova;

public enum UnidadeFederativa {
    BAHIA ("Bahia"),
    SAO_PAULO("São Paulo"),
    RIO_DE_JANEIRO("Rio de Janeiro");
    
    private String local;

    private UnidadeFederativa(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }
    
    
    
}

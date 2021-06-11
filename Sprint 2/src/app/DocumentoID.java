package app;

public class DocumentoID {
    private String codigoID;
    private TipoDocumento tipo;

    DocumentoID(String cod, TipoDocumento t){
        this.setCodigoID(cod);
        this.setTipo(t); }


    public String getCodigoID() {
        return codigoID; }

    public TipoDocumento getTipo() {
        return tipo; }

    public void setCodigoID(String codigoID) {
        this.codigoID = codigoID;
    }

    public void setTipo(TipoDocumento tipo) {
        this.tipo = tipo;
    }
}

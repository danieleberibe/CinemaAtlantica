public class Offerta {

    private int idOfferta;
    private String tipoOfferta;
    private int scadenzaOfferta;

    public Offerta(int idOfferta2, String tipoOfferta2, int scadenzaOfferta2) {
        idOfferta = idOfferta2;
        tipoOfferta = tipoOfferta2;
        scadenzaOfferta = scadenzaOfferta2;
    }


    public int getScadenzaOfferta() {
        return scadenzaOfferta;
    }
    public int getIdOfferta() {
        return idOfferta;
    }
    public void setIdOfferta(int idOfferta) {
        this.idOfferta = idOfferta;
    }
    public String getTipoOfferta() {
        return tipoOfferta;
    }
    public void setTipoOfferta(String tipoOfferta) {
        this.tipoOfferta = tipoOfferta;
    }
    public void setScadenzaOfferta(int scadenzaOfferta) {
        this.scadenzaOfferta = scadenzaOfferta;
    }
    
}

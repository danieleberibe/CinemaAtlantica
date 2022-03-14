public class Prenotazione {
    private int idPrenotazione;
    private int prezzoPrenotazione;

    public Prenotazione (int idPrenotazione2, int prezzoPrenotazione2 ) { 

      idPrenotazione = idPrenotazione2;
      prezzoPrenotazione = prezzoPrenotazione2;
    }

    public int getIdPrenotazione() {
        return idPrenotazione;
    }
    
    public void setIdPrenotazione(int idPrenotazione2) {
        idPrenotazione = idPrenotazione2;
    }

    public int getPrezzoPrenotazione() {
        return prezzoPrenotazione;
    }
    
    public void setPrezzoPrenotazione(int prezzoPrenotazione2) {
        prezzoPrenotazione = prezzoPrenotazione2;
    }

 }
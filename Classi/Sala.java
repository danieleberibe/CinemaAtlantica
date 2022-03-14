public class Sala {
    private int numeroSala;
    private int numeroPostiTotali;
    private int postiOccupati;

    public Sala(int numeroSala2, int numeroPostiTotali2, int postiOccupati2) {
      numeroSala = numeroSala2;
      numeroPostiTotali = numeroPostiTotali2;
      postiOccupati = postiOccupati2;
    }


    public int getnumeroSala() {
        return numeroSala;
    }
    
    public void setnumeroSala(int numeroSala2) {
        numeroSala = numeroSala2;
    }
    public int getnumeropostiTotali() {
        return numeroSala;
    }

    public void setnumeroPostiTotali(int numeroPostiTotali2) {
        numeroPostiTotali = numeroPostiTotali2;
    }

    public int getpostiOccupati() {
        return postiOccupati;
    }

    public void setpostiOccupati(int postiOccupati2) {
        postiOccupati = postiOccupati2;
    }



}



public class Film {
   private String name;
   private String genere;
   private String descrizione;
   private int durata;

   public Film (String nome, String gen, String desc, int dur) {
       name = nome;
       genere = gen;
       descrizione = desc;
       durata = dur;
   }

   public String getName(){
    return name;
    }
    public String getGenere(){
        return genere;
    }
    public String getDescrizione(){
        return descrizione;
    }
    public int getDurata(){
        return durata;
    }
}
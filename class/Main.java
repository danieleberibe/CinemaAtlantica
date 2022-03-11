import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner; 

public class Main{

public static void main(String[] args) {
    Dictionary <String,String> utenti = new Hashtable <String,String>();
    Scanner scanner = new Scanner(System.in);
    boolean x  = true;
    User a = new User();
    while (a.getEmail()==null){ 
        System.out.println("1-Login \n2-Resgistrati");
        String risposta = scanner.nextLine();
        if ( risposta.equals("1")){ // Login

            System.out.println("Inserisci email ");
            String email = scanner.nextLine();
            System.out.println("Inserisci Password ");
            String password = scanner.nextLine();
            if(utenti.get(email).equals(password)){
                a.setEmail(email);
                a.setPasswordutente(password);

            }


        }
        else if (risposta.equals("2")){   //Registrazione
                  
            System.out.println("Inserisci email ");
            String email = scanner.nextLine();
       
            if (utenti.get(email) != null){
                System.out.println("Email gia esistente ");
            }
            else{
                System.out.println("Inserisci Password ");
                String password = scanner.nextLine();
                utenti.put(email, password);
                System.out.println("Utente Creato ");
            }
        }
    }
    System.out.println("Benvenuto " + a.getEmail());


    
}
}

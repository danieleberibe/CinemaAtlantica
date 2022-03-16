import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner; 
import java.io.*;

public class Main{

public static void main(String[] args) throws FileNotFoundException,IOException {
    Dictionary <String,String> utenti = new Hashtable <String,String>();
    Scanner scanner = new Scanner(System.in);
    boolean x  = true;
    User a = new User();
 

    
    while (a.getEmail()==null){ 
        System.out.println(" 1-Login \n 2-Registrati \n 3-Generi ");
        String risposta = scanner.nextLine();
        System.out.println();

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
            
            if(Utility.verificaCorrettezzaEmail(email)) {
                System.out.println("email giusta");
            
       
                if (utenti.get(email) != null){
                    System.out.println("Email gia esistente ");
                }
                else{
                    System.out.println("Inserisci Password ");
                    String password = scanner.nextLine();
                    if (Utility.verificaCorrettezzaPassword(password)){
                        System.out.println("Try Again!");
                    }
                    else{
                        utenti.put(email, password);
                        System.out.println("Utente Creato ");
                    }
                    
                }
            }
            else{
                System.out.println("Email sbagliata");
            }
        }
        else if (risposta.equals("3")){
            System.out.println(java.util.Arrays.asList(Film.Generi.values()));
                  
        }
    }
    System.out.println("Benvenuto " + a.getEmail());


    
}
}

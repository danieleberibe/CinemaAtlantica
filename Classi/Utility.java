import javax.lang.model.util.ElementScanner14;
import java.util.*;

public class Utility {
    private static Utility verificaEmail;
    public Utility()
    {

    }
    public static Utility getUtility(){
        if (verificaEmail == null){
            verificaEmail = new Utility();
        }
        return verificaEmail;
    }
    public static boolean verificaCorrettezzaEmail(String email){
        int posChiocciola = email.indexOf("@");
        int posPunto = 0;
        //Troviamo prima occorrenza del punto partendo dalla fine, per calcolarci il dominio
        for(int i=email.length()-1;i>0;i--){
            if(email.charAt(i)=='.'){
                posPunto = i;
                break;
            }
        }
        boolean verificaPreChiocciola = false;
        boolean verificaPostChiocciola = false;
        int contatoreDominio = 0;
        for(int i=posChiocciola-1; i>0 ;i-- )
        {
            
            if(((int)email.charAt(i)>=65)&&((int)email.charAt(i)<=122)
                ||(int)email.charAt(i)>=48&&(int)email.charAt(i)<=57
                ||(int)email.charAt(i)==95 || (int)email.charAt(i)==46
                ||(int)email.charAt(i)==45)
            {
                verificaPreChiocciola = true;
                
            }
            else
            {
                verificaPreChiocciola = false;
                break;
            }
        }
            
        
        if(verificaPreChiocciola==true)
            for(int i = posChiocciola+1; i<posPunto;i++)
                if((int)email.charAt(i)>=65&&(int)email.charAt(i)<=122||(int)email.charAt(i)>=48&&(int)email.charAt(i)<=57)
                    verificaPostChiocciola = true;
                else
                    {
                        verificaPostChiocciola = false;
                        break;
                    }
            
        
        if(verificaPostChiocciola==true)
            for(int i = posPunto+1; i<email.length();i++)
                if((int)email.charAt(i)>=65&&(int)email.charAt(i)<=122)
                    contatoreDominio++;
        if(contatoreDominio>=2){
            return true;
        }
        return false;
                
            
        
        }
        public static boolean verificaCorrettezzaPassword (String psw) {
            boolean carattereSpeciale = false;
            boolean caps = false;
            boolean numero = false;

            if (psw.length() >= 4){
                for(int i= 0; i<psw.length()-1; i++ ){
                    if((int)psw.charAt(i) >=33 && (int)psw.charAt(i) <=47|| //controllo carattere speciale
                       (int)psw.charAt(i) >=58 && (int)psw.charAt(i) <=64||
                       (int)psw.charAt(i) >=91 && (int)psw.charAt(i) <=96||
                       (int)psw.charAt(i) >=123 && (int)psw.charAt(i) <=126){ 
                        carattereSpeciale=true;
                    }
                    if((int)psw.charAt(i) >=65 && (int)psw.charAt(i) <=90){ //controllo Maiuscola
                        caps=true;
                    }
                    if((int)psw.charAt(i) >=48 && (int)psw.charAt(i) >=57){ //controllo numero
                        numero=true;
                    }
                }    
            }
            else{
                System.out.println("psw troppo corta");
            }
            if(carattereSpeciale&&caps&&numero){
                return false;
            }
            return true;

        }
    }

// 
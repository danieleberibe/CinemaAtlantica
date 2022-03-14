import java.lang. *;


public class Utility {

private static Utility istanza = null;
public static Utility utility(){
    if (istanza == null){
        istanza = new utility();
        return istanza;
    }
}

    public static void EmailVal(String EmailCheck) {
        if (EmailCheck.contains('@')) {
            if (EmailCheck.contains('.')){
                System.out.println("email valida");
            } else {
                System.out.println("Inserisci il punto nell'email");
            }
        } else {
            System.out.println("Inserisci la chiocciola nell'email");
        }

    }

}
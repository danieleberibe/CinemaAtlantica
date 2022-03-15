
public class Utility {

private static Utility istanza = null;
public static Utility Utility(){
    if (istanza == null){
        istanza = new Utility();
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

    public static boolean PassVer(String PassCheck){
        if (PassCheck.length() < 8){
        System.out.println("La password è troppo corta");
        return false;
    } else return true;
}

public static void EmptyCheck(String PassCheck){
    if (PassCheck.isEmpty()) {
        System.out.println("Inserire la password.");
    }
}

public static boolean PassUpperCaseCheck (String PassCheck){
    for (int i = 0; i < PassCheck.length(); i++) {
    if (Character.isUpperCase(PassCheck.charAt(i))){
       System.out.println("è maiuscola");
       return true;
    } 
} System.out.println("è minuscola");
  return false;
}


}
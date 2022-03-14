
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

    public static void PassVer()(String PassCheck){
        if (PassCheck.length() < 8){
            System.out.println("La password è troppo corta!");
        }
    }

    public static passUpperCheck(String PassCheck){
    for (int i = 0; i<lenght-1; i++){
        lenght = PassCheck;
    }
}
}
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.mysql.cj.xdevapi.Statement;

public class Main {

    static dbConnection db = new dbConnection();
    static Scanner input = new Scanner(System.in);

    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) throws Exception {
        int scelta = 0;

        do {
            input.nextLine();
            System.out.println("1.Cerca per Nome ");
            System.out.println("2.Cerca per Cognome ");
            System.out.println("3.Inserisci Utente ");
            System.out.println("4.Cerca per Email ");
            System.out.println("5.Crea tabella nel db passando il nome ");
            System.out.println("7.Exit");
            scelta = input.nextInt();
            switch (scelta) {
                case 1:
                    cercaNome();
                    input.nextLine();
                    break;
                case 2:
                    cercaCognome(input);
                    input.nextLine();
                    break;
                case 3:
                    insertUser();
                    input.nextLine();
                    break;
                case 4:
                    cercaEmail(input);
                    input.nextLine();
                    break;
                case 5:
                    disattivaUtente();
                    input.nextLine();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("A coglione metti un numero giusto");
                    break;
            }
        } while (scelta != 7);

    }

    private static void cercaCognome(Scanner input) throws Exception {
        Scanner lele = new Scanner(System.in);
        System.out.println("inserisci cognome da cercare ");
        String cognome = lele.nextLine();
        ResultSet rs = db.getQuery("SELECT * FROM utente where cognome ='" + cognome + "';");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
                    + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7));
        }
    }

    private static void cercaEmail(Scanner input) throws Exception {
        Scanner lele1 = new Scanner(System.in);
        System.out.println("inserisci l'email che vuoi cercare ");
        String email = lele1.nextLine();

        ResultSet rs = db.getQuery("SELECT * FROM utente where email ='" + email + "';");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
                    + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7));
        }
    }

    private static void cercaNome() throws Exception {
        Scanner lele2 = new Scanner(System.in);
        System.out.println("inserisci il nome utente da cercare ");
        String name = lele2.nextLine();
        ResultSet rs = db.getQuery("SELECT * FROM utente where nome ='" + name + "';");
        while (rs.next()) {
            if (rs.getInt(7) == 0) {
                System.out.println("account disattivato");
            } else {

                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
                        + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7));
            }
        }

    }

    private static void insertUser() throws Exception {
        Scanner ciao = new Scanner(System.in);
        Scanner ciao1 = new Scanner(System.in);

        System.out.println("nome");
        String nome = ciao.nextLine();

        System.out.println("cognome");
        String cognome = ciao.nextLine();

        System.out.println("email");
        String email = ciao.nextLine();

        System.out.println("data nascita: aaaa-mm-gg");
        String data = ciao.nextLine();

        System.out.println("inserisci password");
        String psw = ciao.nextLine();

        System.out.println("inserisci se attivo o non (0 o 1)");
        int attivo = ciao.nextInt();

        int res = db.insertQuery("INSERT INTO cinema_db.utente(nome,cognome,email,data,password,attivo) VALUES ('"
                + nome + "', '" + cognome + "','" + email + "','" + data + "','" + psw + "'," + attivo + ");");
        System.out.println(res);
    }

    private static void disattivaUtente() {
        System.out.println("inserisci id utente da disattivare");
        Scanner mario = new Scanner(System.in);
        int id = mario.nextInt();
        int res = db.insertQuery("UPDATE cinema_db.utente SET attivo = 0 WHERE idutente = " + id + ";");
        System.out.println(res);

    }

    private static void creaTable() throws Exception {
        Scanner bho = new Scanner(System.in);
        System.out.println("inserisci nome Tabella");
        String nameTabella = bho.nextLine();
        int res = db.insertQuery("CREATE TABLE " + nameTabella
                + "(PersonID int,LastName varchar(255),FirstName varchar(255), Address varchar(255), City varchar(255));");
        System.out.println(res);
    }

}

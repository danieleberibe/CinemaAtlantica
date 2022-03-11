public class User  {
    private String nome ;
    private String cognome;
    private String email;
    private String passwordUtente;
    private String username;
    private boolean signed;


public User (String nome2, String cognome2, String email2, String passwordUtente2, String username2, boolean signed2 ) { 

    nome2 = nome;
    cognome2 = cognome;
    email2 = email;
    passwordUtente2 = passwordUtente;
    username2 = username;
	signed2 = signed;

}

public String getNome() {
	return nome;
}

public void setNome(String nome2) {
	nome2 = nome;
}

public String getCognome() {
	return cognome;  
}

public void setCognome(String cognome2) {
	cognome2 = cognome;
}
public String getEmail() {
	return nome;   
}

public void setEmail(String email2) {
	email2 = email;
}

public String getPasswordutente() {
	return passwordUtente;   
}

public void setPasswordutente(String passwordUtente2) {
	passwordUtente2 = passwordUtente;
}

public String getUsername() {
	return username;   
}

public void setUsername(String username2) {
	username2 = username;
}

public boolean getSigned() {
	return signed;   
}

public void setSigned(boolean signed2) {
	signed2 = signed;
}

}
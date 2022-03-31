public class User  {
    private String nome ;
    private String cognome;
    private String email;
    private String passwordUtente;
    private String username;
    private boolean signed;

	public User (){

	}

public User (String nome2, String cognome2, String email2, String passwordUtente2, String username2, boolean signed2 ) { 
	nome = nome2;
	cognome = cognome2;
	email = email2;
	passwordUtente = passwordUtente2;
	username = username2;
	signed = signed2;
}
public String toString(){
	return this.nome;
}

public String getNome() {
	return nome;
}

public void setNome(String nome2) {
	nome = nome2;
}

public String getCognome() {
	return cognome;  
}

public void setCognome(String cognome2) {
	cognome = cognome2;
}
public String getEmail() {
	return email;   
}

public void setEmail(String email2) {
	email = email2;
}

public String getPasswordutente() {
	return passwordUtente;   
}

public void setPasswordutente(String passwordUtente2) {
	passwordUtente = passwordUtente2;
}

public String getUsername() {
	return username;   
}

public void setUsername(String username2) {
	username = username2;
}

public boolean getSigned() {
	return signed;   
}

public void setSigned(boolean signed2) {
	signed = signed2;
}

}
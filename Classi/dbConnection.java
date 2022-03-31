
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class dbConnection {
    
    Connection con;
    PreparedStatement ps=null;
    public dbConnection(){
        con=this.get_connection();
    }
     
     public Connection get_connection(){
	Connection connection=null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema_db?serverTimezone=UTC","root","2000");
	}catch (Exception e) {
		System.out.println(e);
	}
        
	return connection;
     }
     
     public int insertQuery(String query){
         
        try {
             ps=con.prepareStatement(query);
             return ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);
            return 0;
        }
         
    }
     
     public ResultSet getQuery(String query){
        try {
            ps=con.prepareStatement(query);
            return ps.executeQuery();
        } catch (SQLException e) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
     
     public void relaseStatement(){
        try {
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public void closeConnection(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}

package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
   //ATRIBUTOS:
    public Connection conn;
    private String host = "localhost:3307";
    private String dataBase = "productosmisiontic2";
    private String User = "root";
    private String password = "";
    //METODOS:
    public void conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.dataBase+"?zeroDateTimeBehavior=CONVERT_TO_NULL",this.User,this.password);
            //JOptionPane.showMessageDialog(null, "conexion Correcta!!");
        }
        catch(Exception error){
            JOptionPane.showMessageDialog(null, "Error!!"+error);   
        
                    
                               
        }
         
        
    }
    public void desconectar(){
        conn = null;
    }
}

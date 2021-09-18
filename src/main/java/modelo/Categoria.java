
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Categoria {
    //ATRIBUTOS:
    private int idCategoria;
    private String nombreCategoria;
    
    //CONSTRUCTOR:

    public Categoria() {
    }
    //ENCAPSULADO:

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    //METODO:
    public ResultSet consultarCategoria(){
        Conexion objConector = new Conexion();
        objConector.conectar();
        try{
            String Sql = "SELECT nombreCategoria FROM categoria;";
            PreparedStatement stmt;
            stmt = objConector.conn.prepareStatement(Sql);
            ResultSet consulta = stmt.executeQuery();
            return consulta;
        }
        catch(Exception error){
            JOptionPane.showMessageDialog(null, "Error!!"+error);
            objConector.desconectar();
      }
        return null;
    } 
    
}    


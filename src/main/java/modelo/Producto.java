
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Producto {
    //ATRIBUTOS:
    private int idProducto;
    private String nombreProducto;
    private int cantidadProducto;
    private Categoria categoriaProducto;
    private int precioProducto;
    
    //CONSTRUCTOR:

    public Producto() {
    }

    public Producto(String nombreProducto, int cantidadProducto, Categoria categoriaProducto, int precioProducto) {
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.categoriaProducto = categoriaProducto;
        this.precioProducto = precioProducto;
    }
    
    //ENCAPSULADO:

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Categoria getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(Categoria categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }
    @Override
    public String toString (){
        return "Producto{"+"Id = "+ idProducto + ",Nombre = "+ nombreProducto + ",Cantidad = "+ cantidadProducto + ",Categoria = "+categoriaProducto+ ",Precio = "+precioProducto;
    }
    public void crearProducto(){
        Conexion objConector = new Conexion();
        objConector.conectar();
        try{
            String sql = "INSERT INTO producto " + " (nombreProducto, cantidadProducto, precioProducto, idCategoriaFK)" + " VALUES (?,?,?,?);";
            PreparedStatement stmt;
            stmt = objConector.conn.prepareStatement(sql);
            stmt.setString(1, this.nombreProducto);
            stmt.setInt(2,this.cantidadProducto);
            stmt.setInt(3, this.precioProducto);
            stmt.setInt(4, this.categoriaProducto.getIdCategoria());
            stmt.execute();
        }
        catch(Exception error){
            JOptionPane.showMessageDialog(null, "Error!!"+error);
            objConector.desconectar();
        }
    }
    public ResultSet consultarProducto(){
        Conexion objConector = new Conexion();
        objConector.conectar();
        try{
            String Sql = " SELECT * FROM producto "+
                          " WHERE nombreProducto LIKE  ?; ";  
            PreparedStatement stmt;
            stmt = objConector.conn.prepareStatement(Sql);
            stmt.setString(1, "%"+this.nombreProducto+"%");
            ResultSet consulta = stmt.executeQuery();
            return consulta;
        }
        catch(Exception error){
            JOptionPane.showMessageDialog(null, "Error!!"+error);
            objConector.desconectar();
      }
        return null;
    }
    public ResultSet listarProducto(){
        Conexion objConector = new Conexion();
        objConector.conectar();
        try{
            String Sql = "SELECT * FROM producto;";
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
    public void actualizarProducto(){
        Conexion objConector = new Conexion();
        objConector.conectar();
        try{
            String sql =" UPDATE producto SET " +
                         " nombreProducto = ?, "+
                         " cantidadProducto = ?, "+
                         " precioProducto = ? "+
                         " WHERE idProducto = ?;";
            PreparedStatement stmt;
            stmt = objConector.conn.prepareStatement(sql);
            stmt.setString(1, this.nombreProducto);
            stmt.setInt(2,this.cantidadProducto);
            stmt.setInt(3, this.precioProducto);
            stmt.setInt(4, (this.idProducto));
            stmt.execute();
            objConector.desconectar();
        }
        catch(Exception error){
            JOptionPane.showMessageDialog(null, "Error!!"+error);
            objConector.desconectar();
        }
    }
    public void eliminarProducto(){
    Conexion objConector = new Conexion();
        objConector.conectar();
        try{
            String sql =" DELETE FROM producto " +
                         " WHERE idProducto = ?;";
            PreparedStatement stmt;
            stmt = objConector.conn.prepareStatement(sql);
            stmt.setInt(1, (this.idProducto));
            stmt.execute();
            objConector.desconectar();
        }
        catch(Exception error){
            JOptionPane.showMessageDialog(null, "Error!!"+error);
            objConector.desconectar();
        }
    }
}

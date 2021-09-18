
package controlador;


import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Categoria;
import modelo.Producto;
import javax.swing.JOptionPane;


public class controlProducto {
    //ATRIBUTOS:
    private Producto objProducto = new Producto();
    
    //METODOS:
    public void crear (String nombre, String cantidad, String precio, Categoria categoria){
        
    
    try { 
        objProducto.setNombreProducto(nombre);
        objProducto.setCantidadProducto(Integer.parseInt(cantidad));
        objProducto.setPrecioProducto(Integer.parseInt(precio));
        objProducto.setCategoriaProducto(categoria);
      
        objProducto.crearProducto();
    }
    catch(Exception error){
            JOptionPane.showMessageDialog(null, "Error!!"+error); 
    }
    
  }
    public ArrayList listar(){
    
    try{
        ResultSet consulta =  objProducto.listarProducto();
        ArrayList<Producto>listaProducto = new ArrayList<>();
        
        while (consulta.next()){
            objProducto = new Producto();
            objProducto.setIdProducto(consulta.getInt(1));
            objProducto.setNombreProducto(consulta.getString(2));
            objProducto.setCantidadProducto(consulta.getInt(3));
            objProducto.setPrecioProducto(consulta.getInt(4));
            listaProducto.add(objProducto);
        }
            return listaProducto;
        }
    
    catch(Exception error){
            JOptionPane.showMessageDialog(null, "Error!!"+error); 
    }
    return null;
  }
    public void actualizar (String id, String nombre, String cantidad, String precio){
        
    
    try { 
        objProducto.setNombreProducto(nombre);
        objProducto.setCantidadProducto(Integer.parseInt(cantidad));
        objProducto.setPrecioProducto(Integer.parseInt(precio));
        objProducto.setIdProducto(Integer.parseInt(id));
      
        objProducto.actualizarProducto();
    }
    catch(Exception error){
            JOptionPane.showMessageDialog(null, "Error!!"+error); 
    }
    
  }
    public void eliminar (String id){
        
    
    try { 
        objProducto.setIdProducto(Integer.parseInt(id));
        objProducto.eliminarProducto();
    }
    catch(Exception error){
            JOptionPane.showMessageDialog(null, "Error!!"+error); 
      }
    }
    public ArrayList consultar(String nombre){
    
    try{
        objProducto.setNombreProducto(nombre);
        ResultSet consulta =  objProducto.consultarProducto();
        ArrayList<Producto>consultaProducto = new ArrayList<>();
        
        while (consulta.next()){
            objProducto = new Producto();
            objProducto.setIdProducto(consulta.getInt(1));
            objProducto.setNombreProducto(consulta.getString(2));
            objProducto.setCantidadProducto(consulta.getInt(3));
            objProducto.setPrecioProducto(consulta.getInt(4));
            consultaProducto.add(objProducto);
        }
            return consultaProducto;
        }
    
    catch(Exception error){
            JOptionPane.showMessageDialog(null, "Error!!"+error); 
    }
    return null;
    }
}
    
  
    
    

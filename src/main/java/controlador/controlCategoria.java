
package controlador;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Producto;


public class controlCategoria {
    private Categoria objCategoria = new Categoria();
    
    public ArrayList Cargarcbox(){
    
    try{
        ResultSet consulta =  objCategoria.consultarCategoria();
        ArrayList<Categoria>listaCategoria = new ArrayList<>();
        
        while (consulta.next()){
            objCategoria = new Categoria();
            objCategoria.setNombreCategoria(consulta.getString(1));
            listaCategoria.add(objCategoria);
        }
            return listaCategoria;
        }
    
    catch(Exception error){
            JOptionPane.showMessageDialog(null, "Error!!"+error); 
    }
  }
}

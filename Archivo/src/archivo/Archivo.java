
package archivo;
import java.util.Date;

/**
 *
 * @author Karen
 */
public class Archivo {
private String nombre;
private String tipo;
private Date fechaDeCreacion;

//setters
public void setNombre(String nombre){
    this.nombre= nombre;
}
public void setTipo(String tipo){
    this.tipo = tipo;
}
public void setFechaDeCreacion(Date fechaDeCreacion){
    this.fechaDeCreacion = fechaDeCreacion;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Archivo a = new Archivo();
       
       a.nombre="Deber1";
       a.tipo="PDF";
       a.fechaDeCreacion=new Date("2018/05/07");
       System.out.println("El nombre del archivo es: "+a.nombre);
      
       System.out.println("El tipo del archivo es: "+a.tipo);
      
       System.out.println("La fecha de creacion es: "+ a.fechaDeCreacion);
    }
    
}


package fer.controller;

/**
 *
 * @author flores caravantes fernando david
 */
public class Evaluacion {
    
    //1.-nombre de los atributos tipo string y tipo float 
    private String nombre;
    private float calificacion; 

    //1.-constructor de inicializacion 
       public Evaluacion(String nombre, float calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    Evaluacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     //1.-getters and setters 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    void setCalificacion(String calificacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}

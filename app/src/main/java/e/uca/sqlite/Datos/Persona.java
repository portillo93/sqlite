package e.uca.sqlite.Datos;

/**
 * Created by uca on 05-15-18.
 */

public class Persona {
    private String dui;
    private String nombre;

    public Persona(){

    }
    public Persona(String dui, String nombre){
        this.dui = dui;
        this.nombre = nombre;
    }
    public String getDui(){
        return dui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

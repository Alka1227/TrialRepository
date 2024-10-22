/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author javie
 */
public class Administ extends Persona {
private String IdAdmin;
private String Titulo;
private String Puesto;
//Campos específicos de la subclase.

//Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase
public Administ (String nombre, String apellidos, int edad) {
super(nombre, apellidos, edad);//Cierre del constructor
IdAdmin = "--------";
Titulo = "-------";
Puesto = "----";
//Métodos específicos de la subclase
}
public void mostrarNombreApellidosYCarnet(){
System.out.println ("Administrativo de nombre: " + getNombre() + " " +getApellidos());
    System.out.println("Id Admin: "+getIdAdmin());
    System.out.println("Titulo: "+ getTitulo());
    System.out.println("Puesto: "+ getPuesto());}

    public String getIdAdmin() {
        return IdAdmin;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setIdAdmin(String IdAdmin) {
        this.IdAdmin = IdAdmin;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public void captura(){
        System.out.println("Capturando datos");
    }
    
    public void atencion(String atendiendo){
        System.out.println("Atendiendo a "+atendiendo);
    }

    
}

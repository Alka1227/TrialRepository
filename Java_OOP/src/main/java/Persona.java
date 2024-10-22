/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author javie
 */
//Código de la clase Persona
public class Persona {
private String nombre;
private String apellidos;
private int edad;
//Constructor
public Persona (String nombre, String apellidos, int edad) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;}
//Métodos
    public String getNombre () { return nombre;}
    public String getApellidos () { return apellidos;}
    public int getEdad () { return edad;}
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
     //
    //Objeto Profesor
   /* System.out.println("///////////////////////////////////////////////////////////////////////");
    profesor1.mostrarNombreApellidosYCarnet();
    profesor1.enseñar();
    profesor1.calificar();
    System.out.println("///////////////////////////////////////////////////////////////////////");
    //Objeto Estudiante
    estudiante1.getInscrito();
    estudiante1.Inscribirse();
    estudiante1.getInscrito();
    estudiante1.getPrestamo();
    estudiante1.prestar();
    estudiante1.getPrestamo();
    estudiante1.devolver();
    estudiante1.getPrestamo();
    System.out.println("///////////////////////////////////////////////////////////////////////");
    //objeto administ
    admin.mostrarNombreApellidosYCarnet();
    admin.atencion(estudiante1.getNombre()+" "+estudiante1.getApellidos());
    admin.captura();
    System.out.println("///////////////////////////////////////////////////////////////////////");*/
}//Cierre de la clase



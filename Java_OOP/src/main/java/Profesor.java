/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author javie
 */
//Código de la clase profesor, subclase de la clase Persona
public class Profesor extends Persona {
//Campos específicos de la subclase.
private String IdProfesor;
//Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase
public Profesor (String nombre, String apellidos, int edad) {
super(nombre, apellidos, edad);
IdProfesor = "Unknown";}//Cierre del constructor
//Métodos específicos de la subclase
public void setIdProfesor (String IdProfesor) { this.IdProfesor = IdProfesor;}
public String getIdProfesor () { return IdProfesor;}
public void mostrarNombreApellidosYCarnet() {
// nombre = "Paco"; Si tratáramos de acceder directamente a un campo privado de la superclase, salta un error
// Sí podemos acceder a variables de instancia a través de los métodos de acceso públicos de la superclase
System.out.println ("Profesor de nombre: " + getNombre() + " " +getApellidos()); 
System.out.println("Id de profesor: " + getIdProfesor());}
public void enseñar(){
        System.out.println("El maestro le enseña a sus alumnos");}
public void calificar(){
        System.out.println("El maestro califica a sus alumnos");}
}//Cierre de la clase

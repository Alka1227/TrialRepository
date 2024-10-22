/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author javie
 */
//Código de la clase profesor, subclase de la clase Persona
public class Estudiante extends Persona {
private String matricula;
private int grado;
private String grupo;
private String carrera;
private Boolean BIS;
public Boolean Inscrito = false;
public Boolean prestamo = false;
//Campos específicos de la subclase.

//Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase
public Estudiante (String nombre, String apellidos, int edad) {
super(nombre, apellidos, edad);//Cierre del constructor
matricula = "--------";
BIS = false;
carrera = "-------";
grupo = "----";
grado =0;
//Métodos específicos de la subclase
}
public void mostrarNombreApellidosYCarnet(){
System.out.println ("Alumno de nombre: " + getNombre() + " " +getApellidos());
    System.out.println("Matricula: "+getMatricula());
    System.out.println("Grado: "+ getGrado()+" Grupo: "+ getGrupo()+" BIS: "+getBIS());
    System.out.println("Carrera: "+ getCarrera());}

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setBIS(Boolean BIS) {
        this.BIS = BIS;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getGrado() {
        return grado;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getCarrera() {
        return carrera;
    }

    public Boolean getBIS() {
        return BIS;
    }

    public void getInscrito() {
        System.out.println("Checando si el alumno esta inscrito...");
        if(Inscrito==true){
            System.out.println("El alumno esta inscrito");}
        if(Inscrito==false){
            System.out.println("El alumno no ha sido inscrito");}}

    public void setInscrito(Boolean Inscrito) {
        this.Inscrito = Inscrito;
    }

    public void getPrestamo() {
        System.out.println("Checando si el alumno tiene un prestamo...");
        if(prestamo==true){
            System.out.println("El alumno si tiene un prestamo");}
        if(prestamo==false){
            System.out.println("El alumno no tiene ningún prestamo");}}

    
    public void Inscribirse(){
        if(Inscrito==true){
            System.out.println("El alumno ya esta inscrito");}
        if(Inscrito==false){
            System.out.println("Inscribiendo alumno");
            System.out.println("El alumno ha sido inscrito");
            Inscrito=true;}}
    public void prestar(){
        System.out.println("El alumno ahora tiene un prestamo");
        prestamo=true;}
    public void devolver(){
        System.out.println("El alumno ya no tiene un prestamo");
        prestamo=false;}

}


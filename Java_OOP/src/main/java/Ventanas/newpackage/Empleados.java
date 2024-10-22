
package Ventanas.newpackage;

public class Empleados {
    private int ID;
    private String Nombre;      //Variables de la superclase
    private String FechaNAC;
    private String Puesto;
    private String Jornada;
    private int Sueldo;
    
    //Constructores
    
    public Empleados(int ID, String Nombre, String FechaNAC, String Puesto, String Jornada) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.FechaNAC = FechaNAC;
        this.Puesto = Puesto;
        this.Jornada = Jornada;
    }
    public Empleados() {}
    
    //Métodos
    public void imprimir() {
        
    }
    
    
    //Setters y Getters

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setFechaNAC(String FechaNAC) {
        this.FechaNAC = FechaNAC;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public void setJornada(String Jornada) {
        this.Jornada = Jornada;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getFechaNAC() {
        return FechaNAC;
    }

    public String getPuesto() {
        return Puesto;
    }

    public String getJornada() {
        return Jornada;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    
    
    
}

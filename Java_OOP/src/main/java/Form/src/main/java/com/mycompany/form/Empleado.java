package com.mycompany.form;

public class Empleado {
    private int id;
    private String nombre;
    private String fechaNacimiento;
    private String puesto;
    private String jornada;

    // Constructor
    public Empleado(int id, String nombre, String fechaNacimiento, String puesto, String jornada) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.puesto = puesto;
        this.jornada = jornada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    // Método para imprimir los detalles del empleado
    public void imprimir() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Puesto: " + puesto);
        System.out.println("Jornada: " + jornada);
    }

    // Método para capturar información del empleado
    public void captura(int id, String nombre, String fechaNacimiento, String puesto, String jornada) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.puesto = puesto;
        this.jornada = jornada;
    }

    // Método para calcular el sueldo del empleado (implementación básica, puede ser modificada)
    public double sueldo() {
        // Implementación básica para calcular el sueldo
        // Aquí puedes agregar la lógica específica para calcular el sueldo del empleado
        return 0.0;
    }

    // Método para realizar una petición (implementación básica, puede ser modificada)
    public void peticion(String mensaje) {
        System.out.println("Empleado " + nombre + " realiza la siguiente petición: " + mensaje);
    }
}


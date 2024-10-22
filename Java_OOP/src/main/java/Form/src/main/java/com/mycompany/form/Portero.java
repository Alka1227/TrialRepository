package com.mycompany.form;

public class Portero extends Empleado {
    private double sueldoPorHora;
    private double sueldoExtra;
    private int horasJornada;

    public Portero(int id, String nombre, String fechaNacimiento) {
        super(id, nombre, fechaNacimiento, "Portero", "28 horas");
        this.sueldoPorHora = 90.0;
        this.sueldoExtra = 180.0;
        this.horasJornada = 28;
    }

    @Override
    public double sueldo() {
        return sueldoPorHora * horasJornada + sueldoExtra;
    }
}

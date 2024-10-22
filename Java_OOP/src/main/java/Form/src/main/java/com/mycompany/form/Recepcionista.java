package com.mycompany.form;

public class Recepcionista extends Empleado {
    private double sueldoPorHora;
    private double sueldoExtra;
    private int horasJornada;

    public Recepcionista(int id, String nombre, String fechaNacimiento) {
        super(id, nombre, fechaNacimiento, "Recepcionista", "48 horas");
        this.sueldoPorHora = 150.0;
        this.sueldoExtra = 300.0;
        this.horasJornada = 48;
    }

    @Override
    public double sueldo() {
        return sueldoPorHora * horasJornada + sueldoExtra;
    }
}

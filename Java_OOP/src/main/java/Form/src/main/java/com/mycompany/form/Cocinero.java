package com.mycompany.form;

public class Cocinero extends Empleado {
    private double sueldoPorHora;
    private double sueldoExtra;
    private int horasJornada;

    public Cocinero(int id, String nombre, String fechaNacimiento) {
        super(id, nombre, fechaNacimiento, "Cocinero", "48 horas");
        this.sueldoPorHora = 160.0;
        this.sueldoExtra = 320.0;
        this.horasJornada = 48;
    }

    @Override
    public double sueldo() {
        return sueldoPorHora * horasJornada + sueldoExtra;
    }
}


package com.mycompany.form;

public class Botones extends Empleado {
    private double sueldoPorHora;
    private int horasJornada;

    public Botones(int id, String nombre, String fechaNacimiento) {
        super(id, nombre, fechaNacimiento, "Botones", "48 horas");
        this.sueldoPorHora = 80.0;
        this.horasJornada = 48;
    }

    @Override
    public double sueldo() {
        return sueldoPorHora * horasJornada;
    }
}

package com.mycompany.form;

public class Mucama extends Empleado {
    private double sueldoPorHora;
    private double sueldoExtra;
    private int horasJornada;

    public Mucama(int id, String nombre, String fechaNacimiento) {
        super(id, nombre, fechaNacimiento, "Mucama", "36 horas");
        this.sueldoPorHora = 100.0;
        this.sueldoExtra = 200.0;
        this.horasJornada = 36;
    }

    @Override
    public double sueldo() {
        return sueldoPorHora * horasJornada + sueldoExtra;
    }
}
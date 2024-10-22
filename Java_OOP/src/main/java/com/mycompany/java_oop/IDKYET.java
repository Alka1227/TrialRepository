/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_oop;
import java.util.Scanner;
import com.mycompany.java_oop.IDKYET2;
/**
 *
 * @author javie
 */
public class IDKYET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //
    String Name;
    double Cant= 0;
    int Age= 0;
    Scanner ask = new Scanner(System.in);
    IDKYET2 Persona1 = new IDKYET2("Javier",200,18);
    Persona1.getdatos();
    IDKYET2 Persona2 = new IDKYET2();
    /*Persona2.setTitular("Octavio");
    Persona2.setCantidad(150);
    Persona2.setEdad(18);
    Persona2.getdatos();*/
        System.out.println("Preparandoce para añadir otra persona.....");
    System.out.println("Introduzca su nombre: ");
    Name = ask.next();
    Persona2.setTitular(Name);
    while(Cant<00.1){
    System.out.println("Introduzca la cantidad de dinero que tiene en su cuenta: (min de 00.1)");
    Cant = ask.nextInt();}
    Persona2.setCantidad(Cant);
    //
    while(Age<18){
    System.out.println("Introduzca su edad: (debe ser mayor de edad)");
    Age = ask.nextInt();}
    Persona2.setEdad(Age);
    System.out.println("------------------------------------------------------------------");
    System.out.println("Verificando datos.........");
    Persona2.getdatos();
    
    
    
    
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_oop;

/**
 *
 * @author javie
 */
public class IDKYET2 {
   // Atributos
   private String Titular;
   private double Cantidad;
   private int Edad;
   
   public IDKYET2(){}
   
   public IDKYET2(String A,double B,int C){
       Titular = A;
       Cantidad = B;
       Edad = C; 
   }
   
  
  
   public void setTitular(String Titular){
       this.Titular = Titular;
               
   }
   public void setCantidad(double Cantidad){
        this.Cantidad = Cantidad;} 
   
   public void setEdad(int Edad){
   this.Edad = Edad;}
   
   public void getdatos(){
    System.out.println("Nombre: "+Titular);
    System.out.println("Cantidad: "+"$"+Cantidad);
    System.out.println("Edad: "+Edad);
    System.out.println("--------------------------");
   }
   public void añadir(double Cantidad){
       
   }
   
            
} 


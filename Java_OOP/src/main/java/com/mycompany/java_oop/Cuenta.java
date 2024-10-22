/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_oop;

/**
 *
 * @author javie
 */
public class Cuenta {
   // Atributos
   private String Titular;
   public String Ncuenta;
   private double Tinteres;
   public double Saldo;
   
   public Cuenta(){} //constructor
   
   public Cuenta(String A,String B,double C,double D){
       Titular = A;
       Ncuenta = B;
       Tinteres = C;
       Saldo = D;
   }
   
  
  //Metodos
   public void setTitular(String Titular){
       this.Titular = Titular;
               
   }
   
   public void setNcuenta(String Ncuenta){
       this.Ncuenta = Ncuenta;
               
   }
   
   public void setSaldo(double Saldo){
        this.Saldo = Saldo;} 
   
   public void setTinteres(double Tinteres){
   this.Tinteres = Tinteres;}
   
   public void getSaldo(){
       System.out.println("Saldo disponible: "+Saldo);
    }
   public void getdatos(){ //imprime todos los datos
    System.out.println("Nombre: "+Titular);
    System.out.println("Número de cuenta: "+Ncuenta);
    System.out.println("Tipo de interes: "+Tinteres+"%");
    System.out.println("Saldo disponible: "+Saldo);
    System.out.println("--------------------------");
   }
   public void añadir(double Saldo){
       this.Saldo += Saldo;}
   
   public void restar(double Saldo){
       this.Saldo -= Saldo;}
   
   public void ingresar(double Saldo){
       this.Saldo += Saldo;
       System.out.println("Deposito exitoso");}
   }
    
   
  
            
 


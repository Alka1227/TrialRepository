/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_oop;
import java.util.Scanner;
import com.mycompany.java_oop.Cuenta;
/**
 *
 * @author javie
 */
public class Clase_Cuenta{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //
    //String Receive;
    String Send;
    String NCuenta;
    String Name;
    double Cant= 0;
    double interes= 0;
    int sw;
    double trans;
    double retirar;
    Scanner ask = new Scanner(System.in);
    Cuenta Persona1 = new Cuenta("Javier","27122004",18,200); //creo primer objeto con atributos pre asignados
    //Persona1.getdatos();
    Cuenta Persona2 = new Cuenta(); //crea el segundo objeto
    System.out.println("Preparandoce para añadir otra persona.....");
    System.out.println("Introduzca su nombre: "); //set nombre
    Name = ask.next();
    Persona2.setTitular(Name);
    System.out.println("Introduzca su número de cuenta: "); //set número de cuenta
    NCuenta = ask.next();
    Persona2.setNcuenta(NCuenta);
    while(Cant<00.01){
    System.out.println("Introduzca la cantidad de dinero que tiene en su cuenta: (min de 00.1)"); //set saldo
    Cant = ask.nextInt();}
    Persona2.setSaldo(Cant);
    //
    while(interes<00.01){
    System.out.println("Especifique su tipo de interes (min de 00.01: %"); //set tipo de interes
    interes = ask.nextDouble();
    Persona2.setTinteres(interes);
    Persona1.getdatos(); //imprime datos
    Persona2.getdatos();
    }
    System.out.println("Qué desea hacer?"); //menu sobre que operacion realizar
    System.out.println("1-Transferir");
    System.out.println("2-Retirar");
    System.out.println("3-Ingresar");
    System.out.println("4-Salir");
    sw = ask.nextInt();
    switch(sw){
        case 1:
            //transfiere una cantidad
            System.out.println("Escriba su número de cuenta: ");
            Send = ask.next();
            if (Send.equals(Persona2.Ncuenta)){ //compara números de cuenta
              System.out.println("Qué cantidad desea transferir?: ");
              trans = ask.nextDouble();
              if (Persona2.Saldo>trans){  //compara saldos para checar si hay suficiente
                Persona1.añadir(trans);
                Persona2.restar(trans);
                Persona2.getSaldo();}
              else{
                System.out.println("No cuenta con saldo suficiente"); 
              }
            Persona1.getdatos(); //input de saldos
            Persona2.getdatos();
            break;
            }
            else{
                System.out.println("Introduzca un número de cuenta válido"); 
            }
        case 2:
            System.out.println("Escriba su número de cuenta: "); //compa0ra numeros de cuenta para verificar
            Send = ask.next();
            if (Send.equals(Persona2.Ncuenta)){ //compara números de cuenta
              System.out.println("Qué cantidad desea retirar?: ");
              retirar = ask.nextDouble();
              if (Persona2.Saldo>retirar){  //checa si tienes suficiente saldo para retirar
                Persona2.restar(retirar); //retira dinero
                Persona2.getSaldo();}
              else{
                System.out.println("No cuenta con saldo suficiente"); 
              }
            //input de saldos
            Persona2.getdatos();
            break;
            }
            else{
                System.out.println("Introduzca un número de cuenta válido");
            }
            
        case 3:
            System.out.println("Escriba su número de cuenta: "); //compara numeros de cuenta para verificar
            Send = ask.next();
            if (Send.equals(Persona2.Ncuenta)){ //compara números de cuenta
              System.out.println("Qué cantidad desea ingresar?: ");
              trans = ask.nextDouble();
              Persona2.ingresar(trans); //retira dinero
              Persona2.getSaldo();
              break;
            }
            else{
                System.out.println("Introduzca un número de cuenta válido");
            }
        case 4:
            break;
                   
    }
    }
}



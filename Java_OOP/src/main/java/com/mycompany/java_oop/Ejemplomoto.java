/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_oop;
import com.mycompany.java_oop.Motocicleta;
/**
 *
 * @author javie
 */
public class Ejemplomoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Motocicleta Moto = new Motocicleta(); //SET
        Motocicleta Moto2 = new Motocicleta("Honda","Negro");
        Motocicleta Moto3 = new Motocicleta("Yamaha","Azul");
        Moto.setmarca("Harley Davidson");
        Moto.setcolor("Amarilla");
        System.out.println("Revisando estado...");
        Moto.mostrarvalores();
        System.out.println("--------");
        System.out.println("Encendiendo motor...");
        Moto.arranque();
        System.out.println("--------");
        System.out.println("Revisar estado...");
        Moto.mostrarvalores();
        System.out.println("--------");
        Moto.arranque();
        System.out.println("LA MOTO ES UNA "+ Moto.getmarca()+ " Y SU COLOR ES "+ Moto.getcolor() );
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");  
        
        System.out.println("Revisando estado...");
        Moto2.mostrarvalores();
        System.out.println("--------");
        System.out.println("Encendiendo motor...");
        Moto2.arranque();
        System.out.println("--------");
        System.out.println("Revisar estado...");
        Moto2.mostrarvalores();
        System.out.println("--------");
        Moto2.arranque();
        System.out.println("LA MOTO ES UNA "+ Moto2.getmarca()+ " Y SU COLOR ES "+ Moto2.getcolor() );
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");  
        
        System.out.println("Revisando estado...");
        Moto3.mostrarvalores();
        System.out.println("--------");
        System.out.println("Encendiendo motor...");
        Moto3.arranque();
        System.out.println("--------");
        System.out.println("Revisar estado...");
        Moto3.mostrarvalores();
        System.out.println("--------");
        Moto3.arranque();
        System.out.println("LA MOTO ES UNA "+ Moto3.getmarca()+ " Y SU COLOR ES "+ Moto3.getcolor() );
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Moto3.apagar();
        System.out.println("Revisar estado...");
        Moto3.mostrarvalores();
        System.out.println("--------");
        Moto3.arranque();
        System.out.println("--------");
        System.out.println("Revisar estado...");
        Moto3.mostrarvalores();
        Moto3.llenartanque();
        System.out.println("Revisar estado...");
        Moto3.mostrarvalores();
        System.out.println("--------");
        Moto3.vaciartanque();
        System.out.println("--------");
        System.out.println("Revisar estado...");
        Moto3.mostrarvalores();
    }
    
}

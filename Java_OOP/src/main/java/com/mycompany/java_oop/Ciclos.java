/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_oop;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ask = new Scanner(System.in);
        int A=0;
        while (A<18){
        System.out.println("Dame un número mayor a 18");
        A = ask.nextInt();}
        System.out.println("Gracias");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_oop;
import java.util.Scanner;

/**
 *
 * @author javier
 */
public class functions {
    
    /**
     * @param args the command line arguments
     */
    static int suma(int A, int B){
        return A+B;}
    static int resta(int A, int B){
        return A-B;}
    static int mult(int A, int B){
        return A*B;}
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ask = new Scanner(System.in);
        int a,b,c,d,e;
        System.out.println("Give me one number: ");
        a = ask.nextInt();
        System.out.println("Give me a second number: ");
        b = ask.nextInt();
        c = suma(a,b);
        d = resta(a,b);
        e = mult(a,b);
        System.out.println("Your results are: ");
        System.out.println(a+"+"+b+"="+c);
        System.out.println(a+"-"+b+"="+d);
        System.out.println(a+"*"+b+"="+e);
    }
    
}

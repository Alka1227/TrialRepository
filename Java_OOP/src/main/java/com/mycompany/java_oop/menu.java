/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_oop;
import java.util.Scanner;
/**
 *
 * @author javie
 */
public class menu {
public static void main(String[] args) {
    int op; 
    int a;
    int b;
    int c;    
    Scanner ask = new Scanner(System.in);
    System.out.println("MENU");
    System.out.println("1. Triangle");
    System.out.println("2. Square");
    System.out.println("3. Rectangle");
    System.out.println("4. Exit");
    op = ask.nextInt();
        switch(op)
        {
            case 1:
            System.out.println("Give me the first side");
            a = ask.nextInt();
            System.out.println("Give me the second side");
            b = ask.nextInt();
            c = (a*b)/2;
            System.out.println("the area of the triangle is "+c);
            
            break;
        
            case 2:
            System.out.println("Give me the size of the side");
            a = ask.nextInt();        
            c = (a*a);
            System.out.println("the area of the triangle is "+c);
            break;
            
            case 3:
            System.out.println("Give me the size of the first side");
            a = ask.nextInt();
            System.out.println("Give me the size of the second side");
            b = ask.nextInt();
            c = (a*b);
            System.out.println("the area of the triangle is "+c);
            break;
        }
}
}

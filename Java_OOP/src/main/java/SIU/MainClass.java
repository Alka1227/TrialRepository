/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SIU;
import java.util.ArrayList;
import SIU.Menu;
import java.util.Scanner;
/**
 *
 * @author javie
 */
import java.util.Scanner;
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Refrigerados> R = new ArrayList<Refrigerados>();
        ArrayList<Frescos> F = new ArrayList<Frescos>();
        ArrayList<Congelados> C = new ArrayList<Congelados>();
        Menu menu = new Menu();
        Scanner ask = new Scanner(System.in);
        Boolean A=true; 
        int i;
        int op;
        String nuevo;
        while(A==true){
        menu.menu();
        op = ask.nextInt();
        switch(op){
            case 1:
               
               Frescos producto1 = new Frescos();
               producto1.agregar();
               producto1.display();
               F.add(producto1);
               break;
               
            case 2:
               
               Refrigerados producto2 = new Refrigerados();
               producto2.agregar();
               producto2.display();
               R.add(producto2);
               break;
               
            case 3:
               Congelados producto3 = new Congelados();
               producto3.agregar();
               producto3.display();
               C.add(producto3);
               break;
            case 4:
                for (i=0;i<F.size();i++){
                F.get(i).display();}
                break;
                
            case 5:
                for (i=0;i<R.size();i++){
                R.get(i).display();}
                break;
            case 6:
                for (i=0;i<C.size();i++){
                C.get(i).display();}
                break;
                
            case 7:
               A=false;
                break; 
               
        }}
        
    }
    
}

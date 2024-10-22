/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIU;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Congelados extends Producto {
    String ans;
    Scanner ask = new Scanner(System.in);
    //Atributos específicos
    private String temperatura="";
    //Constructor
    public Congelados() {
        temperatura ="";
    }
    
    public Congelados(String FechaCAD, String Nlote, String temperatura) {
        super(FechaCAD, Nlote);
        this.temperatura = temperatura;
    }    
    
    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
    
    public void display() {
        System.out.println("/////////////////////////////////////////");
        System.out.println("Producto Congelado");
        System.out.println(getFechaCAD());
        System.out.println(getNlote());
        System.out.println(getTemperatura());
        System.out.println("/////////////////////////////////////////");
    }
    public void agregar(){
        System.out.println("//////////////////////////////");
        System.out.println("AÑADIENDO PRODUCTO...");
        System.out.println("Cuál es la fecha de caducidad? ");
        ans = ask.next(); 
        setFechaCAD("Fecha de caducidad: "+ans);
        System.out.println("Cuál es el número de lote? ");
        ans = ask.next(); 
        setNlote("Número de lote: "+ans);
        System.out.println("Cuál es la temperatura de congelación adecuada del producto? ");
        ans = ask.next(); 
        setTemperatura("Temperatura recomendada: "+ans);
        System.out.println("PRODUCTO AÑADIDO...");
    }
    
    
}

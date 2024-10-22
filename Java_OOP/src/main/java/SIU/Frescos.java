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
public class Frescos extends Producto {
    Scanner ask = new Scanner(System.in);
    //Atributos específicos
    String ans;
    private String fechaenvasado="";
    private String pais="";
    //Constructor

    public Frescos() {}
    public Frescos(String FechaCAD, String Nlote,String fechaenvasado, String pais) {
        super(FechaCAD, Nlote);
        this.fechaenvasado = fechaenvasado="";
        this.pais = pais="";
    }

    public String getFechaenvasado() {
        return fechaenvasado;
    }

    public String getPais() {
        return pais;
    }

    public void setFechaenvasado(String fechaenvasado) {
        this.fechaenvasado = fechaenvasado;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public void display() {
        System.out.println("/////////////////////////////////////////");
        System.out.println("Producto Fresco");
        System.out.println(getFechaCAD());
        System.out.println(getNlote());
        System.out.println(getFechaenvasado());
        System.out.println(getPais()); 
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
        System.out.println("Cuál es la fecha de envasado? ");
        ans = ask.next(); 
        setFechaenvasado("Fecha de envasado: "+ans);
        System.out.println("Cuál es el pais de origen? ");
        ans = ask.next(); 
        setPais("País de origen: "+ans);
        System.out.println("PRODUCTO AÑADIDO...");
    }
    
    
}

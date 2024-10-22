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
public class Refrigerados extends Producto {
    String ans;
    Scanner ask = new Scanner(System.in);
    //Atributos específicos
    private String codigo="";
    //Constructor

    public Refrigerados() {
        codigo ="";
    }
    public Refrigerados(String FechaCAD, String Nlote) {
        super(FechaCAD, Nlote);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void display() {
        System.out.println("/////////////////////////////////////////");
        System.out.println("Producto Refrigerado");
        System.out.println(getFechaCAD());
        System.out.println(getNlote());
        System.out.println(getCodigo());
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
        System.out.println("Cuál es el código del organismo de supervisión alimentaria? ");
        ans = ask.next(); 
        setCodigo("Codigo de organismo de supervisión alimentaria: "+ans);
        System.out.println("PRODUCTO AÑADIDO...");
    }
}

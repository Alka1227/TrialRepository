/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIU;
/**
 *
 * @author javie
 */
public class Producto {
  //Atibutos
   private String FechaCAD;
   private String Nlote;
  //métodos 
    public Producto() {
    }
    public Producto(String FechaCAD, String Nlote) {
        this.FechaCAD = FechaCAD;
        this.Nlote = Nlote;
    }

    public String getFechaCAD() {
        return FechaCAD;
    }

    public String getNlote() {
        return Nlote;
    }

    public void setFechaCAD(String FechaCAD) {
        this.FechaCAD = FechaCAD;
    }

    public void setNlote(String Nlote) {
        this.Nlote = Nlote;
    }
  
}

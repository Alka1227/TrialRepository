/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIU;
import javax.swing.JOptionPane;
/**
 *
 * @author javie
 */
public class Personaje {
    private String Nombre;
    private double PV;
    private double PD;
    private double PA;
    private double mana;
    

    public Personaje(String Nombre, double PV, double PD, double PA, double mana) {
        this.Nombre = Nombre;
        this.PV = PV;
        this.PD = PD;
        this.PA = PA;
        this.mana = mana;
        
    }
    public Personaje() {}

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public void setPD(int PD) {
        this.PD = PD;
    }

    public void setPA(int PA) {
        this.PA = PA;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getPV() {
        return PV;
    }

    public double getPD() {
        return PD;
    }

    public double getPA() {
        return PA;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
       
    
    
}

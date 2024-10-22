/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_oop;
/**
 *
 * @author javie
 */
public class Motocicleta {
    //Atributos
    private String m_Marca;
    private String m_Color;
    private boolean m_MotorEstado;
    private boolean m_MotorGas;
    
    public Motocicleta(){}//Constructor VACIO
    
    public Motocicleta(String N, String C){ //Contructor con PARAMETROS
        m_Marca = N;
        m_Color = C;
    }
    
    public Motocicleta(boolean B){
        m_MotorEstado = B;
    
    }
        
    //Metodos (comportamiemto)
    public void llenartanque(){
        if (m_MotorGas==true){
            System.out.println("La motocicleta ya tiene gasolina");
        }
        else{
            m_MotorGas=true;
            System.out.println("La motocicleta ahora tiene gasolina");
        }
    }
    public void vaciartanque(){
        if (m_MotorGas==false){
            System.out.println("La motocicleta no tiene gasolina");
        }
        else{
            m_MotorGas=false;
            System.out.println("se vacio el tanque de gasolina");
        }
    }
    //
    public void arranque(){
        if (m_MotorEstado==true){
            System.out.println("El motor esta encendido de la moto "+ m_Marca);
        }
        else{
            m_MotorEstado=true;
            System.out.println("Se acaba de encender la Moto "+ m_Marca);
        }
    }  
    
    public void mostrarvalores(){
        System.out.println("La motocicleta es una "+ m_Marca +" "+m_Color );
       if (m_MotorEstado==true){
           System.out.println("El motor esta encendido");
       }
       else{
           System.out.println("El motor esta apagado");
       }
       if (m_MotorGas==true){
           System.out.println("La moto tiene gasolina");
       }
       else{
           System.out.println("La moto no tiene gasolina");
       } 
    }
    
    public void apagar(){
        if (m_MotorEstado==false){
            System.out.println("El motor esta apagado de la Moto "+ m_Marca);
        }
        else{
            m_MotorEstado=false;
            System.out.println("Se acaba de apagar la Moto "+ m_Marca);
        }
    }
    
    public void setmarca(String marka){
        this.m_Marca = marka;
    }
    
    public void setcolor(String colr){
        this.m_Color=colr;
    }
    
    public String getmarca(){
        return(this.m_Marca);
    }
    
    public String getcolor(){
        return(this.m_Color);
    }
}
    


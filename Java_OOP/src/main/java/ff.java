/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author javie
 */
public class ff {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ask = new Scanner(System.in);
    int i;
    int num;
    int result;
    //int asw;
    System.out.println("Give me a number");
    num = ask.nextInt();
    while(num!=0){
        for(i=1;i<=10;i++)
        {
            result = num*i;
            System.out.println(num+"x"+i+"="+result);
            
        }// TODO code application logic here
    System.out.println("Give me a number (if you don't want another type 0)");
    num = ask.nextInt();    
    }
    }
}

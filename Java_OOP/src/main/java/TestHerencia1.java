/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author javie
 */
//Código de test 
public class TestHerencia1 {
public static void main (String [ ] Args) {
    //Scanner
    Scanner ask = new Scanner(System.in);
    //Variables
    boolean A = true;
    boolean B = true;
    boolean C = true;
    String Inter ="";
    int NInter;
    int a;
    int op=10;
    int po=10;
   //Objetos
   Profesor profesor1 = new Profesor ("Juan", "Hernández García", 33);
    profesor1.setIdProfesor("Prof 22-387-11");
   //
   Estudiante estudiante1 = new Estudiante("Alex","Pérez Cabrales",18);
    estudiante1.setBIS(Boolean.FALSE);
    estudiante1.setMatricula("2203150230");
    estudiante1.setCarrera("Ingieneria en software");
    estudiante1.setGrado(2);
    estudiante1.setGrupo("A");
   //
   Administ admin = new Administ ("Bruce","Wayne",46);
    admin.setIdAdmin("20774509");
    admin.setTitulo("Filántropo");
    admin.setPuesto("Secretario de Educación Pública");
    admin.setIdAdmin("20774509");
    admin.setTitulo("Filántropo");
    admin.setPuesto("Secretario de Educación Pública");
   // 
   while(A==true){ //INICIO WHILE
       System.out.println("//// MENU GENERAL ////");
       System.out.println("1. INFO ESTUDIANTE");
       System.out.println("2. INFO PROFESOR");
       System.out.println("3. INFO ADMINISTRATIVO");
       System.out.println("4. CORREGIR ESTUDIANTE");
       System.out.println("5. CORREGIR PROFESOR");
       System.out.println("6. CORREGIR ADMINISTRATIVO");
       System.out.println("7. SALIR");
       System.out.println("//////////////////////");
       op = ask.nextInt();
    ///////////SWITCH
   switch(op){
           case 1:   
            A = false;
            System.out.println("///////////////////////////////////////////////////////////////////////");
            estudiante1.mostrarNombreApellidosYCarnet();
            System.out.println("///////////////////////////////////////////////////////////////////////");
            System.out.println("1- Regresar");
            System.out.println("2- Salir");
            System.out.println("///////////////////////////////////////////////////////////////////////");
            a = ask.nextInt();
            if(a==1){
            A = true;}
            if(a>=2){
            A = false;}
            break;
            ////////////////////////////////
           case 2:
            A = false;
            System.out.println("///////////////////////////////////////////////////////////////////////");
            profesor1.mostrarNombreApellidosYCarnet();
            System.out.println("///////////////////////////////////////////////////////////////////////");
            System.out.println("1- Regresar");
            System.out.println("2- Salir");
            System.out.println("///////////////////////////////////////////////////////////////////////");
            a = ask.nextInt();
            if(a==1){
            A = true;}
            if(a>=2){
            A = false;}
            break;
            ///////////////////////////////////
           case 3:
            System.out.println("///////////////////////////////////////////////////////////////////////");
            admin.mostrarNombreApellidosYCarnet();
            System.out.println("///////////////////////////////////////////////////////////////////////");
            A = false;
            System.out.println("1- Regresar");
            System.out.println("2- Salir");
            System.out.println("///////////////////////////////////////////////////////////////////////");
            a = ask.nextInt();
            if(a==1){
            A = true;}
            if(a>=2){
            A = false;}
            break;
            ///////////////////////////////////
           case 4: //Segundo menu
            A=false;
            while(B==true){
            System.out.println("//// MENU ESTUDIANTE  ////");
            System.out.println("1. CORREGIR NOMBRE");
            System.out.println("2. CORREGIR APELLIDO");
            System.out.println("3. CORREGIR MATRÍCULA");
            System.out.println("4. CORREGIR GRADO");
            System.out.println("5. CORREGIR GRUPO");
            System.out.println("6. CORREGIR CARRERA");
            System.out.println("7. CORREGIR BIS");
            System.out.println("8. INSCRIBIR AL ESTUDIANTE");
            System.out.println("9. SALIR");
            System.out.println("//////////////////////");
            po = ask.nextInt();
            switch(po){
                case 1:
                 while(C==true){
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 System.out.println("¿Cuál quiere que sea el nuevo nombre? ");
                 Inter = ask.next();
                 estudiante1.setNombre(Inter);
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 estudiante1.mostrarNombreApellidosYCarnet();
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 B = false;
                 C = false;
                 System.out.println("1- Corregir otra vez");
                 System.out.println("2- Regresar");
                 System.out.println("3- Salir");
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 a = ask.nextInt();
                 if(a==1){
                 C = true;}
                 if(a==2){
                 B = true;}
                 if(a>=3){
                 B = true;}
                 break;}
                ///////////////////////////////////
                case 2:
                 while(C==true){
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 System.out.println("¿Cuál quiere que sea el nuevo apellido? ");
                 Inter = ask.next();
                 estudiante1.setApellidos(Inter);
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 estudiante1.mostrarNombreApellidosYCarnet();
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 B = false;
                 C = false;
                 System.out.println("1- Corregir otra vez");
                 System.out.println("2- Regresar");
                 System.out.println("3- Salir");
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 a = ask.nextInt();
                 if(a==1){
                 C = true;}
                 if(a==2){
                 B = true;}
                 if(a>=3){
                 B = true;}
                 break;}
                /////////////////////////////////
                case 3:
                 while(C==true){
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 System.out.println("¿Cuál quiere que sea la nueva matrícula? ");
                 Inter = ask.next();
                 estudiante1.setMatricula(Inter);
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 estudiante1.mostrarNombreApellidosYCarnet();
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 B = false;
                 C = false;
                 System.out.println("1- Corregir otra vez");
                 System.out.println("2- Regresar");
                 System.out.println("3- Salir");
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 a = ask.nextInt();
                 if(a==1){
                 C = true;}
                 if(a==2){
                 B = true;}
                 if(a>=3){
                 B = true;}
                 break;}
                 /////////////////////////////////////
                case 4:
                 while(C==true){
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 System.out.println("¿Cuál es el nuevo grado? ");
                 NInter = ask.nextInt();
                 estudiante1.setGrado(NInter);
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 estudiante1.mostrarNombreApellidosYCarnet();
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 B = false;
                 C = false;
                 System.out.println("1- Corregir otra vez");
                 System.out.println("2- Regresar");
                 System.out.println("3- Salir");
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 a = ask.nextInt();
                 if(a==1){
                 C = true;}
                 if(a==2){
                 B = true;}
                 if(a>=3){
                 B = true;}
                 break;}
                 //////////////////////////////////////////////
                case 5: 
                 while(C==true){
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 System.out.println("¿Cuál es el grupo corregido? ");
                 Inter = ask.next();
                 estudiante1.setGrupo(Inter);
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 estudiante1.mostrarNombreApellidosYCarnet();
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 B = false;
                 C = false;
                 System.out.println("1- Corregir otra vez");
                 System.out.println("2- Regresar");
                 System.out.println("3- Salir");
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 a = ask.nextInt();
                 if(a==1){
                 C = true;}
                 if(a==2){
                 B = true;}
                 if(a>=3){
                 B = true;}
                 break;}
                 //////////////////////////////////
                case 6:
                 while(C==true){
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 System.out.println("¿A qué carrera ss cambio? ");
                 Inter = ask.next();
                 estudiante1.setCarrera(Inter);
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 estudiante1.mostrarNombreApellidosYCarnet();
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 B = false;
                 C = false;
                 System.out.println("1- Corregir otra vez");
                 System.out.println("2- Regresar");
                 System.out.println("3- Salir");
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 a = ask.nextInt();
                 if(a==1){
                 C = true;}
                 if(a==2){
                 B = true;}
                 if(a>=3){
                 B = true;}
                 break;}
                //////////////////////////////////
                case 7:
                 while(C==true){
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 System.out.println("¿? ");
                 Inter = ask.next();
                 estudiante1.setMatricula(Inter);
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 estudiante1.mostrarNombreApellidosYCarnet();
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 B = false;
                 C = false;
                 System.out.println("1- Corregir otra vez");
                 System.out.println("2- Regresar");
                 System.out.println("3- Salir");
                 System.out.println("///////////////////////////////////////////////////////////////////////");
                 a = ask.nextInt();
                 if(a==1){
                 C = true;}
                 if(a==2){
                 B = true;}
                 if(a>=3){
                 B = true;}
                 break;}   
            }
            }
   }}
}}//Cierre de la clase
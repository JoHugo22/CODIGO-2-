
package com.mycompany.carros;

import java.util.Scanner;

public class Chofer extends Persona{
    public String placa;
    public String codigotaxi;
    
    public Chofer(String nombre, Integer edad,String placa,String codigotaxi){
            super(nombre, edad);
            this.placa= placa;
            this.codigotaxi= codigotaxi;
    }
    
    public Chofer(){};
    
    public void cedula(){
   Scanner entrada= new Scanner(System.in);
       int cedula;
       
       System.out.print("Digite la cedula  ");
       cedula= entrada.nextInt();
       if (cedula>=0) {
       System.out.println("El numero de cedula es  " +cedula );
       }
       else{
           if(cedula<0){
               System.out.println("El numero de cedula es error" );
           }
       }
    }
    
    public void aceptarcarrera(){
    System.out.println("El Chofer acepto la carrera");
    }
    
    public void cancelarcarrera(){
    System.out.println("El chofer cancelo la carrera");
    }
    
    public void placa(){
    Scanner entrada= new Scanner(System.in);
       String placa;
       
       System.out.print("Digite la placa del taxi ");
       placa= entrada.next();
       
       System.out.println("El numero de placa es  " +placa );
    
    }
}

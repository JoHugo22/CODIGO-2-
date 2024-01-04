
package com.mycompany.carros;

import java.util.Scanner;

public class Pasajero extends Persona{
    public Integer id;
    public Pasajero(String nombre, Integer edad,Integer id){
            super(nombre, edad);
            this.id= id;
    }
    
    public Pasajero(){};
    
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
    
    public void pedirtaxi(){
    System.out.println("El pasajero esta pidiendo un taxi");
    }
    
    public void cancelartaxi(){
    System.out.println("El pasajero esta cancelando al taxi");
    }
    
    
    


}
    
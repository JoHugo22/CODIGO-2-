
package com.mycompany.carros;
import java.util.Scanner;


public class Carros {

    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
       String nombre;
       
       System.out.print("Digite el nombre del pasajero  ");
       nombre= entrada.next();
       
       System.out.println("El nombre del pasajero es  " +nombre );
       
       Pasajero id= new Pasajero();
       id.cancelartaxi();
       id.cedula();
       
       Scanner entradas= new Scanner(System.in);
       String nombre2;
       
       System.out.print("Digite el nombre del Chofer  ");
       nombre2= entradas.next();
       
       System.out.println("El nombre del Chofer es  " +nombre2 );
       Chofer placa= new Chofer();
       placa.aceptarcarrera();
       placa.cedula();
       placa.placa();
       
    }
}


package com.mycompany.codigo2;

import java.util.Scanner;

public class Codigo2 {

    public static void main(String[] args) {
       Scanner entrada6= new Scanner(System.in);
       String nombre;
       
       System.out.print("Digite el nombre del perro ");
       nombre= entrada6.next();
       
       System.out.println("El nombre del perro es  " +nombre );
       
       Perro raza= new Perro();
       raza.jugando();
       raza.corriendo();
       raza.hacerruido();
       raza.raza();
       
       Scanner entrada7= new Scanner(System.in);
       String nombreg;
       
       System.out.print("Digite el nombre del gato ");
       nombreg= entrada7.next();
       
       System.out.println("El nombre del gato es  " +nombreg );
       
       Gato colordepelo= new Gato();
       colordepelo.hacerruido();
       colordepelo.trepaarboles();
       colordepelo.cazarratones();
       
  
    }
    
    
   
    
}

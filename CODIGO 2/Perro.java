
package com.mycompany.codigo2;

import java.util.Scanner;


public class Perro extends Animales{
    public String raza;
    
    public Perro(String nombre,String raza){
    super(nombre);
    this.raza= raza;
    }
    
    public Perro(){};
    
    public void hacerruido(){
    System.out.println("El perro esta ladrando");
    }
    
    public void jugando(){
    System.out.println("El perro esta jungando");
    }
    
    public void corriendo(){
    Scanner entrada4= new Scanner(System.in);
       String corriendo;
       
       System.out.print("Indique el perro que esta haciendo ");
       corriendo= entrada4.next();
       
       System.out.println("El perro " +corriendo+ " esta corriendo por la casa ");
    }
    
    public void raza(){
    Scanner entrada5= new Scanner(System.in);
       String raza;
       
       System.out.print("Indique la raza del perro ");
       raza= entrada5.next();
       
       System.out.println("El perro es de raza  " +raza);
    
    }
    
}

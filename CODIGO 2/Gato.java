
package com.mycompany.codigo2;

import java.util.Scanner;

public class Gato extends Animales{
    public String colordepelo;
    
    public Gato(String nombre,String colordepelo){
    super(nombre);
    this.colordepelo=colordepelo;
    }
    
    public Gato(){};
    
    public void hacerruido(){
    System.out.println("El gato dice miau");
    }
    
    public void trepaarboles(){
    System.out.println("El gato esta trepando arboles");
    }
    
    public void cazarratones(){
    Scanner entrada3= new Scanner(System.in);
       String cazarratones;
       
       System.out.print("Indique el gato esta cazando ratones ");
       cazarratones= entrada3.next();
       
       System.out.println("El gato " +cazarratones+ " esta cazando ratones ");
    }
    
}

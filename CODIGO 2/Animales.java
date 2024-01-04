
package com.mycompany.codigo2;

abstract public class Animales {
    public String nombre;
    private Integer edad;
    
    public Animales(String nombre){
       this.nombre=nombre;
    } 
    
    public Animales(){};
    
    public Integer getedad(){
      return edad;
    }
    
    public void setedad(Integer edad){
    this.edad= edad;
    }
    
      abstract public void hacerruido();
    
}


package com.mycompany.carros;

abstract public class Persona {
    public String nombre;
    public Integer edad;
    private Integer cedula;
    
    public Persona(String nombre,Integer edad) {
        this.nombre= nombre;
        this.edad= edad;
    }
    
    public Persona(){};

    public Integer getcedula(){
       return cedula;
       
    }
    public void setcedula(Integer cedula){
       this.cedula= cedula;
       
    }
    
    abstract public void cedula();
}

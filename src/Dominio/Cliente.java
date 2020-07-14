/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author ammy
 */
public class Cliente {
    private String nombre;
    private String apellido;
    
    public Cliente(){
        
    }
    public Cliente(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
    
    public String getNombre(){
      return nombre;
  }  
  
     public void setNombre(String nombre){
         
     }
     
     public String gatApellido(){
        return apellido; 
     }
    
     public void setApellido(String apellido){
         
     }
     
     public String toString(){
         return "cliente: "+this.getNombre()+" "+this.apellido;
     }
}

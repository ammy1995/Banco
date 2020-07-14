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
public class Empleado {
    
    protected String nombre;
    protected double salario;
    
    public Empleado(){
        
    }
    
    public Empleado(String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
    }

    
    /*
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
       
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        
    }
    */
    
    public String toString(){
        return "Nombre" +nombre+ '\n'+"Salario: "+salario;
    }
}

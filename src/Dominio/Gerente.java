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
public class Gerente extends Empleado {
    
    private String departamento;
    
    public Gerente(String nombre, double salario, String departamento){
        this.nombre=nombre;
        this.salario=salario;
        this.departamento=departamento;
    }
    
    public Gerente(){
        
    }

    /*public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }*/
    
    /*public String toString(){
        return "Nombre: " +nombre+ '\n'+"Salario: "+salario+ '\n'+ "departamento: "+ departamento;
    }*/
}

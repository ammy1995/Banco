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
public class TestHerencia {
    
    public static void main(String[] args) {
       
        Empleado emp = new Empleado("Juan",1500);
        Gerente ger = new Gerente("Pedro", 1800, "ventas");
        
        System.out.println(emp.toString());
        System.out.println(ger.toString());
    }
}

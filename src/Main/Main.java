package Main;

import Dominio.Banco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ammy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco banco = new Banco();
        banco.setNombre("Banco Universitario");
        System.out.println("Numero de Clientes: "+ banco.getNumCLientes());
        banco.nuevoClientes("Juan", "Perez");
        System.out.println("Numero de Clientes: "+ banco.getNumCLientes());
        
        System.out.println(banco.getClientes(0));
        System.out.println(banco.imprimirClientes());
        banco.nuevoClientes("Juan", "Perez");
    }
    
}

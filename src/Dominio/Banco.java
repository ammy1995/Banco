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
public class Banco {
    
    private String nombre;
    private Cliente[] clientes;
    private int numClientes;
    
    public Banco(){
        clientes= new Cliente[3];
        numClientes =0;
    }
    
    public Banco(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
      return nombre;
    }  
  
    public void setNombre(String nombre){
      
    }
  
    public void  nuevoClientes(String nombre, String apellido){
    int i= numClientes ++;
    Cliente[] masClientes = clientes;
    if(numClientes>clientes.length){
        clientes = new Cliente [numClientes];
        System.arraycopy(masClientes, 0, clientes, 0, masClientes.length);
    }
    clientes[i]= new Cliente(nombre, apellido);
    }
    
    public int getNumCLientes(){
        return numClientes;
    }
    
    public Cliente getClientes(int posicion){
        return clientes[posicion];
    }
    public String imprimirClientes(){
        String texto=" ";
        for(Cliente cli:this.clientes){
            texto+=cli.toString()+'\n';
        } 
        return texto;
    }
}

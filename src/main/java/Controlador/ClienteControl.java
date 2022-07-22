/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Servicio.ClienteServicio;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Gus-Gus
 */
public class ClienteControl {
    
    private static ClienteServicio clienteServicio;
    
    public ClienteControl() throws IOException
    {
        clienteServicio = new ClienteServicio();
    }
    
    public Cliente crearCliente(String [] args)throws RuntimeException{
        Cliente cliente = new Cliente(this.convertirEntero(args[0]), args [1], args[2], args[3], this.convertirEntero(args[4]), args[5]);
        this.clienteServicio.crear(cliente);
        return cliente;
    }
    
    public Cliente buscarCliente(String arg){
        return this.clienteServicio.buscarPorCedula(convertirEntero(arg));
    }
    
    public Cliente eliminar(String arg) throws IOException{
        return this.clienteServicio.eliminar(convertirEntero(arg));
    }
    public Cliente modificar(String []args) throws IOException{
        Cliente clienteNuevo = new Cliente(Integer.valueOf(args[0]), args [1], args[2], args[3], Integer.valueOf(args[4]), args[5]);
        this.clienteServicio.modificar(convertirEntero(args[0]), clienteNuevo);
        return clienteNuevo;
    }
    public List<Cliente> listar() throws IOException{
        return this.clienteServicio.listar();
    }
    private int convertirEntero(String numero){
        try{
            return Integer.valueOf(numero);
        }catch(NumberFormatException e){
            throw new RuntimeException("el campo ingresado solamente recibe "+"numeros");
        }catch(Exception e){
            throw new RuntimeException("error inesperado");
        }
    }
}

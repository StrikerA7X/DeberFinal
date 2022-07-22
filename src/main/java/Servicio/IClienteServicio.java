/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Cliente;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Gus-Gus
 */
public interface IClienteServicio {
    
    public Cliente crear(Cliente cliente);
    public Cliente modificar(long numCedulaNuevo, Cliente clienteNuevo) throws IOException;
    public Cliente eliminar(int codigoCliente) throws IOException;
    public Cliente buscarPorCedula(long numCedula);
    public Cliente buscarPorCodigo(long codigo);
    public int buscarPosicion(Cliente cliente);
    public List<Cliente> listar() throws IOException;
    public int count() ;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Factura;
import Modelo.Producto;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Gus-Gus
 */
public interface IFacturaServicio {
    
    public Factura crear(Factura factura);
  
    public Factura eliminar(int nuevoFactura);
    public Factura buscarNFactura(int nuevoFactura);
    public int buscarPosicion(Factura factura);
    public List<Factura> listar() throws IOException;
     public Factura modificar(int numeroNuevo, Factura facturaNuevo) throws IOException;
    
}

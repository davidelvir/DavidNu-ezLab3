/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davidnuñez_lab3;

import java.util.Date;

/**
 *
 * @author David
 */
public class Venta {
    private Carro carro;
    private Cliente cliente;
    private Empleado empleado;
    private int precio;
    private Date fecha;

    public Venta() {
    }

    public Venta(Carro carro, Cliente cliente, Empleado empleado, int precio, Date fecha) {
        this.carro = carro;
        this.cliente = cliente;
        this.empleado = empleado;
        this.precio = precio;
        this.fecha = fecha;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta{" + "carro=" + carro + ", cliente=" + cliente + ", empleado=" + empleado + ", precio=" + precio + ", fecha=" + fecha + '}';
    }
    
    
    
    
}

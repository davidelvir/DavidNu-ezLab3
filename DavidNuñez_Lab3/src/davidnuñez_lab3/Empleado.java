/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davidnuñez_lab3;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Empleado extends Persona {
    
    private int horas;
    private ArrayList<Cliente> cliente = new ArrayList();

    public Empleado() {
    }

    public Empleado(int horas, String nombre, String identidad, int edad, double altura, int peso) {
        super(nombre, identidad, edad, altura, peso);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Empleado{" + "horas=" + horas + ", cliente=" + cliente + '}';
    }
    
    public boolean Venta(Cliente cliente, Carro carro){
        if(cliente.getDinero() >= carro.getPrecio()){
            return true;
        }else{
            return false;
        }
    }
}

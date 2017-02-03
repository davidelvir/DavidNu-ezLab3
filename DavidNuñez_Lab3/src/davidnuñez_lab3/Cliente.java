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
public class Cliente extends Persona{
    
    private int dinero;
    private ArrayList<Carro> carros = new ArrayList();

    public Cliente() {
    }

    public Cliente(int dinero, String nombre, String identidad, int edad, double altura, int peso) {
        super(nombre, identidad, edad, altura, peso);
        this.dinero = dinero;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dinero=" + dinero + ", carros=" + carros + '}';
    }
    
    
}

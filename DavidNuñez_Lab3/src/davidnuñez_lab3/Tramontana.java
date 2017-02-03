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
public class Tramontana extends Carro{
    private int peso;
    private int transmision;

    public Tramontana() {
    }

    public Tramontana(int peso, int transmision, String Serie, Date fecha, String llantas, boolean polarizado, int velocidad, int kilomentros, int precio) {
        super(Serie, fecha, llantas, polarizado, velocidad, kilomentros, precio);
        this.peso = peso;
        this.transmision = transmision;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTransmision() {
        return transmision;
    }

    public void setTransmision(int transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return "Tramontana{" + "peso=" + peso + ", transmision=" + transmision + '}';
    }
    
    
}

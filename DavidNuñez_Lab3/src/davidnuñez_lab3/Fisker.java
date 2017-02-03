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
public class Fisker extends Carro{
    private String modelo;
    private boolean convertible;

    public Fisker() {
    }

    public Fisker(String modelo, boolean convertible, String Serie, Date fecha, String llantas, boolean polarizado, int velocidad, int kilomentros, int precio) {
        super(Serie, fecha, llantas, polarizado, velocidad, kilomentros, precio);
        this.modelo = modelo;
        this.convertible = convertible;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    @Override
    public String toString() {
        return super.toString()+"Fisker{" + "modelo=" + modelo + ", convertible=" + convertible + '}';
    }
    
    
}

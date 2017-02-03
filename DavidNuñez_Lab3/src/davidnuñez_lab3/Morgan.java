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
public class Morgan extends Carro{
    private boolean convertible;
    private String cabina;

    public Morgan(boolean convertible, String cabina, String Serie, Date fecha, String llantas, boolean polarizado, int velocidad, int kilomentros, int precio) {
        super(Serie, fecha, llantas, polarizado, velocidad, kilomentros, precio);
        this.convertible = convertible;
        this.cabina = cabina;
    }

    public Morgan() {
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getCabina() {
        return cabina;
    }

    public void setCabina(String cabina) {
        this.cabina = cabina;
    }

    @Override
    public String toString() {
        return "Morgan{" + "convertible=" + convertible + ", cabina=" + cabina + '}';
    }
    
}

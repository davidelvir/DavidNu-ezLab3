/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davidnuñez_lab3;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author David
 */
public class Maybach extends Carro{
    private int repuestos;

    public Maybach() {
    }

    public Maybach(int repuestos, String Serie, Date fecha, String llantas, boolean polarizado, int velocidad, int kilomentros, int precio) {
        super(Serie, fecha, llantas, polarizado, velocidad, kilomentros, precio);
        this.repuestos = repuestos;
    }

    public int getRepuestos() {
        return repuestos;
    }

    public void setRepuestos(int repuestos) {
        if(repuestos <= 2 && repuestos >=1){
        this.repuestos = repuestos;
        }
    }


    @Override
    public String toString() {
        return super.toString()+"Maybach{" + "repuestos=" + repuestos + '}';
    }

    
    
    
}

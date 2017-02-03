
package davidnuñez_lab3;

import java.awt.Color;
import java.util.Date;


public class Carro {
    
    private String Serie;
    private Date fecha;
    private Color color;
    private String llantas;
    private boolean polarizado;
    protected int velocidad;
    protected int kilomentros;
    protected int precio;

    public Carro(String Serie, Date fecha, String llantas, boolean polarizado, int velocidad, int kilomentros, int precio) {
        this.Serie = Serie;
        this.fecha = fecha;
        this.llantas = llantas;
        this.polarizado = polarizado;
        this.velocidad = velocidad;
        this.kilomentros = kilomentros;
        this.precio = precio;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public boolean isPolarizado() {
        return polarizado;
    }

    public void setPolarizado(boolean polarizado) {
        this.polarizado = polarizado;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getKilomentros() {
        return kilomentros;
    }

    public void setKilomentros(int kilomentros) {
        this.kilomentros = kilomentros;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Carro{" + "Serie=" + Serie + ", fecha=" + fecha + ", color=" + color + ", llantas=" + llantas + ", polarizado=" + polarizado + ", velocidad=" + velocidad + ", kilomentros=" + kilomentros + ", precio=" + precio + '}';
    }
    
    
    
}

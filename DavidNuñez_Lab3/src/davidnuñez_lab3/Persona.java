/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davidnuñez_lab3;

/**
 *
 * @author David
 */
public class Persona {
    
    private String nombre;
    private String identidad;
    private int edad;
    private double altura;
    private int peso;

    public Persona() {
    }

    public Persona(String nombre, String identidad, int edad, double altura, int peso) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", identidad=" + identidad + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    
    
}

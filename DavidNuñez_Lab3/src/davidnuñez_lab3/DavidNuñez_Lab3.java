/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davidnuñez_lab3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class DavidNuñez_Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        ArrayList<Carro> carros = new ArrayList();
        ArrayList<Empleado>empleados = new ArrayList();
        ArrayList<Cliente>clientes = new ArrayList();
        Scanner sc = new Scanner(System.in);
        char op = 't';
        while(op == 't'){
            System.out.println("1. Agregar\n"
                    + "2. Modificar\n"
                    + "3. Eliminar\n"
                    + "4. Venta");
            int x = sc.nextInt();
            switch(x){
                case 1:
                    System.out.println("1. Carro\n"
                            + "2. Empleado\n"
                            + "3. Cliente");
                    int y = sc.nextInt();
                    switch(y){
                        case 1:
                            System.out.println("1. Maybach\n"
                                    + "2. Morgan\n"
                                    + "3. Fisker\n"
                                    + "4. Tramontana");
                            int carro = sc.nextInt();
                            switch(carro){
                                case 1:
                                    System.out.println("Ingrese numero de serie: ");
                                    String serie = sc.next();
                                    System.out.println("Ingrese marca de llantas");
                                    String llantas = sc.next();
                                    System.out.println("Es polatizado ? (s/n)");
                                    char pol = sc.next().charAt(0);
                                    boolean polarizado;
                                    if(pol == 's'){
                                        polarizado = true;
                                    }else{
                                        polarizado = false;
                                    }
                                    System.out.println("Ingrese la velocidad maxima(155 - 160): ");
                                    int velocidad = sc.nextInt();
                                    while(velocidad < 155 || velocidad > 160){
                                        System.out.println("Velocidad fuera del rango, ingresela de nuevo: ");
                                        velocidad = sc.nextInt();
                                    }
                                    System.out.println("Ingrese kilometros por galon(50 - 55): ");
                                    int km = sc.nextInt();
                                    while(km > 55 || km < 50){
                                        System.out.println("Valor ingresado mal, ingreselo de nuevo: ");
                                        km = sc.nextInt();
                                    }
                                    System.out.println("Ingrese el precio del carro ( 400,000 - 600,000):");
                                    int precio = sc.nextInt();
                                    while(precio < 400000 || precio > 600000){
                                        System.out.println("Precio fuera del rango, ingeselo de nuevo: ");
                                        precio = sc.nextInt();
                                }
                            }
                    }
            }
        }
        
    }
    
}

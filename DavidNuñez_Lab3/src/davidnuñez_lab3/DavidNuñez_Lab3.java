/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davidnuñez_lab3;


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
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList();
        ArrayList<Empleado>empleados = new ArrayList();
        ArrayList<Cliente>clientes = new ArrayList();
        ArrayList<Venta> ventas = new ArrayList();
        Scanner sc = new Scanner(System.in);
        char op = 't';
        while(op == 't'){
            System.out.println("1. Agregar\n"
                    + "2. Modificar\n"
                    + "3. Eliminar\n"
                    + "4. Venta\n"
                    + "5. Reporte de ventas\n"
                    + "6. Salir");
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
                                    System.out.println("Ingrese llantas de repuesto vendidas(2-1)");
                                    int repuesto = sc.nextInt();
                                    while (repuesto <1 || repuesto > 2){
                                        System.out.println("Ingrese valor de nuevo");
                                        repuesto = sc.nextInt();
                                    }
                                    carros.add(new Maybach(repuesto,serie,new Date(),llantas,polarizado,velocidad,km,precio));
                                break;
                                case 2:
                                    System.out.println("Ingrese numero de serie: ");
                                    serie = sc.next();
                                    System.out.println("Ingrese marca de llantas");
                                    llantas = sc.next();
                                    System.out.println("Es polatizado ? (s/n)");
                                    pol = sc.next().charAt(0);
                                    if(pol == 's'){
                                        polarizado = true;
                                    }else{
                                        polarizado = false;
                                    }
                                    System.out.println("Ingrese la velocidad maxima(140 - 145): ");
                                    velocidad = sc.nextInt();
                                    while(velocidad < 140 || velocidad > 145){
                                        System.out.println("Velocidad fuera del rango, ingresela de nuevo: ");
                                        velocidad = sc.nextInt();
                                    }
                                    System.out.println("Ingrese kilometros por galon(35 - 40): ");
                                    km = sc.nextInt();
                                    while(km < 35 || km > 40){
                                        System.out.println("Valor ingresado mal, ingreselo de nuevo: ");
                                        km = sc.nextInt();
                                    }
                                    System.out.println("Ingrese el precio del carro ( 500,000 - 700,000):");
                                    precio = sc.nextInt();
                                    while(precio < 500000 || precio > 700000){
                                        System.out.println("Precio fuera del rango, ingeselo de nuevo: ");
                                        precio = sc.nextInt();
                                    }
                                    System.out.println("Es convertible ? (s/n)");
                                    char con = sc.next().charAt(0);
                                    boolean convertible;
                                    if(con == 's'){
                                        convertible = true;
                                    }else{
                                        convertible = false;
                                    }
                                    System.out.println("Ingrese tipo de cabina(unica/doble)");
                                    String cabina = sc.next();
                                    carros.add(new Morgan(convertible,cabina,serie,new Date(),llantas,polarizado,velocidad,km,precio));
                                    break;
                                case 3:
                                    System.out.println("Ingrese numero de serie: ");
                                    serie = sc.next();
                                    System.out.println("Ingrese marca de llantas");
                                    llantas = sc.next();
                                    System.out.println("Es polatizado ? (s/n)");
                                    pol = sc.next().charAt(0);
                                    if(pol == 's'){
                                        polarizado = true;
                                    }else{
                                        polarizado = false;
                                    }
                                    System.out.println("Ingrese la velocidad maxima(160 - 165): ");
                                    velocidad = sc.nextInt();
                                    while(velocidad < 160 || velocidad > 165){
                                        System.out.println("Velocidad fuera del rango, ingresela de nuevo: ");
                                        velocidad = sc.nextInt();
                                    }
                                    System.out.println("Ingrese kilometros por galon(55 - 60): ");
                                    km = sc.nextInt();
                                    while(km < 55 || km > 60){
                                        System.out.println("Valor ingresado mal, ingreselo de nuevo: ");
                                        km = sc.nextInt();
                                    }
                                    System.out.println("Ingrese el precio del carro ( 450,000 - 650,000):");
                                    precio = sc.nextInt();
                                    while(precio < 450000 || precio > 650000){
                                        System.out.println("Precio fuera del rango, ingeselo de nuevo: ");
                                        precio = sc.nextInt();
                                    }
                                    System.out.println("Es camiioneta o turismo: ");
                                    String tipo = sc.next();
                                    System.out.println("Es convertible ? (s/n)");
                                    con = sc.next().charAt(0);
                                    if(con == 's'){
                                        convertible = true;
                                    }else{
                                        convertible = false;
                                    }
                                    carros.add(new Fisker(tipo,convertible,serie,new Date(),llantas,polarizado,velocidad,km,precio));
                                    break;
                                case 4:
                                    System.out.println("Ingrese numero de serie: ");
                                    serie = sc.next();
                                    System.out.println("Ingrese marca de llantas");
                                    llantas = sc.next();
                                    System.out.println("Es polatizado ? (s/n)");
                                    pol = sc.next().charAt(0);
                                    if(pol == 's'){
                                        polarizado = true;
                                    }else{
                                        polarizado = false;
                                    }
                                    System.out.println("Ingrese la velocidad maxima(175 - 180): ");
                                    velocidad = sc.nextInt();
                                    while(velocidad < 175 || velocidad > 180){
                                        System.out.println("Velocidad fuera del rango, ingresela de nuevo: ");
                                        velocidad = sc.nextInt();
                                    }
                                    System.out.println("Ingrese kilometros por galon(50 - 55): ");
                                    km = sc.nextInt();
                                    while(km < 50 || km > 55){
                                        System.out.println("Valor ingresado mal, ingreselo de nuevo: ");
                                        km = sc.nextInt();
                                    }
                                    System.out.println("Ingrese el precio del carro ( 800,000 - 1,000,000):");
                                    precio = sc.nextInt();
                                    while(precio < 800000 || precio > 1000000){
                                        System.out.println("Precio fuera del rango, ingeselo de nuevo: ");
                                        precio = sc.nextInt();
                                    }
                                    System.out.println("Ingrese le peso: (1276 - 1376)");
                                    int peso = sc.nextInt();
                                    while(peso < 1276 || peso >1376){
                                        System.out.println("peso fuera de rango, ingreselo otra vez");
                                        peso = sc.nextInt();
                                    }
                                    System.out.println("Ingrese el tipo de transmision(6/7)");
                                    int trans = sc.nextInt();
                                    while(trans < 6 || trans >7){
                                        System.out.println("Numero equivocado, ingrese otro");
                                        trans = sc.nextInt();
                                    }
                                    carros.add(new Tramontana(peso,trans,serie,new Date(),llantas,polarizado,velocidad,km,precio));
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese primer nombre: ");
                            String nombre = sc.next();
                            System.out.println("Ingrese identidad: ");
                            String id = sc.next();
                            System.out.println("Ingrese la edad: ");
                            int edad = sc.nextInt();
                            while(edad < 18){
                                System.out.println("debe ser mayor de 18, ingrese otra edad");
                                edad = sc.nextInt();
                            }
                            System.out.println("Ingrese el peso: ");
                            int peso = sc.nextInt();
                            System.out.println("Ingrese la altura: ");
                            double altura = sc.nextDouble();
                            while(altura < 1.55){
                                System.out.println("Debe ser mayor de 1.55");
                                altura = sc.nextDouble();
                            }
                            System.out.println("Ingrese horas de trabajo: ");
                            int horas = sc.nextInt();
                            empleados.add(new Empleado(horas,nombre,id,edad,altura,peso));
                            break;
                        case 3:
                            System.out.println("Ingrese primer nombre: ");
                            nombre = sc.next();
                            System.out.println("Ingrese identidad: ");
                            id = sc.next();
                            System.out.println("Ingrese la edad: ");
                            edad = sc.nextInt();
                            while(edad < 18){
                                System.out.println("debe ser mayor de 18, ingrese otra edad");
                                edad = sc.nextInt();
                            }
                            System.out.println("Ingrese el peso: ");
                            peso = sc.nextInt();
                            System.out.println("Ingrese la altura: ");
                            altura = sc.nextDouble();
                            while(altura < 1.55){
                                System.out.println("Debe ser mayor de 1.55");
                                altura = sc.nextDouble();
                            }
                            System.out.println("Ingrese el dinero que tiene: ");
                            int dinero = sc.nextInt();
                            clientes.add(new Cliente(dinero,nombre,id,edad,altura,peso));
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1. Maybach\n"
                            + "2. Morgan\n"
                            + "3. Fisker\n"
                            + "4. Tramontana\n"
                            + "5. Cliente\n"
                            + "6. Empleado");
                    int z = sc.nextInt();
                    switch(z){
                        case 1:
                            System.out.println("Elija el carro a modificar: ");
                            for(Carro tem : carros){
                                if(tem instanceof Maybach){
                                    System.out.println(carros.indexOf(tem)+": "+tem);
                                }
                            }
                            int May = sc.nextInt();
                            carros.get(May);
                            System.out.println("Ingrese numero de serie: ");
                                    String serie = sc.next();
                                    carros.get(May).setSerie(serie);
                                    System.out.println("Ingrese marca de llantas");
                                    String llantas = sc.next();
                                    carros.get(May).setLlantas(llantas);
                                    System.out.println("Es polatizado ? (s/n)");
                                    char pol = sc.next().charAt(0);
                                    boolean polarizado;
                                    if(pol == 's'){
                                        polarizado = true;
                                    }else{
                                        polarizado = false;
                                    }
                                    carros.get(May).setPolarizado(polarizado);
                                    System.out.println("Ingrese la velocidad maxima(155 - 160): ");
                                    int velocidad = sc.nextInt();
                                    carros.get(May).setVelocidad(velocidad);
                                    while(velocidad < 155 || velocidad > 160){
                                        System.out.println("Velocidad fuera del rango, ingresela de nuevo: ");
                                        velocidad = sc.nextInt();
                                        carros.get(May).setVelocidad(velocidad);
                                    }
                                    System.out.println("Ingrese kilometros por galon(50 - 55): ");
                                    int km = sc.nextInt();
                                    carros.get(May).setKilomentros(km);
                                    while(km > 55 || km < 50){
                                        System.out.println("Valor ingresado mal, ingreselo de nuevo: ");
                                        km = sc.nextInt();
                                        carros.get(May).getKilomentros();
                                    }
                                    System.out.println("Ingrese el precio del carro ( 400,000 - 600,000):");
                                    int precio = sc.nextInt();
                                    carros.get(May).setPrecio(precio);
                                    while(precio < 400000 || precio > 600000){
                                        System.out.println("Precio fuera del rango, ingeselo de nuevo: ");
                                        precio = sc.nextInt();
                                        carros.get(May).getPrecio();
                                    }
                                    System.out.println("Ingrese llantas de repuesto vendidas(2-1)");
                                    int repuesto = sc.nextInt();
                                    ((Maybach)carros.get(May)).setRepuestos(repuesto);
                                    while (repuesto <1 || repuesto > 2){
                                        System.out.println("Ingrese valor de nuevo");
                                        repuesto = sc.nextInt();
                                    }
                                    break;
                        case 2:
                            System.out.println("Elija el carro a modificar: ");
                            for(Carro tem : carros){
                                if(tem instanceof Morgan){
                                    System.out.println(carros.indexOf(tem)+": "+tem);
                                }
                            }
                            May = sc.nextInt();
                            carros.get(May);
                            System.out.println("Ingrese numero de serie: ");
                                    serie = sc.next();
                                    carros.get(May).setSerie(serie);
                                    System.out.println("Ingrese marca de llantas");
                                    llantas = sc.next();
                                    carros.get(May).setLlantas(llantas);
                                    System.out.println("Es polatizado ? (s/n)");
                                    pol = sc.next().charAt(0);
                                    if(pol == 's'){
                                        polarizado = true;
                                    }else{
                                        polarizado = false;
                                    }
                                    carros.get(May).setPolarizado(polarizado);
                                    System.out.println("Ingrese la velocidad maxima(140 - 145): ");
                                    velocidad = sc.nextInt();
                                    carros.get(May).setVelocidad(velocidad);
                                    while(velocidad < 140 || velocidad > 145){
                                        System.out.println("Velocidad fuera del rango, ingresela de nuevo: ");
                                        velocidad = sc.nextInt();
                                        carros.get(May).setVelocidad(velocidad);
                                    }
                                    System.out.println("Ingrese kilometros por galon(35 - 40): ");
                                    km = sc.nextInt();
                                    carros.get(May).setKilomentros(km);
                                    while(km < 35 || km > 40){
                                        System.out.println("Valor ingresado mal, ingreselo de nuevo: ");
                                        km = sc.nextInt();
                                        carros.get(May).getKilomentros();
                                    }
                                    System.out.println("Ingrese el precio del carro ( 500,000 - 700,000):");
                                    precio = sc.nextInt();
                                    carros.get(May).setPrecio(precio);
                                    while(precio < 500000 || precio > 700000){
                                        System.out.println("Precio fuera del rango, ingeselo de nuevo: ");
                                        precio = sc.nextInt();
                                        carros.get(May).getPrecio();
                                    }
                                    System.out.println("Es convertible ? (s/n)");
                                    char con = sc.next().charAt(0);
                                    boolean convertible;
                                    if(con == 's'){
                                        convertible = true;
                                    }else{
                                        convertible = false;
                                    }
                                    ((Morgan)carros.get(May)).setConvertible(convertible);
                                    System.out.println("Ingrese tipo de cabina(unica/doble)");
                                    String cabina = sc.next();
                                    ((Morgan)carros.get(May)).setCabina(cabina);
                                    break;
                                case 3:
                                    System.out.println("Elija el carro a modificar: ");
                                    for (Carro tem : carros) {
                                        if (tem instanceof Fisker) {
                                            System.out.println(carros.indexOf(tem) + ": " + tem);
                                        }
                                    }
                                    May = sc.nextInt();
                                    carros.get(May);
                                    System.out.println("Ingrese numero de serie: ");
                                    serie = sc.next();
                                    carros.get(May).setSerie(serie);
                                    System.out.println("Ingrese marca de llantas");
                                    llantas = sc.next();
                                    carros.get(May).setLlantas(llantas);
                                    System.out.println("Es polatizado ? (s/n)");
                                    pol = sc.next().charAt(0);
                                    if (pol == 's') {
                                        polarizado = true;
                                    } else {
                                        polarizado = false;
                                    }
                                    carros.get(May).setPolarizado(polarizado);
                                    System.out.println("Ingrese la velocidad maxima(160 - 165): ");
                                    velocidad = sc.nextInt();
                                    carros.get(May).setVelocidad(velocidad);
                                    while (velocidad < 160 || velocidad > 165) {
                                        System.out.println("Velocidad fuera del rango, ingresela de nuevo: ");
                                        velocidad = sc.nextInt();
                                        carros.get(May).setVelocidad(velocidad);
                                    }
                                    System.out.println("Ingrese kilometros por galon(55 - 60): ");
                                    km = sc.nextInt();
                                    carros.get(May).setKilomentros(km);
                                    while (km < 55 || km > 60) {
                                        System.out.println("Valor ingresado mal, ingreselo de nuevo: ");
                                        km = sc.nextInt();
                                        carros.get(May).getKilomentros();
                                    }
                                    System.out.println("Ingrese el precio del carro ( 450,000 - 650,000):");
                                    precio = sc.nextInt();
                                    carros.get(May).setPrecio(precio);
                                    while (precio < 450000 || precio > 650000) {
                                        System.out.println("Precio fuera del rango, ingeselo de nuevo: ");
                                        precio = sc.nextInt();
                                        carros.get(May).getPrecio();
                                    }
                                    System.out.println("Es convertible ? (s/n)");
                                    con = sc.next().charAt(0);
                                    if(con == 's'){
                                        convertible = true;
                                    }else{
                                        convertible = false;
                                    }
                                    ((Fisker)carros.get(May)).setConvertible(convertible);
                                    System.out.println("Turismo o camioneta: ");
                                    String tipo = sc.next();
                                    ((Fisker)carros.get(May)).setModelo(tipo);
                                    break;
                                case 4:
                                    System.out.println("Elija el carro a modificar: ");
                                    for (Carro tem : carros) {
                                        if (tem instanceof Tramontana) {
                                            System.out.println(carros.indexOf(tem) + ": " + tem);
                                        }
                                    }
                                    May = sc.nextInt();
                                    carros.get(May);
                                    System.out.println("Ingrese numero de serie: ");
                                    serie = sc.next();
                                    carros.get(May).setSerie(serie);
                                    System.out.println("Ingrese marca de llantas");
                                    llantas = sc.next();
                                    carros.get(May).setLlantas(llantas);
                                    System.out.println("Es polatizado ? (s/n)");
                                    pol = sc.next().charAt(0);
                                    if (pol == 's') {
                                        polarizado = true;
                                    } else {
                                        polarizado = false;
                                    }
                                    carros.get(May).setPolarizado(polarizado);
                                    System.out.println("Ingrese la velocidad maxima(175 - 180): ");
                                    velocidad = sc.nextInt();
                                    carros.get(May).setVelocidad(velocidad);
                                    while (velocidad < 175 || velocidad > 180) {
                                        System.out.println("Velocidad fuera del rango, ingresela de nuevo: ");
                                        velocidad = sc.nextInt();
                                        carros.get(May).setVelocidad(velocidad);
                                    }
                                    System.out.println("Ingrese kilometros por galon(50 - 55): ");
                                    km = sc.nextInt();
                                    carros.get(May).setKilomentros(km);
                                    while (km < 50 || km > 55) {
                                        System.out.println("Valor ingresado mal, ingreselo de nuevo: ");
                                        km = sc.nextInt();
                                        carros.get(May).getKilomentros();
                                    }
                                    System.out.println("Ingrese el precio del carro ( 800,000 - 1,000,000):");
                                    precio = sc.nextInt();
                                    carros.get(May).setPrecio(precio);
                                    while (precio < 800000 || precio > 1000000) {
                                        System.out.println("Precio fuera del rango, ingeselo de nuevo: ");
                                        precio = sc.nextInt();
                                        carros.get(May).getPrecio();
                                    }
                                    System.out.println("Ingrese le peso: (1276 - 1376)");
                                    int peso = sc.nextInt();
                                    ((Tramontana)carros.get(May)).setPeso(peso);
                                    while(peso < 1276 || peso >1376){
                                        System.out.println("peso fuera de rango, ingreselo otra vez");
                                        peso = sc.nextInt();
                                        ((Tramontana)carros.get(May)).setPeso(peso);
                                    }
                                    System.out.println("Ingrese el tipo de transmision(6/7)");
                                    int trans = sc.nextInt();
                                    ((Tramontana)carros.get(May)).setTransmision(trans);
                                    while(trans < 6 || trans >7){
                                        System.out.println("Numero equivocado, ingrese otro");
                                        trans = sc.nextInt();
                                        ((Tramontana)carros.get(May)).setTransmision(trans);
                                    }
                                    break;
                                case 5:
                                    System.out.println("Elija el cliente a modificar");
                                    for(Cliente tem : clientes){
                                        System.out.println(clientes.indexOf(tem)+": "+tem);
                                    }
                                    int i = sc.nextInt();
                                    System.out.println("Ingrese nombre: ");
                                    String nombre = sc.next();
                                    
                                    clientes.get(i).setNombre(nombre);
                                    System.out.println("Ingrese indetidad: ");
                                    String id = sc.next();
                                    clientes.get(i).setIdentidad(id);
                                    System.out.println("Ingrese la edad: ");
                                    int edad = sc.nextInt();
                                    clientes.get(i).setEdad(edad);
                                    while (edad < 18) {
                                        System.out.println("debe ser mayor de 18, ingrese otra edad");
                                        edad = sc.nextInt();
                                        clientes.get(i).setEdad(edad);
                                    }
                                    System.out.println("Ingrese el peso: ");
                                    peso = sc.nextInt();
                                    clientes.get(i).setPeso(peso);
                                    System.out.println("Ingrese la altura: ");
                                    double altura = sc.nextDouble();
                                    clientes.get(i).setAltura(altura);
                                    while (altura < 1.55) {
                                        System.out.println("Debe ser mayor de 1.55");
                                        altura = sc.nextDouble();
                                        clientes.get(i).setAltura(altura);
                                    }
                                    System.out.println("Ingrese el dinero que tiene: ");
                                    int dinero = sc.nextInt();
                                    clientes.get(i).setDinero(dinero);
                                    break;
                                case 6:
                                    System.out.println("Elija el empleado a modificar");
                                    for(Empleado tem : empleados){
                                        System.out.println(empleados.indexOf(tem)+": "+tem);
                                    }
                                    i = sc.nextInt();
                                    System.out.println("Ingrese nombre: ");
                                    nombre = sc.next();
                                    empleados.get(i).setNombre(nombre);
                                    System.out.println("Ingrese indetidad: ");
                                    id = sc.next();
                                    empleados.get(i).setIdentidad(id);
                                    System.out.println("Ingrese la edad: ");
                                    edad = sc.nextInt();
                                    empleados.get(i).setEdad(edad);
                                    while (edad < 18) {
                                        System.out.println("debe ser mayor de 18, ingrese otra edad");
                                        edad = sc.nextInt();
                                        empleados.get(i).setEdad(edad);
                                    }
                                    System.out.println("Ingrese el peso: ");
                                    peso = sc.nextInt();
                                    empleados.get(i).setPeso(peso);
                                    System.out.println("Ingrese la altura: ");
                                    altura = sc.nextDouble();
                                    empleados.get(i).setAltura(altura);
                                    while (altura < 1.55) {
                                        System.out.println("Debe ser mayor de 1.55");
                                        altura = sc.nextDouble();
                                        empleados.get(i).setAltura(altura);
                                    }
                                    break;
                                    
                    }
                    break;
                case 3:
                    System.out.println("1. Carros\n"
                            + "2. Clientes\n"
                            + "3. Empleados");
                    int i = sc.nextInt();
                    switch(i){
                        case 1:
                            System.out.println("Elija el carro a eliminar");
                            for(Carro tem : carros){
                                System.out.println(carros.indexOf(tem)+": "+tem);
                            }
                            int d = sc.nextInt();
                            carros.remove(d);
                            break;
                        case 2:
                            System.out.println("Elija el cliente a eliminar");
                            for(Cliente tem : clientes){
                                System.out.println(clientes.indexOf(tem)+": "+tem);
                            }
                            d = sc.nextInt();
                            clientes.remove(d);
                            break;
                        case 3:
                            System.out.println("Ingrese el empleado a elminar: ");
                            for(Empleado tem : empleados){
                                System.out.println(empleados.indexOf(tem)+": "+tem);
                            }
                            d = sc.nextInt();
                            empleados.remove(d);
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Elija el cliente: ");
                    for(Cliente tem : clientes){
                        System.out.println(clientes.indexOf(tem)+": "+tem);
                    }
                    x = sc.nextInt();
                    System.out.println("Elija el empelado al cual se asiganara: ");
                    for(Empleado tem : empleados){
                        System.out.println(empleados.indexOf(tem)+": "+tem);
                    }
                    y = sc.nextInt();
                    if(empleados.get(y).getCliente().isEmpty()){
                        empleados.get(y).getCliente().add(clientes.get(x));
                        System.out.println("Elija el carro que se desea comprar: ");
                        for (Carro tem : carros) {
                            System.out.println(carros.indexOf(tem) + ": " + tem);
                        }
                        int carro = sc.nextInt();
                        if (empleados.get(y).Venta(clientes.get(x), carros.get(carro))) {
                            ventas.add(new Venta(carros.get(carro), clientes.get(x), empleados.get(y), carros.get(carro).getPrecio(), new Date()));
                        } else {
                            System.out.println("Venta no exitosa");
                        }
                        clientes.remove(x);
                    }else{
                        clientes.add(empleados.get(y).getCliente().get(0));//agrego el cliente del empleado a los demas clientes
                        empleados.get(y).getCliente().remove(0);//quito al cliente viejo
                        empleados.get(y).getCliente().add(clientes.get(x));//agrego el nuevo cliente y lo quito de la lista
                        System.out.println("Elija el carro que se desea comprar: ");
                        for (Carro tem : carros) {
                            System.out.println(carros.indexOf(tem) + ": " + tem);
                        }
                        int carro = sc.nextInt();
                        if(empleados.get(y).Venta(clientes.get(x), carros.get(carro))){
                            ventas.add(new Venta(carros.get(carro), clientes.get(x), empleados.get(y), carros.get(carro).getPrecio(), new Date()));
                        } else {
                            System.out.println("Venta no exitosa");
                        }
                        clientes.remove(x);
                    }
                    break;
                case 5:
                    for(Venta tem : ventas){
                        System.out.println(ventas.indexOf(tem)+": "+tem);
                    }
                    break;
                case 6:
                    op = 'f';
                    break;
            }
                
                
            
        }
        
    }
    
}

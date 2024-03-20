/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Creacion de la clase Triangulo
 * 
 * Contiene la informacion de Triangulo
 * 
 * @author Fernanda Ordoñez
 * @version 19/03/2024
 */
public class Triangulo {
    /**
     * Cateto adyacente, opuesto e hipotenusa
     */
    double co, ca, h;
    
    /**
     * 
     * Creación del metodo constructor inicializador de los atributos
     * 
     * @param co Cateto opuesto
     * @param ca Cateto adyacente
     * @param h Cateto opuesto
     */
    public Triangulo(double co, double ca) {
        this.co = co;
        this.ca = ca;
        this.h = calcularHipotenusa(co, ca);
    }


    
    /**
     * Creacion del metodo Calcular Hipotenusa
     * @param ca
     * @param co
     * @return regresa el resultado de la operacion matematica
     */
    private double calcularHipotenusa(double ca, double co) {
        return Math.sqrt(Math.pow(ca, 2) + Math.pow(co, 2));
    }
    
    /**
     * Creacion del metodo Calcular Area
     * @return regresa el resultado de la operacion matematica
     */
    public double calcularArea() {
        return (co * ca) / 2;
    }
    /**
     * Creacion del metodo Calcular Perimetro
     * @return regresa el resultado de la operacion matematica 
     */
    public double calcularPerimetro() {
        return co + ca + h;
    }
    /**
     * Creacion del metodo Obtener Cateto Opuesto
     * @return Regresa el valor del cateto opuesto
     */
    public double obtenerCatetoOpuesto() {
        return co;
    }
    /**
     * Creacion del metodo Obtener Cateto Adyacente
     * @return Regresa el valor del cateto adyacente
     */
    public double obtenerCatetoAdyacente() {
        return ca;
    }
    /**
     * Creacion del metodo Obtener Hipotenusa
     * @return Regresa el valor de la hipotenusa
     */
    public double obtenerHipotenusa() {
        return h;
    }
    
    /**
     * Metodo para imprimir el cateto opuesto
     */
    public void imprimirCatetoOpuesto() {
        System.out.println("Cateto opuesto: " + obtenerCatetoOpuesto());
    }
    /**
     * Metodo para imprimir el cateto adyacente
     */
    public void imprimirCatetoAdyacente() {
        System.out.println("Cateto adyacente: " + obtenerCatetoAdyacente());
    }
    /**
     * Metodo para imprimir la hipotenusa
     */
    public void imprimirHipotenusa() {
        System.out.println("Hipotenusa: " + obtenerHipotenusa());
    }
    
    /**
     * Metodo de Servisio-Sobreescritura
     * @return regresa la impresion de las caracteristicas del Triangulo
     */
    @Override
    public String toString() {
        return "Triangulo{" + "co=" + co + ", ca=" + ca + ", h=" + h + ", perimetro=" + calcularPerimetro() + ", area=" + calcularArea() + '}';
    }

}
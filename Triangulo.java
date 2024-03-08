/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author estudiante
 */
public class Triangulo {
    double co, ca, h;

    public Triangulo(double co, double ca) {
        this.co = co;
        this.ca = ca;
        this.h = calcularHipotenusa(co, ca);
    }

    private double calcularHipotenusa(double ca, double co) {
        return Math.sqrt(Math.pow(ca, 2) + Math.pow(co, 2));
    }

    public double calcularArea() {
        return (co * ca) / 2;
    }

    public double calcularPerimetro() {
        return co + ca + h;
    }
    
    public double obtenerCatetoOpuesto() {
        return co;
    }

    public double obtenerCatetoAdyacente() {
        return ca;
    }

    public double obtenerHipotenusa() {
        return h;
    }
    
    public void imprimirCatetoOpuesto() {
        System.out.println("Cateto opuesto: " + obtenerCatetoOpuesto());
    }

    public void imprimirCatetoAdyacente() {
        System.out.println("Cateto adyacente: " + obtenerCatetoAdyacente());
    }

    public void imprimirHipotenusa() {
        System.out.println("Hipotenusa: " + obtenerHipotenusa());
    }
    
    @Override
    public String toString() {
        return "Triangulo{" + "co=" + co + ", ca=" + ca + ", h=" + h + ", perimetro=" + calcularPerimetro() + ", area=" + calcularArea() + '}';
    }

}
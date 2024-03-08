/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author estudiante
 */
public class Alumno {
    String nombre;
    int edad;
    char genero;
    int noCuenta;
    String Carrera;

    public Alumno() {
    }

    public Alumno(String nombre, int edad, char genero, int noCuenta, String Carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.noCuenta = noCuenta;
        this.Carrera = Carrera;
    }

    @Override//sobreescritura
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", noCuenta=" + noCuenta + ", Carrera=" + Carrera + '}';
    }
    
    
    
}

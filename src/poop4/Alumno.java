/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * 
 * Creacion de la clase Alumno
 * 
 * Contiene la información de Alumno
 * 
 * @author Fernanda Ordoñez
 * @version 19/03/2024
 */
public class Alumno {
    //Atributos
    /**
     * Nombre del Alumno
     */
    String nombre;
    /**
     * Edad del alumno
     */
    int edad;
    /**
     * Genero del alumno
     */
    char genero;
    /**
     * Numero de cuenta
     */
    int noCuenta;
    /**
     * Carrera que cursa el alumno
     */
    String Carrera;
    
    /**
     * Constructor de la clase Alumno tipo vacio
     */
    public Alumno() {
    }
    
    /**
     * Creacion del metodo constructor inicializador de los atributos
     * 
     * @param nombre
     * @param edad
     * @param genero
     * @param noCuenta
     * @param Carrera 
     */
    public Alumno(String nombre, int edad, char genero, int noCuenta, String Carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.noCuenta = noCuenta;
        this.Carrera = Carrera;
    }
    
    /**
     * Metodo de servicio-Sobreescritura
     * @return Regresa la impresion de los datos de un alumno
     */
    @Override//sobreescritura
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", noCuenta=" + noCuenta + ", Carrera=" + Carrera + '}';
    }
    
    
    
}

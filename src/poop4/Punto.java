/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Creacion de la clase Punto
 * 
 * Contiene la informacion de los Puntos
 * 
 * @author Fernanda Ordoñez
 * @version 19/03/2024
 */
public class Punto { 
    /**
     * Coordenadas del punto
     */
    int x, y;
    /**
     * Metodo contructor sin parametros
     */
    public Punto(){}
    /**
     * Metodo constructor inicializador de los atributos
     * @param x Coordenada x
     * @param y Coordenada y
     * 
     */
    public Punto (int x, int y){
        this.x = x;
        this.y = y;
    }
    /**
     * Metodo para imprimir el punto
     */
    public void imprimirPunto(){
        System.out.println("x="+x+" y="+y);
    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author estudiante
 */
public class Punto { //clase para punto
    int x, y;
    //MEtodo contructor sin parametros
    public Punto(){}
    //Metodo contructor
    public Punto (int x, int y){
        this.x = x;
        this.y = y;
    }
    //solo hicimos la clase, el molde, pero aun no hemos hecho el objeto
    public void imprimirPunto(){
        System.out.println("x="+x+" y="+y);
    
    }
}

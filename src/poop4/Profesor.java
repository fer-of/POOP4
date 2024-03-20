/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase Profesor
 * 
 * Contiene la informacion de cada Profesor
 * 
 * @author Fernanda Ordoñez
 * @version 19/03/2024
 */
public class Profesor {
    //Atributos
    
    /**
     * Nombre, materia, carrera y profesion del Profesor
     */
    String nombre, materia, carrera, profesion;
    /**
     * Genero del Profesor 
     */
    char genero;
    //Metodos publicos
    /**
     * Metodos Constructores
     * Inicializa todo en 0
     */
    public Profesor(){}
    
    /**
     * Metodo contructor de los atributos
     * @param nombre
     * @param materia
     * @param carrera
     * @param profesion
     * @param genero 
     */
    public Profesor(String nombre,String materia, String carrera, String profesion, char genero){
        this.nombre = nombre;
        this.materia = materia;
        this.carrera = carrera;
        this.profesion = profesion;
        this.genero = genero;
    }
    
    /**
     * Metodo de accion, inidica si el profesor da clases
     */
    public void darClase(){
        System.out.println("Estoy dando clases");
    }
    
    /**
     * Metodo de accion, inidica cuando aplicara examen el profesor
     */
    public void aplicarExamenes(){
        System.out.println("mañana hay examen");
    }
    
    /**
     * Metodo de accion, inidica si el profesor dejo tarea
     */
    public void dejarTareas(){
        System.out.println("el previo es para el prox viernes");
    }
    
    /**
     * Metodo de accion, inidica la calificacion que asigno a algun alumno
     */
    public void calificarTrabajos(){
        System.out.println("Tu promedio es 8");
    }
    
    /**
     * Metodo de accion, el profesor pregunta a sus alumnos si tienen dudas
     */
    public void apoyarAlumnos(){
        System.out.println("Hay dudas?");
    }
    
    /**
     * Metdo de accion para imprimir las caracteristicas de un profesor
     */
    public void imprimirProfesor(){
        System.out.println("-Nombre= "+nombre);
        System.out.println("-Materia= "+materia);
        System.out.println("-Carrera= "+carrera);
        System.out.println("-Profesion= "+profesion);
        System.out.println("-Genero= " +genero);
        
    }
    
}

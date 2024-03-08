/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author estudiante
 */
public class Profesor {
    String nombre, materia, carrera, profesion;
    char genero;
    
    public Profesor(){}
    
    public Profesor(String nombre,String materia, String carrera, String profesion, char genero){
        this.nombre = nombre;
        this.materia = materia;
        this.carrera = carrera;
        this.profesion = profesion;
        this.genero = genero;
    }
    
    public void darClase(){
        System.out.println("Estoy dando clases");
    }
    
    public void aplicarExamenes(){
        System.out.println("mañana hay examen");
    }
    public void dejarTareas(){
        System.out.println("el previo es para el prox viernes");
    }
    public void calificarTrabajos(){
        System.out.println("Tu promedio es 8");
    }
    public void apoyarAlumnos(){
        System.out.println("Hay dudas?");
    }
    public void imprimirProfesor(){
        System.out.println("-Nombre= "+nombre);
        System.out.println("-Materia= "+materia);
        System.out.println("-Carrera= "+carrera);
        System.out.println("-Profesion= "+profesion);
        System.out.println("-Genero= " +genero);
        /**
         * sout (nombre)
         */
    }
    
}

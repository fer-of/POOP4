/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 * Practica 4
 * 
 * Uso de Clases y Objetos en java orientada a objetos
 * 
 * Clase principal
 * 
 * @author Fernanda Ordoñez
 * @version 19/03/2024
 */
public class POOP4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Crecion del objeto punto de tipo Punto (clase)
         */
        Punto punto = new Punto(); 
        int a = 7;
        System.out.println(a);
        System.out.println(punto);
        punto.imprimirPunto();
        //Creacion y asignacion de atributos del objeto punto
        Punto punto1 = new Punto(5,8);
        punto1.imprimirPunto();
        
        //Atributo de objeto punto
        punto.x = 12;
        punto.y = 33;
        punto.imprimirPunto();
        
        /**
         * Creacion de objetos de tipo Profesor
         */
        Profesor miProf = new Profesor();
        System.out.println("················Primer profe····················");
        /**
         * Asignacion de atributos para miProf
         */
        System.out.println("-Nombre: " + miProf.nombre);
        System.out.println("-Materia: " + miProf.materia);
        System.out.println("-Carrera: " + miProf.carrera);
        System.out.println("-Profesion: " + miProf.profesion);
        System.out.println("-Genero: " + miProf.genero);
        System.out.println("················Segundo profe····················");
        /**
         * Creacion del objeto miProf2 tipo Profesor con atributos
         */
        Profesor miProf2 = new Profesor("Luis","POO","IC","Arquitecto de Software", 'M');
        miProf2.imprimirProfesor();
        System.out.println("················Tercer profe····················");
        /**
         * Creacion del objeto miProf3 tipo Profesor
         * Asignacion de atributos con operador punto
         */
        Profesor miProf3 = new Profesor();
        miProf3.nombre = "Juan";
        miProf3.materia = "EDA";
        miProf3.carrera = "IC";
        miProf3.profesion = "Educador";
        miProf3.genero = 'M';
        miProf3.imprimirProfesor();
        System.out.println("················Alumno ····················");
        /**
         * Creacion de objeto alumno de tipo Alumno
         */
        Alumno alumno = new Alumno ("Jose", 20, 'M',23, "Compu");
        /**
         * Parseo para poder imprimir
         */ 
        System.out.println(alumno.toString());
        System.out.println("················Triangulo ····················");
        //Atributos
        /**
         * Cateto adyacente tipo double
         */
        double ca = 3.0;
        /**
         * Cateto opuesto tipo double
         */
        double co = 4.0;
        /**
         * Creacion de el objeto con parametros
         */
        Triangulo triangulo = new Triangulo(ca, co);    

        /**
         * Calculando el area del triangulo
         */
        double area = triangulo.calcularArea();
        System.out.println("El área del triángulo es: " + area);

        /**
         * Cacular el perimetro del triangulo
         */
        double perimetro = triangulo.calcularPerimetro();
        System.out.println("El perímetro del triángulo es: " + perimetro);
        
        /**
         * Impresion de el calculo de los catetos e hipotenusa
         */
        triangulo.imprimirCatetoOpuesto();
        triangulo.imprimirCatetoAdyacente();
        triangulo.imprimirHipotenusa();
                
    }
    
}

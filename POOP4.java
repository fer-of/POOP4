/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author estudiante
 */
public class POOP4 {
//Clase main, de aqui se manda a llamar todo lo demas

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PROGRAMAR LOS DIAGRAMAS DE CLASE
        Punto punto = new Punto(); //Este es un objeto de la clase Punto y se esta creando
        //clase //variable punto del tipo punto que almacena al punto  //metodo constructor, llamado Punto
        int a = 7;
        System.out.println(a);
        System.out.println(punto);
        punto.imprimirPunto();
        Punto punto1 = new Punto(5,8);
        punto1.imprimirPunto();
        punto.x = 12;//Atributo de objeto punto
        punto.y = 33;
        punto.imprimirPunto();
        
        /**Se imprime
         * 
         * poop4.Punto@a09ee92
         * -Se trata de el package poop4
         * -Luego esta la clase punto PUNTO
         * -El arroba es AT(en)
         * -En la direccion de memoria tal 
         * Se lee en la direccion de memoria se encuentr el objeto Punto, 
         * donde punto con minuscula es donde se guarda la referencia,
         * y todo esto esta dentro del packege poop4
         */ 
        //***************PARA PROFESOR****************
        Profesor miProf = new Profesor();
        System.out.println("················Primer profe····················");
        System.out.println("-Nombre: " + miProf.nombre);
        System.out.println("-Materia: " + miProf.materia);
        System.out.println("-Carrera: " + miProf.carrera);
        System.out.println("-Profesion: " + miProf.profesion);
        System.out.println("-Genero: " + miProf.genero);
        System.out.println("················Segundo profe····················");
        Profesor miProf2 = new Profesor("Luis","POO","IC","Arquitecto de Software", 'M');
        miProf2.imprimirProfesor();
        System.out.println("················Tercer profe····················");
        Profesor miProf3 = new Profesor();
        miProf3.nombre = "Juan";
        miProf3.materia = "EDA";
        miProf3.carrera = "IC";
        miProf3.profesion = "Educador";
        miProf3.genero = 'M';
        miProf3.imprimirProfesor();
        System.out.println("················Alumno ····················");
        Alumno alumno = new Alumno ("Jose", 20, 'M',23, "Compu");
//parseo para poder imprimir
        System.out.println(alumno.toString());
        System.out.println("················triangulo ····················");
        double ca = 3.0;
        double co = 4.0;
        Triangulo triangulo = new Triangulo(ca, co);    

        // Calcular y mostrar el área del triángulo
        double area = triangulo.calcularArea();
        System.out.println("El área del triángulo es: " + area);

        // Calcular y mostrar el perímetro del triángulo
        double perimetro = triangulo.calcularPerimetro();
        System.out.println("El perímetro del triángulo es: " + perimetro);
        
        triangulo.imprimirCatetoOpuesto();
        triangulo.imprimirCatetoAdyacente();
        triangulo.imprimirHipotenusa();
        
        
    }
    
}

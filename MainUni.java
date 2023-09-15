/* Emiliano De La Torre Hernandez
 * Mariana Midory Iniguez Rodriguez
 * Angel Eduardo Munoz Perez 
 * 14-09-2023
 * Main Unidades
 * Centro Universitario de los Altos | Universidad de Guadalajara
 * Ingenieria en computacion
 * Profesor: Sergio Franco Casillas
 * Descripcion: convierte el ingreso del valor a la unidad  que tu hayas elegido
 */

import java.util.Scanner;

public class MainUni {
    /**
     * el Frontend donde el usuario introduce lo que desea y se muestra lo que quiere*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //es la forma de introducir datos
        LibreriasdeUnidades formato = new LibreriasdeUnidades(); //Objeto de librerias
        double numero = 0;//debe ser doble para que tenga un mayor espacio de numeros y entre los flotantes
        int opcion1 =0, opcion2 = 0;//variables para seleccionar formato de entrada y salida
        //este while se encarga de mantener un ciclo en el programa hasta que el usuario decida cerrarlo 
        //seleccionando ambas opciones el numero 7
        while (opcion1!=7 || opcion2!=7)
        {   
            System.out.println("Escribe el numero que quieres convertir: ");
            numero = leer.nextDouble();
            System.out.println("________________________________________");
            System.out.println("|1) Centimetros                        |");
            System.out.println("|2) Pulgadas                           |");
            System.out.println("|3) Yardas                             |");
            System.out.println("|4) Metros                             |");
            System.out.println("|5) Kilometros                         |");
            System.out.println("|6) Millas                             |");
            System.out.println("|7) Salir                              |");
            System.out.println("|______________________________________|");
            //se encarga de validar si se esta ingresando el valor del rango establecido correctamente
            try {
                System.out.println("Escoge el formato del numero que has escribido: ");
                opcion1 = leer.nextInt();
                System.out.println("Escoge el formato en el que quieres convertir el numero que has escribido: ");
                opcion2 = leer.nextInt();
            } catch (Exception e) {
                System.out.println("\nSeleccione correctamente\n");
            }//fin del try-catch de validacion 
            //if para verificar que ambas opciones no sean iguales
            if (opcion1 != opcion2) 
                formato.mostrar(numero, opcion1, opcion2);//Backend
            if (numero == 0) { //Comienzo del ifelse
                System.out.println("Formato de numero invalido");
            } //fin del if
            else { } //Fin del ifelse
        }//fin del while
        leer.close();
    }//fin del main
}//fin de la clase principal 

/* Emiliano De La Torre Hernandez
 * Mariana Midory Iniguez Rodriguez
 * Angel Eduardo Munoz Perez 
 * 15-09-2023
 * MainTemperaturas 
 * Centro Universitario de los Altos | Universidad de Guadalajara
 * Ingenieria en computacion
 * Profesor: Sergio Franco Casillas
 * Descripcion: convierte el ingreso del valor al cambio de temperaturas que tu hayas elegido
 */

import java.util.Scanner;

public class MainTem {
    /**
     * el Frontend donde el usuario introduce lo que desea y se muestra lo que quiere*/
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in); //es la forma de introducir datos
        LibreriasdeTemperaturas formato = new LibreriasdeTemperaturas(); //Objeto de librerias
        float numero = 0; //variable que permitira el ingreso al valor
        int opcion1 = 0, opcion2 = 0; //variables para seleccionar formato de entrada y salida
        //este while se encarga de mantener un ciclo en el programa hasta que el usuario decida cerrarlo 
        while (opcion1 != 4 || opcion2 != 4) {
            System.out.println("Escribe el grado que quieres convertir: ");
            numero = leer.nextFloat();
            System.out.println("___________________________________");
            System.out.println("|1) Kelvin                        |");
            System.out.println("|2) Fahrenheir                    |");
            System.out.println("|3) Celsius                       |");
            System.out.println("|4) Salir                         |");
            System.out.println("|_________________________________|");
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
                formato.escribir(opcion1, opcion2, numero);//Backend
            if (numero == 0) { //Comienzo del ifelse
                System.out.println("Formato de numero invalido");
            } //fin del if
            else { } //Fin del ifelse
        }//fin del while
        leer.close();
    }//fin de la clase del main
}//fin de la clase principal
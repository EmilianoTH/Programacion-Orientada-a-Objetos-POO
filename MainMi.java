/* Emiliano De La Torre Hernandez
 * Mariana Midory Iniguez Rodriguez
 * Angel Eduardo Munoz Perez 
 * 12-09-2023
 * Main Midory
 * Centro Universitario de los Altos | Universidad de Guadalajara
 * Ingenieria en computacion
 * Profesor: Sergio Franco Casillas
 * Descripcion: Main del programa de unidades
 */

 import java.util.Scanner;
 /* Comienza el codigo con la clase principal
  */
public class MainMi {
    /**
     * frontend del usuario introduce el metodo y se muestra lo que desea*/
    public static void main(String[] args) { //comienzo del main
        Scanner leer = new Scanner(System.in); //es la forma de introducir datos
        Librerias formato = new Librerias(); //Objeto de librerias
        LibreriasdeUnidades formato1 = new LibreriasdeUnidades(); //Objeto de librerias
        LibreriasdeTemperaturas formato2 = new LibreriasdeTemperaturas(); //Objeto de librerias
        int opcion = 0; //variables a utilizar
        double unidad = 0;//variable a utilizar en las unidades
        float temperatura = 0; //variable a utilizar en las temperaturas
        String sistema = ""; //variable que utilizar en los sistemas
        int  opcion1 = 0, opcion2 = 0;//variables para seleccionar formato de entrada y salida
        //este while se encarga de no cerrar el programa hasta que el usuario lo solicite
        while (opcion != 4) {
            System.out.println("\n\n");
            System.out.println("|         Bienvenido al programa       |");
            System.out.println("|______________________________________|");
            System.out.println("|1) Sistemas                           |");
            System.out.println("|2) Unidades                           |");
            System.out.println("|3) Temperaturas                       |");
            System.out.println("|4) Salir                              |");
            System.out.println("|______________________________________|");
            System.out.print("Seleccione el sistema a ejecutar: ");
            //se encarga de validar si se esta ingresando el valor del rango establecido correctamente
            try {
                opcion = leer.nextInt();
            } catch (Exception e) {
                leer.nextLine();
                System.out.println("\nSeleccione correctamente\n");
            }//fin del try catch
            //este switch al poner la opcion, se dirige a lo solicita para dar otro mini switch dependiendo del caso
            switch (opcion) {
                case 1:
                    System.out.println("Escribe el numero que quieres convertir: "); 
                    sistema = leer.next();//Numero a convertir
                    System.out.println("________________________________________");
                    System.out.println("|1) Binario                            |");
                    System.out.println("|2) Octal                              |");
                    System.out.println("|3) Decimal                            |");
                    System.out.println("|4) Hexadecimal                        |");
                    System.out.println("|5) Salir                              |");
                    System.out.println("|______________________________________|");
                    //se encarga de validar si se esta ingresando el valor del rango establecido correctamente
                    try {
                        System.out.println("Escoge el formato en el que escribiste el numero: ");
                        opcion1 = leer.nextInt();
                        System.out.println("Escoge el formato en el que quieres convertir el numero que has escribido: ");
                        opcion2 = leer.nextInt();
                    } catch (Exception e) {
                        System.out.println("\nSeleccione correctamente\n");
                    }//fin del try-catch de validacion 
                    //if para verificar que ambas opciones no sean iguales
                    if (opcion1 == 5 || opcion2 == 5) {
                        System.out.println("Regresara al menu");
                    }//fin del if
                    else {
                         if (opcion1 != opcion2) 
                        sistema = formato.convertidor(opcion1, opcion2, sistema); //Backend
                    if (sistema == "") { //Comienzo del ifelse, le avisa al usuario que no escribio nada
                        System.out.println("Formato de numero invalido");
                    } else {
                        System.out.println("Resultado: "+sistema);
                    } //Fin del ifelse
                    }//fin del if-else
                    break;
                case 2: 
                    System.out.println("Escribe el numero que quieres convertir: ");
                    unidad = leer.nextDouble();//Numero a convertir
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
                        System.out.println("Escoge el formato en el que escribiste el numero: ");
                        opcion1 = leer.nextInt();
                        System.out.println("Escoge el formato en el que quieres convertir el numero escrito: ");
                        opcion2 = leer.nextInt();
                    } catch (Exception e) {
                        System.out.println("\nSeleccione correctamente\n");
                    }//fin del try-catch de validacion 
                    //if para verificar que ambas opciones no sean iguales
                    if (opcion1 == 7 || opcion2 == 7) {
                        System.out.println("Regresara al menu");
                    }//fin del if
                    else {
                        //este if se encarga de validar 
                        if (opcion1 != opcion2 && unidad >0) {
                            formato1.mostrar(unidad, opcion1, opcion2);
                        }//fin del segundo if
                    }//fin del if-else
                    break;
                case 3:
                    System.out.println("Escribe el grado que quieres convertir: ");
                    temperatura = leer.nextFloat();
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
                    if (opcion1 == 4  || opcion2 == 4) {
                        System.out.println("Regresara al menu");
                    }//fin del if
                    else {
                        if (opcion1 != opcion2) 
                        formato2.escribir(opcion1, opcion2, temperatura);//Backend
                    if (temperatura == 0) { //Comienzo del ifelse
                        System.out.println("Formato de numero invalido");
                    } //fin del if
                    }//fin del if-else
                    break;
                case 4: 
                    System.out.println("\nAdios");
                    break;
                default://no es tan necesario, ya que se tiene una validacion en el principio
                    break;
            }//fin del switch
        } //fin del while
    leer.close(); //cierra el scaner
    } //fin del main
} //fin de la clase
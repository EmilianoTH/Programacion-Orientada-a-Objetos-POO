/* Emiliano De La Torre Hernandez
 * Mariana Midory Iniguez Rodriguez
 * Angel Eduardo Munoz Perez 
 * 26-09-2023
 * Main Midory
 * Centro Universitario de los Altos | Universidad de Guadalajara
 * Ingenieria en computacion
 * Profesor: Sergio Franco Casillas
 * Descripcion: Main del programa de unidades (modificado)
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
        LibreriasdeUnidades formato1 = new LibreriasdeUnidades(); //Objeto de libreria de unidades
        LibreriasdeTemperaturas formato2 = new LibreriasdeTemperaturas(); //Objeto de libreria de temperatura
        LibreriasdeCalculadora formato3 = new LibreriasdeCalculadora();//Objeto de libreria de calculadora
        int opcion = 0; //variables a utilizar
        double unidad = 0;//variable a utilizar en las unidades
        float temperatura = 0; //variable a utilizar en las temperaturas
        String sistema = ""; //variable que utilizar en los sistemas
        float general1 = 0;//variable que se utilizara en la calculadora
        float general2 = 0;//variable que se utilizara en la calculadora
        double raiz = 0;//variable que se utliza en la realizacion de la raiz en la calculadora
        int  opcion1 = 0, opcion2 = 0;//variables para seleccionar formato de entrada y salida

        //este while se encarga de no cerrar el programa hasta que el usuario lo solicite
        while (opcion != 5) {
            System.out.println("\n\n");
            System.out.println("|         Bienvenido al programa       |");
            System.out.println("|______________________________________|");
            System.out.println("|1) Sistemas                           |");
            System.out.println("|2) Unidades                           |");
            System.out.println("|3) Temperaturas                       |");
            System.out.println("|4) Calculadora                        |");
            System.out.println("|5) Salir                              |");
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
                    opcion1 = 0;//evita ciertos problemas con el while al estar igualado a 0 
                    opcion2 = 0;//evita ciertos problemas con el while al estar igualado a 0 
                    //este while se encarga de cerrar el mini menu de sistemas si el usuario
                    //lo solicita, para regresar al menu principal
                    while(opcion1 !=5 && opcion2 !=5){
                    System.out.println("________________________________________");
                    System.out.println("|1) Binario                            |");
                    System.out.println("|2) Octal                              |");
                    System.out.println("|3) Decimal                            |");
                    System.out.println("|4) Hexadecimal                        |");
                    System.out.println("|5) Salir                              |");
                    System.out.println("|______________________________________|");
                    //se encarga de validar si se esta ingresando el valor del rango establecido correctamente
                    try {
                        System.out.println("Escribe el formato que se escribira el numero: ");
                        opcion1 = leer.nextInt();
                        //se encarga de validar que la opcion sea diferente de salir
                    } catch (Exception e) {
                        leer.nextLine();
                        System.out.println("\nSeleccione correctamente\n");
                    }//fin del try-catch de validacion 
                    //if encargado de validar si el usuario desde el principio ingresa 5 para salir
                    if (opcion1 !=5) {
                //se encarga de validar si se esta ingresando el valor del rango establecido correctamente
                        try {
                            System.out.println("Escoge el formato en el que quieres convertir el numero: ");
                            opcion2 = leer.nextInt();
                        } catch (Exception e) {
                            leer.nextLine();
                            System.out.println("\nSeleccione correctamente\n");
                        }//fin del try-catch de validacion
                     //if encargado de validar si el usuario desde el principio ingresa 5 para salir
                        if (opcion2 !=5) {
                            //if para verificar que ambas opciones no sean iguales
                            if (opcion1 != opcion2){
                            System.out.println("Escribe el numero que quieres convertir: "); 
                            sistema = leer.next();//Numero a convertir
                            sistema = formato.convertidor(opcion1, opcion2, sistema); //Backend
                            }if (sistema == "") { //Comienzo del ifelse, le avisa al usuario que no escribio nada
                            System.out.println("Formato de numero invalido");
                            } else {
                            System.out.println("Resultado: "+sistema);
                        } //Fin del ifelse
                        }//fin del segundo if
                    }//fin del if   
                }//fin del while
                    break;
                case 2: 
                    opcion1 = 0;//evita ciertos problemas con el while al estar igualado a 0 
                    opcion2 = 0;//evita ciertos problemas con el while al estar igualado a 0 
                    //este while se encarga de cerrar el mini menu de unidades si el usuario
                    //lo solicita, para regresar al menu principal
                    while (opcion1 !=7 && opcion2 !=7){
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
                        System.out.println("Escribe el formato que se escribira el numero:  ");
                        opcion1 = leer.nextInt();
                    } catch (Exception e) {
                        leer.nextLine();
                        System.out.println("\nSeleccione correctamente\n");
                    }//fin del try-catch de validacion 
                     //este if se encarga de verficar si el usuario no ingreso el valor para salir
                    if (opcion1 !=7) {
                 //se encarga de validar si se esta ingresando el valor del rango establecido correctamente
                        try {
                            System.out.println("Escoge el formato en el que quieres convertir el numero: ");
                            opcion2 = leer.nextInt();
                        } catch (Exception e) {
                            leer.nextLine();
                            System.out.println("\nSeleccione correctamente\n");
                        }//fin del try catch
                     //este if se encarga de verficar si el usuario no ingreso el valor para salir
                        if (opcion2 !=7) {
                       //se encarga de validar si se esta ingresando el valor del rango establecido correctamente
                            try {
                                System.out.println("Escribe el numero que quieres convertir: ");
                                unidad = leer.nextDouble();//Numero a convertir
                            } catch (Exception e) {
                                leer.nextLine();
                                System.out.println("\nSeleccione correctamente\n");
                            }//fin de segundo try-catch
                            //este if se encarga de validar 
                            if (opcion1 != opcion2 && unidad >0) {
                                formato1.mostrar(unidad, opcion1, opcion2);
                            }//fin del if
                        }//fin del if
                    }//fin del if
                }//fin del while
                    break;
                case 3:
                    opcion1 = 0;//evita ciertos problemas con el while al estar igualado a 0 
                    opcion2 = 0;//evita ciertos problemas con el while al estar igualado a 0
                    //este while se encarga de cerrar el mini menu de temperaturas si el usuario
                    //lo solicita, para regresar al menu principal
                    while(opcion1 !=4 && opcion2 !=4){
                    System.out.println("___________________________________");
                    System.out.println("|1) Kelvin                        |");
                    System.out.println("|2) Fahrenheir                    |");
                    System.out.println("|3) Celsius                       |");
                    System.out.println("|4) Salir                         |");
                    System.out.println("|_________________________________|");
                    //se encarga de validar si se esta ingresando el valor del rango establecido correctamente
                    try {
                        System.out.println("Escribe el formato que se escribira el grado:  ");
                        opcion1 = leer.nextInt();
                    } catch (Exception e) {
                        leer.nextLine();
                        System.out.println("\nSeleccione correctamente\n");
                    }//fin del try-catch de validacion 
                     //este if se encarga de verficar si el usuario no ingreso el valor para salir
                    if (opcion1 !=4) {
                      //se encarga de validar si se esta ingresando el valor del rango establecido correctamente
                        try {
                            System.out.println("\"Escoge el formato en el que quieres convertir el grado: ");
                            opcion2 = leer.nextInt();
                        } catch (Exception e) {
                            leer.nextLine();
                            System.out.println("\nSeleccione correctamente\n");
                        }//fin del try-catch
                     //este if se encarga de verficar si el usuario no ingreso el valor para salir
                        if (opcion2 !=4) {
                          //se encarga de validar si se esta ingresando el valor del rango establecido correctamente
                            try {
                                System.out.println("Escribe el grado que quieres convertir: ");
                                temperatura = leer.nextFloat();
                            } catch (Exception e) {
                                leer.nextLine();
                                System.out.println("\nSeleccione correctamente\n");
                            }//fin del try-catch
                             //if para verificar que ambas opciones no sean iguales
                            if (opcion1 != opcion2){
                                formato2.escribir(opcion1, opcion2, temperatura);//Backend
                            } //fin del if
                        }//fin del if
                    }//fin del if
                }//fin del while 
                    break;
                case 4:
                    opcion = 0;//evita ciertos problemas con el while al estar igualado a 0 
                   //se encarga de ejecutar hasta que el usuario decida cerrar la calculadora y regresar
                    //al menu principal con las otras opciones
                    while(opcion !=6){
                        System.out.println("_____________________");
                        System.out.println("|1) Suma            |");
                        System.out.println("|2) Resta           |");
                        System.out.println("|3) Multiplicacion  |");
                        System.out.println("|4) Division        |");
                        System.out.println("|5) Raiz            |");
                        System.out.println("|6) Salir           |");
                        System.out.println("_____________________");
                        System.out.print("Seleccion: ");
                        //se encarga de validar si se esta ingresando el valor del rango establecido correctamente
                        try {
                            opcion = leer.nextInt();
                        } catch (Exception e) {
                            leer.nextLine();
                            System.out.println("\nSeleccione correctamente\n");
                        }//fin del try-catch
                       //este switch se encarga de mostrar cada caso dependiendo el que el usuario este solicitando
                        switch (opcion) {
                            case 1:
                          //se encarga de validar si se esta ingresando el valor del rango establecido correctamente
                                try {
                                    System.out.println("Escribe el primer numero: ");
                                    general1 = leer.nextFloat();
                                    System.out.println("Escribe el segundo numero: ");
                                    general2 = leer.nextFloat();
                                    formato3.mostrarsuma(general1, general2);
                                } catch (Exception e) {
                                    leer.nextLine();
                                    System.out.println("\nSeleccione correctamente\n");
                                }//fin del try-catch
                                break;
                            case 2:
                          //se encarga de validar si se esta ingresando el valor del rango establecido correctamente
                                try {
                                    System.out.println("Escribe el primer numero: ");
                                    general1 = leer.nextFloat();
                                    System.out.println("Escribe el segundo numero: ");
                                    general2 = leer.nextFloat();
                                   formato3.mostraresta(general1, general2);
                                } catch (Exception e) {
                                   leer.nextLine();
                                    System.out.println("\nSeleccione correctamente\n");
                                }//fin del try-catch
                                break;
                            case 3:
                         //se encarga de validar si se esta ingresando el valor del rango establecido correctamente
                                try {
                                    System.out.println("Escribe el primer numero: ");
                                    general1 = leer.nextFloat();
                                    System.out.println("Escribe el segundo numero: ");
                                    general2 = leer.nextFloat();
                                    formato3.mostrarmulti(general1, general2);
                                } catch (Exception e) {
                                   leer.nextLine();
                                    System.out.println("\nSeleccione correctamente\n");
                                }//fin del try-catch
                                break;
                            case 4:
                     //se encarga de validar si se esta ingresando el valor del rango establecido correctamente
                                try {
                                    System.out.println("Escribe el primer numero: ");
                                    general1 = leer.nextFloat();
                                    System.out.println("Escribe el segundo numero: ");
                                    general2 = leer.nextFloat();
                                } catch (Exception e) {
                                   leer.nextLine();
                                    System.out.println("\nSeleccione correctamente\n");
                                }//fin del try-catch
                              //este if se encarga de validar que ingrese valores diferente de 0
                                if (general1 !=0 && general2 !=0) {
                                    formato3.mostrardivision(general1, general2);
                                }//fin del if
                                //se encarga de dar una advertencia al usuario si escribio 0 
                                else{
                                    System.out.println("\nFormato de numero invalido\n");
                                }//fin del if-else
                                break;
                            case 5:
                        //se encarga de validar si se esta ingresando el valor del rango establecido correctamente
                                try {
                                    System.out.println("Escribe el numero: ");
                                    raiz = leer.nextDouble();
                                } catch (Exception e) {
                                    leer.nextLine();
                                    System.out.println("\nSeleccione correctamente\n");
                                }//fin del try-catch
                          //este if se encarga de validar que ingrese valores mayor a 0, evitando
                                //los imaginarios en la raiz
                                if (raiz !=0 && raiz > 0) {
                                    formato3.mostrarraiz(raiz);
                                }//fin del if
                                //se encarga de dar una advertencia al usuario si escribio numero imaginario o 0
                                else{
                                    System.out.println("\nFormato de numero invalido\n");
                                }//fin del if-else
                                break;
                            case 6:     
                                System.out.println("Regresara al menu");
                                break;
                            default:
                                System.out.println("\nSeleccione correctamente\n");
                                break;
                        }//fin del switch
                    }//fin del while
                    break;
                case 5: 
                    System.out.println("\nAdios");
                    break;
                default:
                    System.out.println("Opcion no valida\nSeleccione correctamente");
                    break;
            }//fin del switch
        } //fin del while
    leer.close(); //cierra el scaner
    } //fin del main
} //fin de la clase

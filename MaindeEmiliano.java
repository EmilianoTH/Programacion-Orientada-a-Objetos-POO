/* Emiliano De La Torre Hernandez
 * Mariana Midory Iniguez Rodriguez
 * Angel Eduardo Munoz Perez 
 * 12-09-2023
 * Conversor(cambia el nombre como lo tengas)
 * Centro Universitario de los Altos | Universidad de Guadalajara
 * Ingenieria en computacion
 * Profesor: Sergio Franco Casillas
 * Descripcion: Main del programa de conversiones
 */

 import java.util.Scanner;
 /* Comienza el codigo con la clase principal
  */
public class MaindeEmiliano {
    /**
     * El Frontend donde el usuario introduce lo que desea y se muestra lo 
     * que quiere*/
    public static void main(String[] args) { //Comienzo del main
        Scanner leer = new Scanner(System.in); //es la forma de introducir datos
        Librerias formato = new Librerias(); //Objeto de librerias
        int menu = 0; //Variables a utilizar
        double unidad = 0; //Variable que utilizara las unidades
        float temperatura = 0; //Variable que utilizara la temperatura
        String sistemas = ""; //Variable que utilizara los sistemas

        while (menu != 4) {
        int  opcion1 = 0, opcion2 = 0;

            System.out.println("|--------------------------------------|");
            System.out.println("|1) Sistemas                           |");
            System.out.println("|2) Unidades                           |");
            System.out.println("|3) Temperaturas                       |");
            System.out.println("|4) Salir                              |");
            System.out.println("|--------------------------------------|");
            System.out.print("Elige el sistema de conversion que quieras: ");
            try {
                menu = leer.nextInt();
            } catch (Exception e) {
                leer.nextLine();
                System.out.println("\nError\nElige una opcion correcta");
            }
            switch (menu) {
                case 1:
                    System.out.println("Escribe el numero que quieres convertir: "); //Numero a convertir
                    sistemas = leer.next();
                    LibreriapersonaldeEmiliano.MaindeSistemas();
                    try {
                        System.out.println("Escoge el formato en el que escribiste el numero: ");
                        opcion1 = leer.nextInt();
                        System.out.println("Escoge el formato en el que quieres convertir el numero que has escribido: ");
                        opcion2 = leer.nextInt();
                    } catch (Exception e) {
                        System.out.println("\nError\nElige una opcion correcta");
                    }
                    if (opcion1 == 5 || opcion2 == 5) //if
                        System.out.println("Entendido");
                    else{ //Else
                        if (opcion1 != opcion2) //If para verificar que ambas opciones no sean iguales
                        sistemas = formato.convertidor(opcion1, opcion2, sistemas); //Backend
                        if (sistemas == "") { //Comienzo del ifelse, le avisa al usuario que no escribio nada
                        System.out.println("\n\nNo Te VaLlAs a CanSaR DE EScRiBir >:(");
                        System.out.println("Traduccion: Formato de numero invalido");
                        } else {
                        System.out.println("Resultado: "+sistemas);
                        } //Fin del ifelse
                    }//Fin del else
                    break;
                case 2:
                    System.out.println("Escribe el numero con el que quieres trabajar: ");
                    try { //Inicio del try
                        unidad = leer.nextDouble();
                    } catch (Exception e) {
                        leer.nextLine();
                        System.out.println("\nERROR\nFormato numerico invalido");
                    } //fin del catch

                    LibreriapersonaldeEmiliano.MaindeUnidades();

                    try { //Inicio del try
                        System.out.println("Escoge el formato en el que escribiste el numero: ");
                        opcion1 = leer.nextInt();
                        System.out.println("Escoge el formato en el que quieres convertir el numero que has escribido: ");
                        opcion2 = leer.nextInt();
                    } catch (Exception e) { //Inicio del catch
                        System.out.println("\nError\nElige una opcion correcta");
                    } //Fin del catch

                    if (opcion1 == 7 || opcion2 == 7) { //Comienzo del if
                        System.out.println("Entendido");
                    } // Fin el if

                    else{ //Comienzo del else
                        if (opcion1 != opcion2 && unidad > 0) { //If para validar
                            LibreriasdeUnidades.mostrar(unidad, opcion1, opcion2);
                        }
                        else{
                            System.out.println("Error\nNo eliga las mismas opciones\nTampoco escriba numeros negativos");
                        }
                    } //Fin del else
                    break;

                case 3:

                    break;
                default:
                    break;
            }
        } //Fin del while
    leer.close(); //Cerrar el scaner
    } //Fin del main
} //Fin de la clase
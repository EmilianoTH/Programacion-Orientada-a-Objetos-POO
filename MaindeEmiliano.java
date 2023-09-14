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
        int menu = 0, submenu1 = 0, submenu2 = 0; //Variables a utilizar
        while (menu != 4) {
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
        } //Fin del while
    leer.close(); //Cerrar el scaner
    } //Fin del main
} //Fin de la clase
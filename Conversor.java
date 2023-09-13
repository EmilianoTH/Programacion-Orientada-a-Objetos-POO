/* Emiliano De La Torre Hernandez
 * Mariana Midory Iniguez Rodriguez
 * Angel Eduardo Munoz Perez 
 * 05-09-2023
 * Conversor(cambia el nombre como lo tengas)
 * Centro Universitario de los Altos | Universidad de Guadalajara
 * Ingenieria en computacion
 * Profesor: Sergio Franco Casillas
 * Descripcion: convierte el ingreso del valor al sistema que tu hayas elegido
 */
import java.util.Scanner;
/* Comienza el codigo con la clase principal
 */
public class Conversor {
    /**
     * el Frontend donde el usuario introduce lo que desea y se muestra lo 
     * que quiere*/
    public static void main(String[] args) { 
        Scanner leer = new Scanner(System.in); //es la forma de introducir datos
        Librerias formato = new Librerias(); //Objeto de librerias
        String numero = "";
        int opcion1 =0, opcion2 = 0;//varible usada para cerrar el ciclo y variable con la que se trabajara
        while (opcion1!=5 || opcion2!=5) //While para que el usuario decida cuando romperlo//
        {   
            System.out.println("Escribe el numero que quieres convertir: "); //Numero a convertir
            numero = leer.next();
            System.out.println("|--------------------------------------|");
            System.out.println("|1) Binario                            |");
            System.out.println("|2) Octal                              |");
            System.out.println("|3) Decimal                            |");
            System.out.println("|4) Hexadecimal                        |");
            System.out.println("|5) Salir                              |");
            System.out.println("|--------------------------------------|");
            System.out.println("Escoge el formato en el que escribiste el numero: ");
            opcion1 = leer.nextInt();
            System.out.println("Escoge el formato en el que quieres convertir el numero que has escribido: ");
            opcion2 = leer.nextInt();
            if (opcion1 != opcion2) //If para verificar que ambas opciones no sean iguales
                numero = formato.convertidor(opcion1, opcion2, numero); //Backend
            if (numero == "") { //Comienzo del ifelse, le avisa al usuario que no escribio nada
                System.out.println("\n\nNo Te VaLlAs a CanSaR DE EScRiBir >:(");
                System.out.println("Traduccion: Formato de numero invalido");
            } else {
                System.out.println("Resultado: "+numero);
            } //Fin del ifelse
        }//fin del while
        leer.close();
    }//fin del main
}//fin de la clase principal 
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
     * el frontend donde el usuario introduce lo que desea y se muestra lo 
     * que quiere*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //es la forma de introducir datos
        int opcion=0;//varible usada para cerrar el ciclo
        while (opcion!=5)
        {   
            System.out.println("|Introduce en el formato que quiera    |");
            System.out.println("|--------------------------------------|");
            System.out.println("|1) Decimal                            |");
            System.out.println("|2) Octal                              |");
            System.out.println("|3) Hexadecimal                        |");
            System.out.println("|4) Binario                            |");
            System.out.println("|5) Salir                              |");
            System.out.println("|--------------------------------------|");
            System.out.print("Opcion: ");
            opcion = leer.nextInt();
            switch(opcion)
            {
                case 1: 
                    
                    break;
                case 2:
                    
                   break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                 System.out.println("ERROR\nOpcion no valida");
                    break;
            }//fin del switch
        }//fin del while
    }//fin del main
}//fin de la clase principal 
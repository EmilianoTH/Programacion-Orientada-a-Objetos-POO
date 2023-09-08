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
import java.io.IOException; //Libreria para poder utilizar una funcion de limpiar pantalla
import java.util.Scanner;
/* Comienza el codigo con la clase principal
 */
public class Conversor {
    /**
     * el Frontend donde el usuario introduce lo que desea y se muestra lo 
     * que quiere*/
    public static void main(String[] args) throws IOException, InterruptedException{
        Scanner leer = new Scanner(System.in); //es la forma de introducir datos
        Librerias formato = new Librerias(); //Objeto de librerias
        String numero = "";
        int opcion1 =0, opcion2 = 0;//varible usada para cerrar el ciclo y variable con la que se trabajara
        while (opcion1!=5 || opcion2!=5)
        {   
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("Escribe el numero que quieres convertir: ");
            numero = leer.next();
            System.out.println("|--------------------------------------|");
            System.out.println("|1) Binario                            |");
            System.out.println("|2) Octal                              |");
            System.out.println("|3) Decimal                            |");
            System.out.println("|4) Hexadecimal                        |");
            System.out.println("|5) Salir                              |");
            System.out.println("|--------------------------------------|");
            System.out.print("Escoge el formato del numero que has escribido: ");
            opcion1 = validarmenu(leer, 5);
            System.out.println("Escoge el formato en el que quieres convertir el numero que has escribido: ");
            opcion2 = leer.nextInt();
            if (opcion1 != opcion2) //If para verificar que ambas opciones no sean iguales
                numero = formato.convertidor(opcion1, opcion2, numero); //Backend
            if (numero == "") { //Comienzo del ifelse
                System.out.println("No Te VaLlAs a CanSaR DE EScRiBir >:(");
                System.out.println("Traduccion: Formato de numero invalido");
            } else {
                System.out.println("Resultado: "+numero);
            } //Fin del ifelse
        }//fin del while
        leer.close();
    }//fin del main

    public static int validarmenu(Scanner entrada, int opciones) {  
        int numero = 0;
        boolean entradaValida = false;
        
        while (!entradaValida) {
            try {
                String input = entrada.nextLine(); //Entra el dato
                numero = Integer.parseInt(input); //Si quiero validar un flotante, utilizo el metodo, numero = Float.parseFloat(input); , ademas de trabajar con variables flotantes
                if (numero < opciones+1 && numero > 0) { //Comprueba con las opciones pasadas por parametro para no poner una opcion equivocada
                    entradaValida = true;
                }
                else{
                    System.out.println("Escoja una de las "+opciones+" opciones");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un valor entero valido.\nPresione enter para reiniciar.");
                entrada.nextLine(); //Si no sigue las instrucciones, se le indica al usuario
            }
        }
        
        return numero;
    }

}//fin de la clase principal 
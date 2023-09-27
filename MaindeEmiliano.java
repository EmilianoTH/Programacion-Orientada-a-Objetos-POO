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
        LibreriasdeUnidades format  = new LibreriasdeUnidades(); //Objeto de librerias
        LibreriasdeTemperaturas forma = new LibreriasdeTemperaturas(); //Objeto de librerias
        boolean init1 = true, init2 = true; //Booleanos necesarios
        double unidad = 0; //Variable que utilizara las unidades
        float temperatura = 0; //Variable que utilizara la temperatura
        String sistemas = "", menu = "", op1 = "", op2 = ""; //Variable que utilizara los sistemas

        while (init1) {
            System.out.println("\n\n|---------Conversores---------|");
            System.out.println("|[A] Sistemas [0-1][0-7]      |");
            System.out.println("|[B] Unidades [CM-M][PUL-MIL] |");
            System.out.println("|[C] Temperaturas [C-K][K-F]  |");
            System.out.println("|[D] Salir                    |");
            System.out.println("|-----------------------------|");
            System.out.print("Elije una opcion de la [A-D]: ");
            menu = leer.next();
            switch (menu) {
                case "A": case "a":
                    while (init2) {
                        LibreriapersonaldeEmiliano.MaindeSistemas();
                        System.out.print("Elije una opcion del [1-4] que represente al sistema en el que escribiras el numero: ");
                        op1 = leer.next();
                        if (op1.matches("^[1-5]")) { //Valida que meta una entrada valida, if 1
                            if (Integer.parseInt(op1, 10) != 5) { //Inicio del ifelse 1
                            System.out.print("Elija una opcion del [1-4] que represente al sistema en el que quieres convertir el numero que escribiras: ");
                            op2 = leer.next();
                                if (op2.matches("^[1-5]")){ //Valida que meta una entrada valida, ifelse 2
                                    if (Integer.parseInt(op2, 10) != 5){ //Inicio del ifelse 2
                                        if (Integer.parseInt(op1, 10) != Integer.parseInt(op2, 10)) { //Inicio if 3
                                            System.out.print("Escribe el numero que quieres transformar: ");
                                            sistemas = leer.next();
                                                sistemas = formato.convertidor(Integer.parseInt(op1, 10), Integer.parseInt(op2, 10), sistemas);
                                                if (sistemas == "") { //Le avisa al usuario que el formato de digito no es valido, iflse
                                                    System.out.println("\n\nNo Te VaLlAs a CanSaR DE EScRiBir >:(");
                                                    System.out.println("Traduccion: Formato de numero invalido");
                                                } else { //Si no falla, se le muestra el resultado
                                                    System.out.println("Resultado: "+sistemas);
                                                } //Fin del ifelse 3
                                        } //Fin del if 3
                                    } else {
                                        init2 = false;
                                    } //fin de ifelse 2
                                } //if 2
                            } else {
                                init2 = false;
                            }//Fin del ifelse 1
                        } //Fin de if 1
                    } //Fin del while 
                    init2 = true;
                    break;
                
                case "B": case "b":
                    while (init2) {
                        LibreriapersonaldeEmiliano.MaindeUnidades();
                        System.out.println("Elija una opcion del [1-6] que represente la unidad en el que escribiras el numero: ");
                        op1 = leer.next();
                        if (op1.matches("^[1-7]")) { //Valida que meta una entrada valida, if 1
                            if (Integer.parseInt(op1, 10) != 7) { //Valida que no quiera salirse del menu, Ifelse 1
                                System.out.println("Elija una opcion [1-6] que represente la unidad en el que quieres convertir el numero que escribiras: ");
                                op2 = leer.next();
                                if (op2.matches("^[1-7]")){ //Valida que meta una entrada valida, if 2
                                    if (Integer.parseInt(op2, 10) != 7) { //Valida que no quiera salir del menu, ifelse 2
                                        if (Integer.parseInt(op1, 10) != Integer.parseInt(op2, 10)) {
                                            System.out.println("Escribe el numero que que quieres transformar: ");
                                            try { //Principio del trycatch
                                                unidad = leer.nextDouble();
                                            } catch (Exception e) {
                                                leer.nextLine();
                                                System.out.println("\nERROR\nFormato numerico invalido");
                                            } //Fin del trycatch

                                            if (unidad > 0){ //Valida que ambas opciones no sean iguales y sea positiva, Ifelse 3
                                                format.mostrar(unidad, Integer.parseInt(op1, 10), Integer.parseInt(op2, 10));
                                            } else {
                                                System.out.println("Error\nNo eliga las mismas opciones\nTampoco escriba numeros negativos");
                                            } //Fin del iflse 3
                                        }
                                    } else {
                                        init2 = false;
                                    } //Fin del ifse 2
                                } //Fin del if 2
                            } else {
                                init2 = false;
                            } //Fin del ifelse 1
                        } //Fin del if 1
                    } //Fin del while
                    init2 = true;
                    break;

                case "C": case "c":
                    while (init2) {
                        LibreriapersonaldeEmiliano.MainTemperaturas();
                        System.out.println("Elija una opcion del [1-3] que represente la temperatura en el que escribiras el numero: ");
                        op1 = leer.next();
                        if (op1.matches("^[1-4]")){ //Valida la entrada, if 1
                            if (Integer.parseInt(op1, 10) != 4) { //Valida que no quiera salirse del menu, ifelse 1
                                System.out.println("Elija una opcion del [1-3] que represente la temperatura en la que quieras convertir el numero que escribiras: ");
                                op2 = leer.next();
                                if (op2.matches("^[1-4]")){ //Validar entrada, if 2
                                    if (Integer.parseInt(op2, 10) != 4) { //Valida que no quiera salir del menu, ifelse 2
                                        if (Integer.parseInt(op1, 10) != Integer.parseInt(op2, 10)) {
                                            System.out.println("Escribe el numero que quieres transformar");
                                            try { //Inicio del trycatch
                                                temperatura = leer.nextFloat();
                                            } catch (Exception e) {
                                                System.out.println("\nERROR\nFormato de numero invalido");
                                            } //Fin del trycatch

                                            forma.escribir(Integer.parseInt(op1, 10), Integer.parseInt(op2, 10), temperatura);
                                        }
                                    } else {
                                        init2 = false;
                                    } //Fin del ifelse2
                                } //Fin de if 2
                            } else { 
                                init2 = false;
                            } //Fin del ifelse1
                        } //Fin de if 1
                    } //Fin del while
                    init2 = true;
                    break;

                case "D": case "d":
                        System.out.println("Entendido");
                        init1 = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta\nElije una opcion correcta");
                    break;
            }
        } //Fin del while 1

       leer.close(); //Se debe de cerrar el scanner
    } //Fin del main
} //Fin de la clase
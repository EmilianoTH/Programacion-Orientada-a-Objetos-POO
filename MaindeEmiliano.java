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
        LibreriasdeCalculadora calculadora = new LibreriasdeCalculadora(); //Objeto de librerias
        boolean init1 = true, init2 = true; //Booleanos necesarios
        double unidad = 0, raiz = 0; //Variable que utilizara las unidades
        float temperatura = 0, operabasica1 = 0, operabasica2 = 0; //Variable que utilizara la temperatura
        String sistemas = "", menu = "", op1 = "", op2 = ""; //Variable que utilizara los sistemas

        while (init1) {
            System.out.println("\n\n|---------Conversores---------|");
            System.out.println("|[A] Sistemas [0-1][0-7]      |");
            System.out.println("|[B] Unidades [CM-M][PUL-MIL] |");
            System.out.println("|[C] Temperaturas [C-K][K-F]  |");
            System.out.println("|[D] Calculadora Basica [SUM] |");
            System.out.println("|[E] Salir                    |");
            System.out.println("|-----------------------------|");
            System.out.print("Elije una opcion de la [A-E]: ");
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
                                        if (Integer.parseInt(op1, 10) != Integer.parseInt(op2, 10)) { //Inicio ifelse 3
                                            System.out.print("Escribe el numero que quieres transformar: ");
                                            sistemas = leer.next();
                                                sistemas = formato.convertidor(Integer.parseInt(op1, 10), Integer.parseInt(op2, 10), sistemas); //Metodo de libreria
                                                if (sistemas == "") { //Le avisa al usuario que el formato de digito no es valido, iflse 4
                                                    System.out.println("\n\nNo Te VaLlAs a CanSaR DE EScRiBir >:(");
                                                    System.out.println("Traduccion: Formato de numero invalido");
                                                } else { //Si no falla, se le muestra el resultado
                                                    System.out.println("Resultado: "+sistemas);
                                                } //Fin del ifelse 4
                                        } else {
                                            System.out.println("Error\nNo elija las mismas opciones"); //Notificarle al error su usuario
                                        } //Fin del ifelse 3
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
                                        if (Integer.parseInt(op1, 10) != Integer.parseInt(op2, 10)) { //Inicio del ifelse 3
                                            System.out.println("Escribe el numero que que quieres transformar: ");
                                            try { //Principio del trycatch
                                                unidad = leer.nextDouble();
                                            } catch (Exception e) {
                                                leer.nextLine();
                                                System.out.println("\nERROR\nFormato numerico invalido");
                                            } //Fin del trycatch

                                            if (unidad > 0){ //Valida que ambas opciones no sean iguales y sea positiva, Ifelse 3
                                                format.mostrar(unidad, Integer.parseInt(op1, 10), Integer.parseInt(op2, 10)); //Metodo de libreria
                                            } else {
                                                System.out.println("Error\nNo escriba letras ni tampoco escriba numeros negativos");
                                            } //Fin del iflse 4
                                        } else {
                                            System.out.println("Error\nNo elija las mismas opciones"); //Notificarle al error su usuario
                                        } //Fin del ifelse3
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
                                        if (Integer.parseInt(op1, 10) != Integer.parseInt(op2, 10)) { //Inicio del ifelse 3
                                            System.out.println("Escribe el numero que quieres transformar");
                                            try { //Inicio del trycatch
                                                temperatura = leer.nextFloat();
                                            } catch (Exception e) {
                                                System.out.println("\nERROR\nFormato de numero invalido");
                                            } //Fin del trycatch

                                            forma.escribir(Integer.parseInt(op1, 10), Integer.parseInt(op2, 10), temperatura); //Metodo de libreria
                                        } else {
                                            System.out.println("Error\nNo elija las mismas opciones"); //Notificarle al error su usuario
                                        } //Fin del ifelse 3
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
                    while (init2) {
                        LibreriapersonaldeEmiliano.Maincalculadora();
                        System.out.println("|Numero guardado de tu ultima operacion:");
                        System.out.println("|------------------------------------------|");
                        System.out.println("\nElija una opcion del [1-5] que represente la operacion que quiere realizar");
                        op1 = leer.next();
                        switch (op1) {
                            case "1": case "2": case "3": case "4":
                                if (Integer.parseInt(op1, 10) == 1) //If que verifique que quiere sumar
                                    System.out.println("Escribe ambos numeros que quieres sumar: ");
                                if (Integer.parseInt(op1, 10) == 2) //If que verifique que quiere restar
                                    System.out.println("Escribe ambos numeros que quieres restar: ");
                                if (Integer.parseInt(op1, 10) == 3) //If que verifique que quiere multiplicar
                                    System.out.println("Escribe ambos numeros que quieres multiplicar");
                                if (Integer.parseInt(op1, 10) == 4) //If que verifique que quiere dividir
                                    System.out.println("Escribe primero el dividendo (Numero que va dentro de la casita)\nEscribe despues el divisor (Numero que va fuera de la casita)");

                                    System.out.println("\n\nEscribe 1 si quieres trabajar con el numero guardado\nEscribe 2 si quieres trabajar con datos nuevos");
                                    op2 = leer.next();
                                    if (op2.matches("^[12]")) { //Valida que meta una opcion correcta, if 1
                                        if (Integer.parseInt(op2, 10) == 1) { //Valida que quiere trabajar con el numero guardado, if 2
                                            try { //Principio del trycatch
                                                operabasica2 = leer.nextFloat();
                                                if (operabasica2 >= 0 || operabasica2 <= 0) {
                                                    if (Integer.parseInt(op1, 10) == 1) //If que verifique que quiere sumar
                                                        guardar = calculadora.mostrarsuma(guardar, operabasica2);
                                                    if (Integer.parseInt(op1, 10) == 2) //If que verifique que quiere restar
                                                        guardar = calculadora.mostraresta(guardar, operabasica2);
                                                    if (Integer.parseInt(op1, 10) == 3) //If que verifique que quiere multiplicar
                                                        guardar = calculadora.mostrarmulti(guardar, operabasica2);
                                                }
                                                if (operabasica2 != 0) { //If que prohiba dividir entre 0, ifelse 1
                                                        guardar = calculadora.mostrardivision(guardar, operabasica2);
                                                } else {
                                                    System.out.println("No introduzca el numero 0");
                                                } //Fin de ifelse 1
                                            } catch (Exception e) {
                                                System.out.println("ERROR\nEscriba un numero valido"); 
                                            } //Fin del trycatch
                                        } //Fin de if 2
                                        if (Integer.parseInt(op2,10) == 2) { //Valida que quiera trabajar sin el numero guardado, if 3
                                            try { //Principio del trycatch
                                                operabasica1 = leer.nextFloat();
                                                operabasica2 = leer.nextFloat();
                                                if ((operabasica2 >= 0 || operabasica2 <= 0) || (operabasica1 >= 0 || operabasica1 <= 0)) {
                                                    if (Integer.parseInt(op1, 10) == 1) //If que verifique que quiere sumar
                                                        guardar = calculadora.mostrarsuma(operabasica1, operabasica2);
                                                    if (Integer.parseInt(op1, 10) == 2) //If que verifique que quiere restar
                                                        guardar = calculadora.mostraresta(operabasica1, operabasica2);
                                                    if (Integer.parseInt(op1, 10) == 3) //If que verifique que quiere multiplicar
                                                        guardar = calculadora.mostrarmulti(operabasica1, operabasica2);
                                                }
                                                if (operabasica2 != 0) { //If que prohiba dividir entre 0, ifelse 2
                                                        guardar = calculadora.mostrardivision(operabasica1, operabasica2);
                                                } else {
                                                    System.out.println("No introduzca el numero 0");
                                                } //Fin de ifelse 2
                                            } catch (Exception e) {
                                                System.out.println("ERROR\nEscriba un numero valido"); 
                                            } //Fin del trycatch
                                        } //Fin del if
                                    }//Fin  de if 1

                                break;
                            
                            case "5":
                                System.out.println("\n\nEscribe el numero 1 para trabajar con el numero que has guardado\nEscribe el numero 2 para trabajar con numeros reiniciados"); //Validar
                                op2 = leer.next();
                                if (op2.matches("^[12]")) { //Validar que no meta letras, if 1
                                    if (Integer.parseInt(op2, 10) == 1) { //If 2
                                        System.out.println("Escribe el numero al que le quieres sacar la raiz cuadrada");
                                        if (guardar2 >0) { //If 3
                                            guardar2 = calculadora.mostrarraiz(guardar2);
                                        } //Fin del if 3
                                    } //Fin del if 2
                                    if (init2) {
                                        
                                    }
                                } // Fin del if 1

                                break;

                            case "6":
                                init2 = false;
                                break;
                            default:
                                System.out.println("Error\nElija una opcion correcta");
                                break;
                        } //Fin del switch secundario
                    } //Fin del while
                    init2 = true;
                    break;

                case "E": case "e":
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
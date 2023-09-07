import java.util.Scanner;

public class Librerias {

    /* Metodos */

    /**
     * 
     * @param entrada Dato que mete el usuario, que sera validado
     * @return Retorna el valor decimal
     */
    public int decidirformato(String entrada, Scanner leer){
        int decimal = 0, opcion = 0;

        System.out.println("Presione 1 si introdujo un dato decimal\nSi no es asi, presione cualquier tecla");
        opcion = leer.nextInt();
        if (opcion == 1) {
            //Se asegura que sea decimal
            decimal = Integer.parseInt(entrada, 10);
        }
        else {
            //Identificar el formato de la entrada con una serie de if
            if (entrada.matches("^[01]+")) { //entrada.matches ("^[01]+") marca el rango esperado que se busca en la funcion
            // Si contiene 0 y 1 solamente es binario
            decimal = convertirBinarioaDecimal(entrada);

            } else if (entrada.matches("^[0-7]+")) {
            // Si contiene solo dígitos del 0 al 7 es octal
            decimal = convertirOctalaDecimal(entrada);

            } else if (entrada.matches("^[0-9A-Fa-f]+")) {
            // Si contiene dígitos y letras de A a F es hexadecimal
            decimal = convertirHexadecimalaDecimal(entrada);

            } else {
            // Si no cumple ninguno de los patrones anteriores, se asume que es decimal
            decimal = Integer.parseInt(entrada, 10);
            }   
        }

        return decimal;
    }

    /**
     * 
     * @param binario Dato que ya sabemos que es binario, el cual lo transformaremos en decimal
     * @return Dato binario transformado
     */
    public int convertirBinarioaDecimal(String binario){
        int decimal = 0; //Variable que retornaremos
        int longitud = binario.length(); //Sacamos la longitud con el tamaño del string
        for (int i = 0; i < longitud; i++) { //Usamos un for para recorrer el string, al cabo un string es un arreglo de caracteres
            char digito = binario.charAt(i); //Conseguimos las posiciones una por una del string
            int valor = Character.getNumericValue(digito); //Al ser un char, debemos convertirlo a int
            decimal += valor * Math.pow(2, longitud - i - 1); //Hacemos la formula de binario a decimal
        }
        return decimal;
    }

    /**
     * 
     * @param octal Dato que ya sabemos que es octal, el cual lo transformaremos en decimal
     * @return Dato octal transformado
     */
    public int convertirOctalaDecimal(String octal){
    int decimal = 0; // Inicializamos el número decimal en cero
    int base = 1; // Inicializamos la base en 1, que es la potencia de 8^0

    // Recorremos la cadena octal de derecha a izquierda
    for (int i = octal.length() - 1; i >= 0; i--) {
        char digit = octal.charAt(i); // Obtenemos el dígito en la posición actual
        int digitValue = digit - '0'; // Convertimos el carácter en un valor numérico

        // Multiplicamos el valor del dígito por la potencia de 8 apropiada y lo sumamos al número decimal
        decimal += digitValue * base;

        // Actualizamos la base multiplicándola por 8 para la siguiente posición
        base *= 8;
    }
        return decimal;
    }

    /**
     * 
     * @param Hexadecimal Dato que ya sabemos que es hexadecimal, el cual lo transformaremos en decimal
     * @return Dato hexadecimal transformado
     */
    public int convertirHexadecimalaDecimal(String Hexadecimal){
        int decimal = 0, base = 1;

        // Recorremos la cadena hexadecimal de derecha a izquierda
        for (int i = Hexadecimal.length() - 1; i >= 0; i--) {
            char digit = Hexadecimal.charAt(i); //Obtenemos el dígito en la posición actual de la cadena.

            // Verificamos si el carácter es una letra (A-F) y lo convertimos a un valor numérico
            int digitValue;
            if (Character.isDigit(digit)) {
                digitValue = digit - '0'; // Si es un dígito (0-9), simplemente restamos el valor ASCII de '0'
            } else {
                // Si es una letra (A-F), sumamos 10 para obtener el valor correcto (A=10, B=11, ..., F=15)
                digitValue = digit - 'A' + 10;
            }
            // Multiplicamos el valor del dígito por la potencia de 16 adecuada y lo sumamos al número decimal
            decimal += digitValue * base;
            // Actualizamos la base multiplicándola por 16 para la siguiente posición
            base *= 16;
        }

        return decimal;
    }
}
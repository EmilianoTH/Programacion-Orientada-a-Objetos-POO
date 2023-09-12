/* Emiliano De La Torre Hernandez
 * Mariana Midory Iniguez Rodriguez
 * Angel Eduardo Munoz Perez 
 * 07-09-2023
 * Librerias(cambia el nombre como lo tengas)
 * Centro Universitario de los Altos | Universidad de Guadalajara
 * Ingenieria en computacion
 * Profesor: Sergio Franco Casillas
 * Descripcion: este es un apoyo al codigo conversor, que aqui, estan las librerias
 */

public class Librerias {
    /* Metodos */
    /** 
     * @param entrada Dato que introduce el usuario, que será validado
     * @return Retorna el valor decimal
     */
    public String convertidor(int opcion1, int opcion2, String numero){
        int decimal = 0;
        String kk = ""; //Variabler de Midory (kk)
        //Valida el formato del numero que entra para transformarlo en decimal con ifs en cada caso
        switch (opcion1) {
            case 1:
            if (numero.matches("^[01]+")) //entrada.matches ("^[01]+") marca el rango esperado que se busca en la funcion
                decimal = convertirBinarioaDecimal(numero);
                break;

            case 2:
            if (numero.matches("^[0-7]+"))
                decimal = convertirOctalaDecimal(numero);
                break;

            case 3:
            if (numero.matches("^[0-9]+"))
                decimal = Integer.parseInt(numero, 10);
                break;

            case 4:
            if (numero.matches("^[0-9A-Fa-f]+"))
                decimal = convertirHexadecimalaDecimal(numero);
                break;
        
            default:
                break;
        }//Fin del Switch
        
    //Transforma el numero decimal que es el formato general, al tipo de dato que quiere el usuario
        switch (opcion2) {
            case 1:
                kk = decimalABinario(decimal);
                break;
            
            case 2:
                kk = decimalAOctal(decimal);
                break;

            case 3:
                kk = Integer.toString(decimal);
                break;

            case 4:
                kk = decimalAHexadecimal(decimal);
                break;

            default:
                break;
        }//Fin del Switch 2
        if (opcion1 > 4 && opcion2 > 4) { //If que valida las opciones solicitadas
            kk = "";
        }

        return kk;
    }//fin de la clase convertidor

    /**
     * @param binario Dato que ya sabemos que es binario, el cual lo transformaremos en decimal
     * @return Dato binario transformado
     */
    private int convertirBinarioaDecimal(String binario){
        int decimal = 0; //Variable que retornaremos
        int longitud = binario.length(); //Sacamos la longitud con el tamaño del string
        for (int i = 0; i < longitud; i++) { //Usamos un for para recorrer el string, al cabo un string es un arreglo de caracteres
            char digito = binario.charAt(i); //Conseguimos las posiciones una por una del string
            int valor = Character.getNumericValue(digito); //Al ser un char, debemos convertirlo a int
            decimal += valor * Math.pow(2, longitud - i - 1); //Hacemos la formula de binario a decimal
        }//fin del for
        return decimal;
    }//fin de la clase de convertir a binario a decimal

    /**
     * @param octal Dato que ya sabemos que es octal, el cual lo transformaremos en decimal
     * @return Dato octal transformado
     */
    private int convertirOctalaDecimal(String octal){
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
    }//fin del for
        return decimal;
    }//fin de convertir octal a decimal

    /**
     * @param Hexadecimal Dato que ya sabemos que es hexadecimal, el cual lo transformaremos en decimal
     * @return Dato hexadecimal transformado
     */
    private int convertirHexadecimalaDecimal(String Hexadecimal){
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
        }//fin del for

        return decimal;
    }//fin de convertir a hexadecimal a decimal

    /*
     * tranforma de valor decimal a dato binario y retorna el valor a binario
     */
    private String decimalABinario(int decimal){
        String binario="";//variable de modo string para que el parametro sea mayor 
        //mientras el valor binario introducido sea mayor a 0, debera de dividirlo entre dos hasta que 
        //el valor termine en 0 o mas cercano
        while (decimal > 0) {
            binario = decimal % 2 + binario;
            decimal = decimal / 2;
        }//fin del while
        return binario;//retorna el valor
    }//fin de convertir decimal a binario

    /*
     * transforma de valor decimal a valor octal y retorna el valor a binario
     */
    private String decimalAOctal(int decimal){
        int residuo;
        String octal = "";
        char[] caracteresOctales = {'0','1','2','3','4','5','6','7'};//especificacion de que debe regresar
        //mientras decimal sea mayor a 0, este debera de dividirlo entre ocho hasta que llegue a 0 o el
        //valor mas menor 
        while (decimal > 0) {
            residuo = decimal % 8;//el residuo sale del operador
            char caracter = caracteresOctales[residuo];//el caracter sera dado por lo que salga del residuo
            octal = caracter + octal;
            decimal = decimal / 8;
        }//fin del while
        return octal;//retorna el valor
    }//fin de convertir decimal a binario

    /*
     * trasforma de valor decimal a valor hexadecimal y retorna el valor a binario
     */
    private String decimalAHexadecimal(int decimal){
        int residuo;
        String hexadecimal = "";
        char[]caracteresHexadecimal = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        //mientras decimal sea mayor a 0, este debera de dividirlo entre 16 hasta que el valor sea 0
        //o el valor mas menor
        while (decimal > 0) {
            residuo = decimal % 16;
            char caracterHexadecimal = caracteresHexadecimal[residuo];//el valor sera dado por lo que salga del residuo
            hexadecimal = caracterHexadecimal + hexadecimal;
            decimal = decimal / 16;
        }//fin del while
        return hexadecimal;
    }//fin de convertir decimal a hexadecimal

    //deberiamos poner de... al reves, me explico, de hexadecimal a decimal? 
}//fin de la clase mayor
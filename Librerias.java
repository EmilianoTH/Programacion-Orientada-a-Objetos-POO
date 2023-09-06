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
        return Integer.parseInt(octal, 8);
        /**
         * En esta funcion usamos el metodo Integer parseint para transformar el string a int decimal
         * El primer dato debe ser el string que transformaremos
         * El numero indica la base, en este caso es 8 porque el octal es de 0 - 7
         * Si la base fuera 2, se hablaria de binario, ya que es 0 - 1
         * Si la base fuera 10, se hablaria de decimal, ya que es 0 - 9
         */
    }

    /**
     * 
     * @param Hexadecimal Dato que ya sabemos que es hexadecimal, el cual lo transformaremos en decimal
     * @return Dato hexadecimal transformado
     */
    public int convertirHexadecimalaDecimal(String Hexadecimal){
        return Integer.parseInt(Hexadecimal, 16);
        /**
         * En esta funcion usamos el metodo Integer parseint para transformar el string a int
         * El primer dato debe ser el string que transformaremos
         * El numero indica la base, en este caso es 16 porque el hexadecimal es de 0 - 9 y de A - F
         */
    }
}
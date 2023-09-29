/* Emiliano De La Torre Hernandez
 * Mariana Midory Iniguez Rodriguez
 * Angel Eduardo Munoz Perez 
 * 28-09-2023
 * Librerias de temperaturas
 * Centro Universitario de los Altos | Universidad de Guadalajara
 * Ingenieria en computacion
 * Profesor: Sergio Franco Casillas
 * Descripcion: convierte el ingreso del valor a la temperatura que tu hayas elegido
 */

public class LibreriasdeCalculadora {
    /* Metodos */

    /**
     * 
     * @param num1 Numero a sumar
     * @param num2 Numero a sumar
     * @return Retornar la suma de ambos numeros
     */
    private float suma(float num1, float num2){
        return num1+num2;
    }

    /**
     * 
     * @param num1 Numero a restar
     * @param num2 Numero a restar
     * @return Retornar la resta de ambos numeros
     */
    private float resta(float num1, float num2){
        return num1-num2;
    }
    
    /**
     * 
     * @param num1 Numero a multiplicar
     * @param num2 Numero a multiplicar
     * @return Retornar la multiplicacion de ambos numeros
     */
    private float multi(float num1, float num2){
        return num1*num2;
    }

    /**
     * 
     * @param num1 Dividendo
     * @param num2 Divisor
     * @return Retornar la division de ambos numeros
     */
    private float division(float num1, float num2){
        return num1/num2;
    }

    /**
     * 
     * @param num Numero a sacar la raiz cuadrada
     * @return Retornar raiz cuadrada
     */
    private double raiz(double num){
        return Math.sqrt(num);
    }
    
    /**
     * 
     * @param num1 Numero a sumar
     * @param num2 Numero a sumar
     */
    public void mostrarsuma(float num1, float num2){
        float resultado = 0;
        resultado = suma(num1, num2);
        System.out.println("El resultado de tu suma es: "+resultado);
    }
}
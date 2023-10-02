/* Emiliano De La Torre Hernandez
 * Mariana Midory Iniguez Rodriguez
 * Angel Eduardo Munoz Perez 
 * 28-09-2023
 * Librerias de Calculadora
 * Centro Universitario de los Altos | Universidad de Guadalajara
 * Ingenieria en computacion
 * Profesor: Sergio Franco Casillas
 * Descripcion: convierte el ingreso del valor a la temperatura que tu hayas elegido
 */
public class LibreriasdeCalculadora {
    /* Atributos */
    float guardar = 0;
    double guardar2 = 0;

    /* Metodos */
    /**
     * @param num1 Numero a sumar
     * @param num2 Numero a sumar
     * @return Retornar la suma de ambos numeros
     */
    private float suma(float num1, float num2){
        return num1+num2;
    }//fin de la clase privada de la suma

    /**
     * @param num1 Numero a restar
     * @param num2 Numero a restar
     * @return Retornar la resta de ambos numeros
     */
    private float resta(float num1, float num2){
        return num1-num2;
    }//de la clase privada de la resta
    
    /**
     * @param num1 Numero a multiplicar
     * @param num2 Numero a multiplicar
     * @return Retornar la multiplicacion de ambos numeros
     */
    private float multi(float num1, float num2){
        return num1*num2;
    }//fin de la clase privada de la multiplicacion

    /**
     * @param num1 Dividendo
     * @param num2 Divisor
     * @return Retornar la division de ambos numeros
     */
    private float division(float num1, float num2){
        return num1/num2;
    }//fin de la clase privada de la division

    /**
     * @param num Numero a sacar la raiz cuadrada
     * @return Retornar raiz cuadrada
     */
    private double raiz(double num){
        return Math.sqrt(num);
    }//fin de la clase privada de la raiz 
    
    /**
     * @param num1 Numero a sumar
     * @param num2 Numero a sumar
     */
    public float mostrarsuma(float num1, float num2){
        float resultado = 0;
        resultado = suma(num1, num2);
        System.out.println("El resultado de tu suma es: "+resultado);
        guardar = resultado;
        return guardar;
    }//fin de la clase mostrar suma 

    /**
     * @param num1 Primer numero a restar 
     * @param num2 Segundo numero a restar 
     */
    public float mostraresta (float num1, float num2){
        float resultado = 0;
        resultado = resta(num1, num2);
        System.out.println("El resultado de la resta es: "+resultado);
        guardar = resultado;
        return guardar;
    }//fin de la clase mostrar resta

    /**
     * @param num1 Primer numero a multiplicacion
     * @param num2 Segundo numero a multiplicacion
     */
    public float mostrarmulti(float num1, float num2){
        float resultado = 0;
        resultado = multi(num1, num2);
        System.out.println("El resultado de la multiplicacion es: "+resultado);
        guardar = resultado;
        return guardar;
    }//fin de la clase mostrar multiplicacion

    /**
     * @param num1 Primer numero a dividir
     * @param num2 Segundo numero a dividir
     */
    public float mostrardivision(float num1, float num2){
        float resultado = 0;
        resultado = division(num1, num2);
        System.out.println("El resultado de la division es: "+resultado);
        guardar = resultado;
        return guardar;
    }//fin de a clase mostrar division

    /**
     * @param num Numero a sacar raiz 
     */
    public double mostrarraiz(double num){
        double resultado = 0;
        resultado = raiz(num);
        System.out.println("El resultado de la raiz es: "+resultado);
        guardar2 = resultado;
        return guardar;
    }//fin de la clase mostrar raiz 
}//fin de la clase principal 

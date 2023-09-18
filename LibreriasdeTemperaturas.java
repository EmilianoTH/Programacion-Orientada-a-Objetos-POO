/* Emiliano De La Torre Hernandez
 * Mariana Midory Iniguez Rodriguez
 * Angel Eduardo Munoz Perez 
 * 16-09-2023
 * Librerias de temperaturas
 * Centro Universitario de los Altos | Universidad de Guadalajara
 * Ingenieria en computacion
 * Profesor: Sergio Franco Casillas
 * Descripcion: convierte el ingreso del valor a la temperatura que tu hayas elegido
 */


public class LibreriasdeTemperaturas {
    /**
     * 
     * @param opc1 varible usada para trabajar en otros metodos
     * @param opc2  varible usada para trabajar en otros metodos
     * @param numero la varible con la que se va a trasnformar 
     */
    public void escribir(int opc1, int opc2, float numero){
        float mostrar = Transformador(opc1, opc2, numero); 
        System.out.println("El resultado es: "+mostrar);
    }//FIN DE FUNCION ESCRIBIR
    //funcion que transforma una unidad a otra, ingresando un dato, transformandolo a Celcius (SWITCH 1)
    private float Transformador (int opc1, int opc2, float numero){
        switch (opc1){
            case 1://de kelvin a celsius
                numero -= 273.15; 
                break;
            case 2://de fahrenheit a celsius
                numero = (numero-32f) / 1.8f; 
                //En java, si se trabaja con Flotantes, debe usar una f despues de los numeros que haran una operacion
                //Con tu flotante
                break;
            default:
                break;
        }//fin del switch 1
        //verifica si la opcion pedida es igual a Celsius (ambos parametros)
        if (opc1 != 3 && opc2 == 3) {
            return numero;
        }//fin del if
        //si no es igual, entonces llama la segunda clase
        else{
            numero = SegundoTransformador(opc2, numero);
            return numero;
        }//fin del else
    }//FIN DE FUNCION TRANSFORMADORA
    //y despues este Celsius transformarlo a la unidad deseada (SWITCH 2)
    private float SegundoTransformador (int opc2, float numero){
            switch (opc2){
            case 1://de celsius a kelvin
                numero += 273.15; 
                break;
            case 2://de celsius a fahrenheit
                numero = (numero*1.8f) + 32f;
                break;
            default:
                break;
        }//fin del switch
        return numero;
    }//Fin de la segunda transformacion 
}//fin de la clase principal

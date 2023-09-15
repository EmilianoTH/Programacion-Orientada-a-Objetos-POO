/**ANGEL EDUARDO MUÑOZ PEREZ
 *Programacion orientada a objetos_ CUALTOS
 * -----TRAMSFORMADOR DE UNIDADES DE TEMPERATURA----
 */

//funcion para escirbir el resultado en pantalla
public class LibreriasTemperatura {

    public static void escribir(int opc1, int opc2, float numero){
        float mostrar = Transformador(opc1, opc2, numero); //Al llamar una funcion, no necesitar poner que tipo de dato es Muñoz
        System.out.println("el resultado es: "+mostrar);
    }//FIN DE FUNCION ESCRIBIR
    
//funcion que tramsforma una unidad a otra, ingresando un dato, tramsformandolo a celcius (SWITCH 1)
//y despues este celsius tramsformarlo a la unidad deseada    (SWITCH 2)
    private static float Transformador (int opc1, int opc2, float numero){
        switch (opc1){
            case 1://de kelvin a celsius
                numero += 273.15; 
                break;
            case 2://de fahrenheit a celsius
                numero = (numero-32f) * 1.8f; //En java, si se trabaja con Flotantes, debe usar una f despues de los numeros que haran una operacion
                //Con tu flotante
                break;
            case 3://DE CELSIUS A CELSIUS XD
                numero = numero; //Esto es redundancia, mejor borra este caso y usa un if
                break;
            default:
                System.out.println("opcion no valida, vuelvelo a intentar");
                break;
        }//fin del switch 1
        
        switch (opc2){
            case 1://de celsius a kelvin
                numero -= 273.15; 
                break;
            case 2://de celsius a fahrenheit
                numero = (numero*1.8f) + 32f;
                break;
            case 3://DE CELSIUS A CELSIUS XD
                numero = numero; //Esto es redundancia, mejor borra este caso y usa un if
                break;
            default:
                System.out.println("opcion no valida, vuelvelo a intentar");
                break;
        }//fin del switch 2
        return numero;
    }//FIN DE FUNCION TRAMSFORMADORA
}//FIN DE LA CLASE

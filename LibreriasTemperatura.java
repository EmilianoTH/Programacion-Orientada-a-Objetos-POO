/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libreriastemperatura;

/**ANGEL EDUARDO MUÑOZ PEREZ
 *Programacion orientada a objetos_ CUALTOS
 * -----TRAMSFORMADOR DE UNIDADES DE TEMPERATURA----
 */

//funcion para escirbir el resultado en pantalla
public class LibreriasTemperatura {

    public static void escribir(int opc1, int opc2, float numero){
        float mostrar = Tramsformador(int opc1, int opc2, float numero);
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
                numero = (numero-32) * 1.8;
                break;
            case 3://DE CELSIUS A CELSIUS XD
                numero = numero;
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
                numero = (numero*1.8) + 32;
                break;
            case 3://DE CELSIUS A CELSIUS XD
                numero = numero;
                break;
            default:
                System.out.println("opcion no valida, vuelvelo a intentar");
                break;
        }//fin del switch 2
        return numero;
    }//FIN DE FUNCION TRAMSFORMADORA
}//FIN DE LA CLASE

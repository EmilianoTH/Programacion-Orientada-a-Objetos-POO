/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreriastemperatura; //En visual, este paquete no es necesario si estamos en git
import java.util.Scanner;
/**Angel Eduardo Muñoz Perez
 *PRogramacion estructurada_ Cualtos
 * -----MENU PARA TEMPERATURAS
 */
public class MenuDeTemperatura {
    
    public static void MenuT(string[] args){ //El tipo de dato string es con S mayuscula, es "String", no "string"
    Scanner entrada = new Scanner(System.in);    
    int opc1= 0; 
    int opc2= 0;
    float numero; //Te saltara una advertencia si no le das un valor minimo a una variable, intenta aunque sea igualarla a 0
    
    
    //validamos que no quiera tramsformar a lo mismo
    while (opc1 == opc2){ /* Esa validacion esta mal Muñoz, echale un ojo */
        
    System.out.println("|°¬°¬°¬°¬MENU°¬°¬°¬°|");
    System.out.println("|    | UNIDADES     |");
    System.out.println("|[1] | Kelvin°      |");
    System.out.println("|[2] | Fahrenheit   |");
    System.out.println("|[3] | Celsius      |");
    System.out.println("|=-=-=-=-=-=-=-=-=-=|");
    
    //Pedimos que ingrese las unidades que desee tramsformar
    System.out.println("Digite el sistema que quiere convertir: ");
    opc1 = entrada.nextInt();
    System.out.println("Escriba el grado que quieres convertir: ");
    numero = entrada.nextFloat();
    System.out.println("Escriba el sistema al que lo quiera convertir: ");
    opc2 = entrada.nextInt();
    }//INVOCAMOS EL TRAMSFORMADOR
        LibreriasTemperatura.escribir(opc1, opc2, numero);
    }//fin del if validacion
    /* No tienes ningun if de validacion */
    
    }//FIN DEL MENU///////////
}//FIN DE LA CLASE////////////
//Tienes una llave que sobra Muñoz
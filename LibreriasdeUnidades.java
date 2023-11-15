package libreriasdeunidades;

/**
 *
 * @author Emiliano de la Torre Hernandez
 */
public class LibreriasdeUnidades1 {
    /* Metodos */
    /**
     * 
     * @param numero Numero double que sera transformado
     * @param opcion1 Tipo de unidad en la que se metio el numero
     * @param opcion2 Tipo de unidad a la que quiere ser transformado
     */
    public void mostrar(double numero, int opcion1, int opcion2){
        double mostrar = Unidadgeneral(opcion1, opcion2, numero);
        System.out.print("Tu numero es: "+mostrar);
    }

    /**
     * 
     * @param numero Numero double que sera transformado
     * @param opcion1 Tipo de unidad en la que se metio el numero
     * @param opcion2 Tipo de unidad a la que quiere ser transformado
     * @return Numero ya transformado
     */
    public double Unidadgeneral(int opcion1, int opcion2, double numero){
        switch (opcion1) { //Switch 1
            case 1:
                numero = numero*(0.01); //Centimetro a metro
                break;

            case 2:
                numero = numero*(0.0254); //Pulgada a metro
                break;

            case 3:
                numero = numero*(0.9144); //Yardas a metros
                break;
            case 5:
                numero = numero*(1000); //KM a metro
                break;
            
            case 6:
                numero = numero*(1609.34); //Milla a metro
                break;
            default:
                break;
        } //Fin del switch 1
        if (opcion1 != 4 && opcion2 == 4) { //Por si quiere transformar a metros, es nuestra variable general, no es necesaria pasarla
            return numero;
        }
        else{ //Llamamos a otra funcion
            numero = Conversionadestino(opcion2, numero);
            return numero;
        }
    }
    /**
     * 
     * @param opcion2 Tipo de unidad que se transformara
     * @param numero numero ya transformado a la medida general que es metros
     * @return Numero ya transformado en el resultado
     */
    private double Conversionadestino(int opcion2, double numero){
         switch (opcion2) {
            case 1:
                numero = numero*(100); //Metros a centimetros
                break;
            
            case 2: 
                numero = numero*(39.3701); //Metros a pulgadas
                break;

            case 3:
                numero = numero*(1.09361); //Metros a yardas
                break;

            case 5:
                numero = numero*(0.001); //Metros a KM
                break;

            case 6:
                numero = numero*(0.000621371); //Metros a Millas
                break;

            default:
                break;
        }

        return numero;
    } //Fin de metodo
} //Fin de clase
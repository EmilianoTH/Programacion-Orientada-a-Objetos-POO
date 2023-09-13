public class LibreriasdeUnidades { 

    public double Decualunidadacual(int opcion1, int opcion2, double numero){
        switch (opcion1) {
            case 1:
                numero = numero*(0.01); //Centimetro a metro
                break;

            case 2:
                numero = numero*(0.0254); //Pulgada a metro
                break;

            case 3:
                numero = numero*(0.9144); //Yardas a metros
                break;
            //case 4 seran los metros, y como igualamos todo a metro, pues no es necesario ponerlo
            case 5:
                numero = numero*(1000); //KM a metro
                break;
            
            case 6:
                numero = numero*(1609.34); //Milla a metro
                break;
            default:
                break;
        }

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
            //Case 4 seran los metros, ya explique el porque en el primer switch

            case 5:
                numero = numero*(0.001);
                break;

            case 6:
                numero = numero*(0.000621371);
                break;

            default:
                break;
        }

        return numero;
    }
/* Necesita arreglos */
    public static boolean validarDouble(double valor) {
        try {
            // Intentamos convertir el valor a double
            double resultado = Double.parseDouble(Double.toString(valor));
    
            // Si no se produce ninguna excepción, el valor es válido
            return true;
        } catch (NumberFormatException e) {
            // Si se produce una excepción, el valor no es válido
            return false;
        }
    }
}
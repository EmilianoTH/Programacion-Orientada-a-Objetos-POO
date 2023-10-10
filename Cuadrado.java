package fg;

/**
 *
 * @author Emiliano
 */
public class Cuadrado extends Figurasgeometricas{
    /* Constructores */
    public Cuadrado(){
        super.setSide1(0);
    }
    
    public Cuadrado(float x){
        super.setSide1(x);
    }
    
    /* Metodos */
    @Override
    public float getPerimeter() {
        return super.getside1()*4;
    }

    @Override
    public float getArea() {
        return super.getside1() * super.getside1();
    }
    
} //Clase cuadrado fin
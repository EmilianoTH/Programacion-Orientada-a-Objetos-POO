
/**
 * @author Emiliano
 */
public class Trianguloequilatero extends Figurasgeometricas{
    public Trianguloequilatero(){
        super.setSide1();
    }

    @Override
    public float getPerimeter() {
        return (float) (Math.PI * (super.getSide1()*2));
    }//fin del clase 

    @Override
    public float getArea() {
        return (float) (Math.PI * (super.getSide1()* (super.getSide1())));
    }//fin de la clase de area
} //Fin de clase
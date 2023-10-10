package fg;

/**
 *
 * @author Emiliano
 */
public class Rectangulo extends Cuadrado{
    private float altura;
    
    /* Constructores */
    public Rectangulo(){
        super.setSide1(0);
        this.altura = 0;
    }
    
    public Rectangulo(float x, float y){
        super.setSide1(x);
        this.altura = y;
    }
    
    /* Set y get */
    public void setaltura(float x){
        this.altura = x;
    }
    
    private float getaltura(){
        return this.altura;
    }
    
    /* Metodos */
    @Override
    public float getPerimeter() {
        return (super.getside1()+getaltura())*2;
    }

    @Override
    public float getArea() {
        return super.getside1()*getaltura();
    }
} //Fin de clase rectangulo

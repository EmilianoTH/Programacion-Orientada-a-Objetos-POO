package fg;

/**
 *
 * @author Emiliano
 */
public class TrianguloEquilatero extends Figurasgeometricas{
    private float altura; //Atributo necesario
    
    /* Constructores */
    public TrianguloEquilatero(){
        super.setSide1(0); //Atributo de base
        this.altura = 0; //Atributo de altura
    }
    
    /**
     * 
     * @param x Atributo que pondra el usuario de la base
     * @param y Atributo que pondra el usuario de la altura
     */
    public TrianguloEquilatero(float x, float y){
        super.setSide1(x); 
        this.altura = y; 
    }
    
    /* Set y get */
    /**
     * 
     * @param x Altura del triangulo
     */
    public void setaltura(float x){
        this.altura = x;
    }
    //Conseguir la altura
    public float getaltura(){
        return this.altura;
    }
    
    /* Metodos */
    
    /**
     * 
     * @return Reetorna el perimetro de un triangulo equilatero
     */
    @Override
    public float getPerimeter() {
        return super.getside1()*3;
    }//fin del clase 
    
    /**
     * 
     * @return retorna el area de un triangulo equilatero
     */
    @Override
    public float getArea() {
        return (super.getside1()*getaltura())/2;
    }//fin de la clase de area
} //Fin de la clase
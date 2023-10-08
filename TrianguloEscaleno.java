package fg;

/**
 *
 * @author Emiliano
 */
public class TrianguloEscaleno extends TrianguloIsoceles{
    private float altura; //Atributo necesario
    private float lado2;
    private float lado3;
    
    /* Constructores */
    public TrianguloEscaleno(){
        super.setSide1(0);
        this.altura = 0;
        this.lado2 = 0;
        this.lado3 = 0;
    }
    
    public TrianguloEscaleno(float x, float y, float z, float n){
        super.setSide1(x);
        this.altura = y;
        this.lado2 = z;
        this.lado3 = n;
    }
    
    /* Set y get */ 
    /**
     * 
     * @param x Altura del triangulo
     */
    @Override
    public void setaltura(float x){
        this.altura = x;
    }
    //Conseguir la altura
    @Override
    public float getaltura(){
        return this.altura;
    }
    
    /**
     * 
     * @param x Longitud de un lado
     */
    @Override
    public void setlado2(float x){
        this.lado2 = x;
    }
    /**
     * 
     * @return Valor de la variable actual
     */
    @Override
    public float getlado2(){
        return this.lado2;
    }
    
    /**
     * 
     * @param x  Longitud del tercer lado
     */
    public void setlado3(float x){
        this.lado3 = x;
    }
    
    public float getlado3(){
        return this.lado3;
    }
    
    /* Metodos */
    /**
     * 
     * @return Reetorna el perimetro de un triangulo escaleno
     */
    @Override
    public float getPerimeter() {
        return super.getside1()+getlado2()+getlado3();
    }//fin del clase 
    
    /**
     * 
     * @return retorna el area de un triangulo escaleno
     */
    @Override
    public float getArea() {
        return (super.getside1()*getaltura())/2;
    }//fin de la clase de area
} //Fin de la clase
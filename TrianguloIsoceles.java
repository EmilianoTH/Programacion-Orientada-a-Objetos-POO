/**
 *
 * @author Emiliano
 */
public class TrianguloIsoceles extends TrianguloEquilatero{
    private float altura; //Atributo necesario
    private float lado2;
    
    /* Constructores */
    public TrianguloIsoceles(){
        super.setSide1(0);
        this.altura = 0;
        this.lado2 = 0;
    }
    
    public TrianguloIsoceles(float x, float y, float z){
        super.setSide1(x);
        this.altura = y;
        this.lado2 = z;
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
    public void setlado2(float x){
        this.lado2 = x;
    }
    /**
     * 
     * @return Valor de la variable actual
     */
    public float getlado2(){
        return this.lado2;
    }
    
    /* Metodos */
    /**
     * 
     * @return Reetorna el perimetro de un triangulo isoceles
     */
    @Override
    public float getPerimeter() {
        return super.getside1()+(getlado2()*2);
    }//fin del clase 
    
    /**
     * 
     * @return retorna el area de un triangulo isoceles
     */
    @Override
    public float getArea() {
        return (super.getside1()*getaltura())/2;
    }//fin de la clase de area
    
} //Fin de la clase
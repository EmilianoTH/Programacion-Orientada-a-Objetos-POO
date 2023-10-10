package fg;

/**
 *
 * @author Emiliano
 */
public class Rombo extends Cuadrado{
    private float diagonalmay;
    private float diagonalmin;
    
    /* Constructores */
    public Rombo(){
        super.setSide1(0);
        this.diagonalmay = 0;
        this.diagonalmin = 0;
    }
    
    public Rombo(float x, float y, float z){
        super.setSide1(x);
        this.diagonalmay = y;
        this.diagonalmin = z;
    }
    
    /* Get y set */
    public void setdiagonalmay(float x){
        this.diagonalmay = x;
    }
    
    private float getdiagonalmay(){
        return this.diagonalmay;
    }
    
    public void setdiagonalmin(float x){
        this.diagonalmin = x;
    }
    
    private float getdiagonalmin(){
        return this.diagonalmin;
    }
    
    /* Metodos */
    @Override
    public float getPerimeter() {
        return super.getside1()*4;
    }

    @Override
    public float getArea() {
        return (getdiagonalmay()*getdiagonalmin())/2;
    }
} //Fin de clase rombo

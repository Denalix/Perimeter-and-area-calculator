
package Data;


public class Semicirculo extends Circulo{
    
    public Semicirculo(double radio){
        super(radio);
        setNombre("semicirculo");
    }
    
    public String toString(){
        return super.toString();
    }
    
    public void setArea(){
        setArea( (pi*getRadio()*getRadio())/2  );
    }
    
    public void setPerimetro(){
        setPerimetro( (pi*getRadio()) + (2*getRadio()) );
    }
    
}

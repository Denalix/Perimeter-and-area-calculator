
package Data;


public class Semicirculo extends Circulo{
    
    public Semicirculo(){
        super();
        setNombre("semicirculo");
    }
    
    public void setArea(){
        setArea( (pi*getRadio()*getRadio())/2  );
    }
    
    public void setPerimetro(){
        setPerimetro( (pi*getRadio()) + (2*getRadio()) );
    }
    
}

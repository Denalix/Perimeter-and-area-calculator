
package Data;

import static ShapeCalculatorTest.Manly.sc;
import ShapeCalculatorUI.UI;

public class Circulo extends Forma{
    
    public Circulo(double radio){
        super();
        setRadio(radio);
        setNombre("circulo");
    }
    
    public String toString(){
        return super.toString();
    }
    
    
    public double setRadio(UI ui, double dato){
        setRadio(ui.Dato("radio",dato,sc));
        return getRadio();
    }
    
    public void setArea(){
        setArea(pi*getRadio()*getRadio());
    }
    
    public void setPerimetro(){
        setPerimetro(2*pi*getRadio());
    }
    
}

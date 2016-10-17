
package Data;

import static ShapeCalculatorTest.Manly.sc;
import ShapeCalculatorUI.UI;

public class Circulo extends Forma{
    
    public Circulo(){
        super();
        setNombre("circulo");
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

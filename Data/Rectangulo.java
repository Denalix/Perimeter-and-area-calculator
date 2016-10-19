
package Data;

import static ShapeCalculatorTest.Manly.sc;
import ShapeCalculatorUI.UI;

public class Rectangulo extends Cuadrilatero{
    
    public Rectangulo(double ladoA, double ladoB){
        super();
        setNombre("rectangulo");
    }
    
    public String toString(){
        return super.toString();
    }
    
     @Override
    public double setLadoA(UI ui, double dato) {
        setLadoA(ui.Dato(getNombreLadoA(),dato,sc)) ;
        return getLadoA();
    }

    @Override
    public double setLadoB(UI ui, double dato) {
       setLadoB(ui.Dato(getNombreLadoBase(),dato,sc));
        return getLadoB(); 
    }

    @Override
    public double setLadoC(UI ui, double dato) {
        setLadoC(getLadoA());
        return getLadoC(); 
    }

    @Override
    public double setLadoD(UI ui, double dato) {
        setLadoD(getLadoB());
        return getLadoD(); 
    }
    
    public void Dibujar(){
        System.out.println("    _________________  ");
        System.out.println("    |               |  ");
        System.out.println("  a |               |  ");
        System.out.println("    |_______________|  ");
        System.out.println("           base        ");
    }

    @Override
    public void setArea() {
        setArea(getLadoA()*getLadoB());
    }
    
}

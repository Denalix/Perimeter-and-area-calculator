
package Data;

import static ShapeCalculatorTest.Manly.sc;
import ShapeCalculatorUI.UI;

public class Cuadrado extends Cuadrilatero{
    
    public Cuadrado(double ladoA){
        super();
        setNombre("cuadrado");
    }
    
    public String toString(){
        return super.toString();
    }
    
    
    
    public void Dibujar(){
        System.out.println("         a       ");
        System.out.println("    -----------  ");
        System.out.println("    |         |  ");
        System.out.println("  a |         |  ");
        System.out.println("    |         |  ");
        System.out.println("    -----------  ");
    }

    @Override
    public double setLadoA(UI ui, double dato) {
        setLadoA(ui.Dato(getNombreLadoA(),dato,sc)) ;
        return getLadoA();
    }

    @Override
    public double setLadoB(UI ui, double dato) {
       setLadoB(getLadoA());
        return getLadoB(); 
    }

    @Override
    public double setLadoC(UI ui, double dato) {
        setLadoC(getLadoA());
        return getLadoC(); 
    }

    @Override
    public double setLadoD(UI ui, double dato) {
        setLadoD(getLadoA());
        return getLadoD(); 
    }

    @Override
    public void setArea() {
        setArea(getLadoA()*getLadoA());
    }

}

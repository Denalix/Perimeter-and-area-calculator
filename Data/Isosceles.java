
package Data;

import static ShapeCalculatorTest.Manly.sc;
import ShapeCalculatorUI.UI;

public class Isosceles extends Triangulo{
    
    public Isosceles(double ladoA, double ladoB, double ladoC){
        super(ladoA, ladoB, ladoC);
        setNombre("triangulo isosceles");
    }
    
    public String toString(){
        return super.toString();
    }

    public void Dibujar(){
        System.out.println("         /\\       ");
        System.out.println("        /  \\      ");
        System.out.println("     a /    \\ a   ");
        System.out.println("      /      \\    ");
        System.out.println("     /________\\   ");
        System.out.println("          c        ");
    }

    

    @Override
    public double setLadoA(UI ui, double dato){
       setLadoA(ui.Dato(getNombreLadoA(), dato, sc)); 
       return getLadoA();
    }

    public double setLadoB(UI ui, double dato){
       setLadoB(getLadoA());
       return getLadoB();
    }

    @Override
    public double setLadoC(UI ui, double dato){
        setLadoC(ui.Dato(getNombreLadoC(), dato, sc)); 
       return getLadoC();
    }

}

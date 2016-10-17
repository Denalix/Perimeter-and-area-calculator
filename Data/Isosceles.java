
package Data;

import static ShapeCalculatorTest.Manly.sc;
import ShapeCalculatorUI.UI;

public class Isosceles extends Triangulo{

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
       return getLadoA();
    }

    @Override
    public double setLadoC(UI ui, double dato){
        setLadoA(ui.Dato(getNombreLadoC(), dato, sc)); 
       return getLadoA();
    }

}

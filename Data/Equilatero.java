
package Data;

import static ShapeCalculatorTest.Manly.sc;
import ShapeCalculatorUI.UI;
import java.util.Scanner;

public class Equilatero extends Triangulo{
    
    public Equilatero(double ladoA, double ladoB, double ladoC){
        super(ladoA, ladoB, ladoC);
        setNombre("triangulo equilatero");
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
        System.out.println("          a        ");
    }

    
    @Override
    public double setLadoA(UI ui, double dato) {
       setLadoA(ui.Dato(getNombreLadoA(), dato, sc)); 
       return getLadoA();
    }

    @Override
    public double setLadoB(UI ui, double dato) {
        setLadoB(getLadoA());
        return getLadoA();
    }

    @Override
    public double setLadoC(UI ui, double dato) {
        setLadoC(getLadoA());
        return getLadoA();
    }

    
}

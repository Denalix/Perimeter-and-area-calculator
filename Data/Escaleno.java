
package Data;

import static ShapeCalculatorTest.Manly.sc;
import ShapeCalculatorUI.UI;

public class Escaleno extends Triangulo{
    
    public Escaleno(double ladoA, double ladoB, double ladoC){
        super(ladoA,ladoB,ladoC);
        setNombre("triangulo escaleno");
    }
    
    public String toString(){
        return super.toString();
    }
    
  
    public void Dibujar(){
        System.out.println("         /\\       ");
        System.out.println("        /  \\      ");
        System.out.println("     a /    \\ b   ");
        System.out.println("      /      \\    ");
        System.out.println("     /________\\   ");
        System.out.println("          c        ");
    }

   
    @Override
    public double setLadoA(UI ui, double dato) {
       setLadoA(ui.Dato(getNombreLadoA(), dato, sc)); 
       return getLadoA();
    }

    @Override
    public double setLadoB(UI ui, double dato) {
       setLadoB(ui.Dato(getNombreLadoB(), dato, sc)); 
       return getLadoB();
    }

    @Override
    public double setLadoC(UI ui, double dato) {
        setLadoC(ui.Dato(getNombreLadoC(), dato, sc)); 
       return getLadoC();
    }

}

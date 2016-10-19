
package Data;

import static ShapeCalculatorTest.Manly.sc;
import ShapeCalculatorUI.UI;

public class Trapecio extends Cuadrilatero{
    
    public Trapecio(double ladoA, double ladoB, double baseMayor, double baseMenor){
        super();
        setLadoC(baseMayor);
        setLadoD(baseMenor);
        setLadoA(ladoA);
        setLadoB(ladoB);
        setNombre("trapecio");
    }
    
    public String toString(){
        return super.toString();
    }
    
    private double baseMayor;
    private double baseMenor;
    
    
    public double getBaseMenor(){
        return baseMenor;
    }
    
    @Override
    public double setLadoA(UI ui, double dato) {
        setLadoA(ui.Dato(getNombreLadoA(),dato,sc)) ;
        return getLadoA();
    }

    @Override
    public double setLadoB(UI ui, double dato) {
       setLadoB(ui.Dato(getNombreLadoB(),dato,sc));
        return getLadoB(); 
    }

    @Override
    public double setLadoC(UI ui, double dato) {
        setLadoC(ui.Dato(getNombreLadoC(),dato,sc));
        return getLadoC(); 
    }

    @Override
    public double setLadoD(UI ui, double dato) {
        setLadoD(ui.Dato(getNombreLadoD(),dato,sc));
        return getLadoD(); 
    }
 
    
    public void setArea(){
        double raiz = 1;
        double diagonal1 = getLadoA();
        double diagonal2 = getLadoB(); 
        double baseMayor = getLadoC();
        double baseMenor = getLadoD();
        for(int i = 0; i<4; i++){
            if(i == 1){
                diagonal1 = -diagonal1;
            }
            if(i == 2){
                diagonal2 = -diagonal2;
            }
            if(i == 3){
                baseMayor = -baseMayor;
                baseMenor = -baseMenor;
                diagonal2 = -diagonal2;
            }
            raiz *= -baseMayor+diagonal1+baseMenor+diagonal2;
        }
        
        double area = ((baseMayor + baseMenor)/4*(baseMayor - baseMenor))*(Math.sqrt(raiz));
        if(area > 0){
            setArea(area);
        }
        else{
            setArea(0);
        }
    }
    
    
    public void Dibujar(){
        System.out.println("        Base Menor       ");
        System.out.println("      _____________      ");
        System.out.println("     /             \\    ");
        System.out.println("  a /               \\ b ");
        System.out.println("   /_________________\\  ");
        System.out.println("        Base Mayor       ");
    }
    
}

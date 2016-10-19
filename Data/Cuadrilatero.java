
package Data;

import ShapeCalculatorUI.UI;

public abstract class Cuadrilatero extends Forma{
    
    public Cuadrilatero(){
        super();
        setNombre("cuadrilatero");
    }
    
    public String toString(){
        return super.toString();
    }
    
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double ladoD;
    
    private String nombreladoA = "lado a:";
    private String nombreladoB = "lado b:";
    private String nombreladoC = "lado base mayor:";//Base
    private String nombreladoD = "lado base menor:";//Base
    private String nombreladoBase = "lado base:";//Base
    
    
    public String getNombreLadoA(){
        return nombreladoA;
    }
    public String getNombreLadoB(){
        return nombreladoB;
    }
    public String getNombreLadoC(){
        return nombreladoC;
    }
    public String getNombreLadoD(){
        return nombreladoD;
    }
    public String getNombreLadoBase(){
        return nombreladoBase;
    }
    

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getLadoD() {
        return ladoD;
    }

    public void setLadoD(double ladoD) {
        this.ladoD = ladoD;
    }
    
    
    public abstract void Dibujar();
    
    public abstract double setLadoA(UI ui, double dato);
    public abstract double setLadoB(UI ui, double dato);
    public abstract double setLadoC(UI ui, double dato);
    public abstract double setLadoD(UI ui, double dato);
    
    public abstract void setArea();
    
    public void setPerimetro(){
        setPerimetro(getLadoA() + getLadoB() + getLadoC() + getLadoD());
    }
    
}


package Data;

import ShapeCalculatorUI.UI;
import java.util.Scanner;

public abstract class Triangulo extends Forma{
    Triangulo(double ladoA, double ladoB, double ladoC){
        super();
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        setNombre("triangulo");
    }
    
    public String toString(){
        return super.toString();
    }
    
    
    private double ladoA;
    private double ladoB;
    private double ladoC;//Base
    
    private String nombreladoA = "lado a";
    private String nombreladoB = "lado b";
    private String nombreladoC = "lado c";//Base
    
    
    public String getNombreLadoA(){
        return nombreladoA;
    }
    public String getNombreLadoB(){
        return nombreladoB;
    }
    public String getNombreLadoC(){
        return nombreladoC;
    }
    
    public void setArea(){
        double p = (getLadoA() + getLadoB() + getLadoC())/2;
        double area = ( Math.sqrt(p*(p-getLadoC())*(p-getLadoA())*(p-getLadoB())) );
        if(area > 0){
            setArea(area);
        }
        else{
            setArea(0);
        }
        
    }
    
    public void setLadoA(double dato){
        this.ladoA = dato;
    }
    
    public void setLadoB(double dato){
        this.ladoB = dato;
    }
    
    public void setLadoC(double dato){
        this.ladoC = dato;
    }
    
    public double getLadoA(){
        return ladoA;
    }
    public double getLadoB(){
        return ladoB;
    }
    public double getLadoC(){
        return ladoC;
    }
    
    public void setPerimetro(){
        setPerimetro(getLadoA() + getLadoB() + getLadoC()); 
    }
    
    public abstract double setLadoA(UI ui, double dato);
    public abstract double setLadoB(UI ui, double dato);
    public abstract double setLadoC(UI ui, double dato);
    
    
    public abstract void Dibujar();
   
}

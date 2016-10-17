
package Data;

import ShapeCalculatorUI.UI;
import java.util.Scanner;

public abstract class Triangulo extends Forma{
    Triangulo(){
        super();
        setNombre("triangulo");
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
        System.out.println("------" + p + "------");
        double area = ( Math.sqrt(p*(p-getLadoC())*(p-getLadoA())*(p-getLadoB())) );
        System.out.println("------" + area + "------");
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

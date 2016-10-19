
package ShapeCalculatorTest;

import Data.*;
import ShapeCalculatorUI.UI;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Manly {
    
    private static Forma form;
    private static Triangulo tri;
    private static Triangulo equi;
    private static Triangulo isos;
    private static Triangulo esc;
    private static Cuadrilatero cua;
    private static Cuadrilatero rec;
    private static Cuadrilatero tra;
    private static Circulo cir;
    private static Semicirculo semicir;
    private static UI ui;
    private static Validacion val;
    
    public static int op;//opción de cual figura escoger
    public static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args){
        
        
        equi = new Equilatero(0,0,0);
        isos = new Isosceles(0,0,0);
        esc = new Escaleno(0,0,0);
        cua = new Cuadrado(0);
        rec = new Rectangulo(0,0);
        tra = new Trapecio(0,0,0,0);
        cir = new Circulo(0);
        semicir = new Semicirculo(0);
        ui = new UI();
        val = new Validacion();
        DecimalFormat decimales = new DecimalFormat("0.00");
        
        double dato = 0.0;
        boolean salir = false;
        
        while(!salir){
            switch(ui.Bienvenida(op,sc)){
                case 1://Triangulo
                    switch(ui.MenuTriangulo(op,sc)){
                        case 1:
                            equi.Dibujar();
                            TrianguloPA(dato, equi, salir, decimales, ui.PA(op,sc));
                            break;
                        case 2:
                            isos.Dibujar();
                            TrianguloPA(dato, isos, salir, decimales, ui.PA(op,sc));
                            break;
                        case 3:
                            esc.Dibujar();
                            TrianguloPA(dato, esc, salir, decimales, ui.PA(op,sc));
                            break;
                    }
                    if(ui.salir(op,sc) == 2){
                        salir = true;
                    }
                    continue;
                    
                case 2://Cuadrado
                    cua.Dibujar();
                    CuadradoPA(dato, cua, salir, decimales, ui.PA(op,sc));
                    if(ui.salir(op,sc) == 2){
                        salir = true;
                    }
                    continue;
                    
                case 3://Rectangulo
                    rec.Dibujar();
                    RectanguloPA(dato, rec, salir, decimales, ui.PA(op,sc));
                    if(ui.salir(op,sc) == 2){
                        salir = true;
                    }
                    continue;
                    
                case 4://Trapecio
                    tra.Dibujar();
                    TrapecioPA(dato, tra, salir, decimales, ui.PA(op,sc));
                    if(ui.salir(op,sc) == 2){
                        salir = true;
                    }
                    continue;
                    
                case 5://Circulo
                    switch(ui.MenuCirculo(op,sc)){
                        case 1:
                            CirculoPA(dato, cir, salir, decimales, ui.PA(op,sc));
                            break;
                        case 2:
                            SemiCirculoPA(dato, semicir, salir, decimales, ui.PA(op,sc));
                            break;
                    }
                    if(ui.salir(op,sc) == 2){
                        salir = true;
                    }
                    continue;
                    
                case 6://Salir
                    salir = true;
            }
        }
        System.out.println("Muchas gracias por usar nuestra calculadora.");
        
    }
     
    
    
    public static void TrianguloPA(double dato, Triangulo tri, boolean salir,DecimalFormat decimales, int op ){
                while(!salir){
                    ui.MenuFigura();
                    if(!val.Val(tri.setLadoA(ui,dato),salir)){
                        continue;
                    }
                    
                    if(!val.Val(tri.setLadoB(ui,dato),salir)){
                        continue;
                    }
                    
                    if(!val.Val(tri.setLadoC(ui,dato),salir)){
                        continue;
                    }
                    
                    
                    tri.setArea();
                    tri.setPerimetro();
                    
                    salir = ui.printShapeAreaAndPerimeter(tri, decimales, op);
                }
    }
    
    
    public static void CuadradoPA(double dato, Cuadrilatero cua, boolean salir, DecimalFormat decimales, int op){
                while(!salir){
                    ui.MenuFigura();
                    if(!val.Val(cua.setLadoA(ui, dato), salir)){
                        continue;
                    }
                    
                    cua.setLadoB(ui, dato);
                    cua.setLadoC(ui, dato);
                    cua.setLadoD(ui, dato);
                    
                    cua = new Cuadrado(cua.getLadoA());
                    
                    cua.setArea();
                    cua.setPerimetro();
                    
                    
                    ui.printShapeAreaAndPerimeter(cua, decimales, op);
                    
                    salir = true;
                }
    }
    
     public static void RectanguloPA(double dato, Cuadrilatero rec, boolean salir, DecimalFormat decimales, int op){
                while(!salir){
                    ui.MenuFigura();
                    if(!val.Val(rec.setLadoA(ui, dato), salir)){
                        continue;
                    }
                    if(!val.Val(rec.setLadoB(ui, dato), salir)){
                        continue;
                    }
                    
                    cua.setLadoC(ui, dato);
                    cua.setLadoD(ui, dato);
                    
                    rec = new Rectangulo(rec.getLadoA(), rec.getLadoB());
                    
                    rec.setArea();
                    rec.setPerimetro();
                    
                    
                    salir = ui.printShapeAreaAndPerimeter(rec, decimales, op);
                }
    }
     
     public static void TrapecioPA(double dato, Cuadrilatero tra, boolean salir, DecimalFormat decimales, int op){
                while(!salir){
                    ui.MenuFigura();
                    
                    if(!val.Val(tra.setLadoD(ui, dato), salir)){
                        continue;
                    }
                    if(!val.Val(tra.setLadoC(ui, dato), salir)){
                        continue;
                    }
                    if(!val.Val(tra.setLadoA(ui, dato), salir)){
                        continue;
                    }
                    if(!val.Val(tra.setLadoB(ui, dato), salir)){
                        continue;
                    }
                    
                    tra = new Trapecio(tra.getLadoA(), tra.getLadoB(), tra.getLadoC(), tra.getLadoD());
                    
                    tra.setArea();
                    tra.setPerimetro();
                    
                    
                    
                    salir = ui.printShapeAreaAndPerimeter(tra, decimales, op);
                }   
    }
    
     public static void CirculoPA(double dato, Circulo cir, boolean salir, DecimalFormat decimales,int op){
                while(!salir){
                    ui.MenuFigura();
                    if(!val.Val(cir.setRadio(ui, dato), salir)){
                        continue;
                    }
                    
                    cir = new Circulo(cir.getRadio());
                    
                    cir.setArea();
                    cir.setPerimetro();
                    
                    
                    salir = ui.printShapeAreaAndPerimeter(cir, decimales, op);
                }
     }
     
     public static void SemiCirculoPA(double dato, Semicirculo semicir, boolean salir, DecimalFormat decimales,int op){
                while(!salir){
                    ui.MenuFigura();
                    if(!val.Val(semicir.setRadio(ui, dato), salir)){
                        continue;
                    }
                    
                    semicir = new Semicirculo(semicir.getRadio());
                    
                    semicir.setArea();
                    semicir.setPerimetro();
                    
                    
                    salir = ui.printShapeAreaAndPerimeter(semicir, decimales, op);
                    
                    salir = true;
                }
     }
}

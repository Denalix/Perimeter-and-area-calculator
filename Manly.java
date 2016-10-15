
package Bussines;

import java.util.Scanner;
import Data.*;
import UI.UI;
import java.text.DecimalFormat;

public class Manly {
    
    private static Triangulo tri;
    private static Cuadrado cua;
    private static Rectangulo rec;
    private static Trapecio tra;
    private static Circulo cir;
    private static UI ui;
    private static Validacion val;
    
    public static void main(String[] args){
        
        
        tri = new Triangulo();
        cua = new Cuadrado();
        rec = new Rectangulo();
        tra = new Trapecio();
        cir = new Circulo();
        ui = new UI();
        val = new Validacion();
        DecimalFormat decimales = new DecimalFormat("0.00");
        
        double dato = 0.0;
        boolean salir = false;
        
        
        while(!salir){
            switch(ui.Bienvenida()){
                case 1://Triangulo
                    tri.Dibujar();
                    TrianguloPA(dato, tri, salir, decimales, ui.PA());
                    if(ui.salir() == 2){
                        salir = true;
                    }
                    continue;
                case 2://Cuadrado
                    cua.Dibujar();
                    CuadradoPA(dato, cua, salir, decimales, ui.PA());
                    if(ui.salir() == 2){
                        salir = true;
                    }
                    continue;
                case 3://Rectangulo
                    rec.Dibujar();
                    RectanguloPA(dato, rec, salir, decimales, ui.PA());
                    if(ui.salir() == 2){
                        salir = true;
                    }
                    continue;
                case 4://Trapecio
                    tra.Dibujar();
                    TrapecioPA(dato, tra, salir, decimales, ui.PA());
                    if(ui.salir() == 2){
                        salir = true;
                    }
                    continue;
                case 5://Circulo
                    CirculoPA(dato, cir, salir, decimales, ui.PA());
                    if(ui.salir() == 2){
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
                    System.out.println("Introduzca longitud del lado 'a' del triangulo: ");
                    dato = ui.sc.nextDouble();
                    if(!val.Val(dato, salir)){
                        continue;
                    }
                    tri.setDiagonal1(dato);
                    System.out.println("Introduzca longitud del lado 'b' del triangulo: ");
                    dato = ui.sc.nextDouble();
                    if(!val.Val(dato, salir)){
                        continue;
                    }
                    tri.setDiagonal2(dato);
                    System.out.println("Introduzca longitud del lado 'c' del triangulo: ");
                    dato = ui.sc.nextDouble();
                    if(!val.Val(dato, salir)){
                        continue;
                    }
                    tri.setBase(dato);
                    
                     if((tri.Area(tri.getBase(), tri.getDiagonal1(), tri.getDiagonal2())) == 0){
                        continue;
                    }
                    
                    if(op == 1 || op == 3){
                        System.out.println("El perímetro del triangulo es: " + decimales.format(tri.Perimetro(tri.getBase(),tri.getDiagonal1(), tri.getDiagonal2())) );
                    }
                    if(op == 2 || op == 3){
                        System.out.println("El área del triangulo es: " +  decimales.format(tri.Area(tri.getBase(), tri.getDiagonal1(), tri.getDiagonal2())));
                    }
                   
                    salir = true;
                }
    }
    
    
    public static void CuadradoPA(double dato, Cuadrado cua, boolean salir, DecimalFormat decimales, int op){
                while(!salir){
                    ui.MenuFigura();
                    System.out.println("Introduzca la longitug de un lado: ");
                    dato = ui.sc.nextDouble();
                    if(!val.Val(dato, salir)){
                        continue;
                    }
                    cua.setBase(dato);
                    
                    if(op == 1 || op == 3){
                        System.out.println("El perímetro del cuadrado es: " + decimales.format(cua.Perimetro(cua.getBase())) );
                    }
                    if(op == 2 || op == 3){
                        System.out.println("El área del cuadrado es: " + decimales.format(cua.Area(cua.getBase())) );
                    }
                    
                    salir = true;
                }
    }
    
     public static void RectanguloPA(double dato, Rectangulo rec, boolean salir, DecimalFormat decimales, int op){
                while(!salir){
                    ui.MenuFigura();
                    System.out.println("Introduzca la longitug de la base: ");
                    dato = ui.sc.nextDouble();
                    if(!val.Val(dato, salir)){
                        continue;
                    }
                    rec.setBase(dato);
                    System.out.println("Introduzca la longitud de la altura: ");
                    dato = ui.sc.nextDouble();
                    if(!val.Val(dato, salir)){
                        continue;
                    }
                    rec.setAltura(dato);
                    
                    if(op == 1 || op == 3){
                        System.out.println("El perímetro del rectangulo es: " + decimales.format(rec.Perimetro(rec.getBase(),rec.getAltura())) );
                    }
                    if(op == 2 || op == 3){
                        System.out.println("El área del rectangulo es: " + decimales.format(rec.Area(rec.getBase(), rec.getAltura())) );
                    }
                    
                    
                    salir = true;
                }
    }
     
     public static void TrapecioPA(double dato, Trapecio tra, boolean salir, DecimalFormat decimales, int op){
                while(!salir){
                    ui.MenuFigura();
                    System.out.println("Introduzca la longitug de la base mayor: ");
                    dato = ui.sc.nextDouble();
                    if(!val.Val(dato, salir)){
                        continue;
                    }
                    tra.setBaseMayor(dato);
                    System.out.println("Introduzca la longitug de la base menor: ");
                    dato = ui.sc.nextDouble();
                    if(!val.Val(dato, salir)){
                        continue;
                    }
                    tra.setBaseMenor(dato);
                    System.out.println("Introduzca longitud del lado 'a' del trapecio: ");
                    dato = ui.sc.nextDouble();
                    if(!val.Val(dato, salir)){
                        continue;
                    }
                    tra.setDiagonal1(dato);
                    System.out.println("Introduzca longitud del lado 'b' del trapecio: ");
                    dato = ui.sc.nextDouble();
                    if(!val.Val(dato, salir)){
                        continue;
                    }
                    tra.setDiagonal2(dato);
                    
                    if((tra.Area(tra.getBaseMayor(), tra.getBaseMenor(), tra.getDiagonal1(), tra.getDiagonal2())) == 0){
                        continue;
                    }
                    
                    if(op == 1 || op == 3){
                        System.out.println("El perímetro del trapecio es: " + decimales.format(tra.Perimetro(tra.getBaseMayor(),tra.getBaseMenor(), tra.getDiagonal1(), tra.getDiagonal2())) );
                    }
                    if(op == 2 || op == 3){
                        System.out.println("El área del trapecio es: " + decimales.format(tra.Area(tra.getBaseMayor(), tra.getBaseMenor(), tra.getDiagonal1(), tra.getDiagonal2())) );
                    }
                    
                    salir = true;
                }   
    }
    
     public static void CirculoPA(double dato, Circulo cir, boolean salir, DecimalFormat decimales,int op){
                while(!salir){
                    ui.MenuFigura();
                    System.out.println("Introduzca la longitug del radio: ");
                    dato = ui.sc.nextDouble();
                    if(!val.Val(dato, salir)){
                        continue;
                    }
                    cir.setRadio(dato);
                    
                    if(op == 1 || op == 3){
                        System.out.println("El perímetro del Círculo es: " + decimales.format(cir.Perimetro(cir.getRadio())) );
                    }
                    if(op == 2 || op == 3){
                        System.out.println("El área del Círculo es: " + decimales.format(cir.Area(cir.getRadio())) );
                    }
                    
                    salir = true;
                }
     }
}

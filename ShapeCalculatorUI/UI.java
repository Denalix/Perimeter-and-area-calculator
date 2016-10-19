
package ShapeCalculatorUI;

import Data.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class UI {
    
    
    public static int Bienvenida(int op, Scanner sc){
        System.out.println("Bienvenido a la calculadora de áreas de perímetro, esta calculadora le permitira");
        System.out.println(" calcular el área y el perímetro de las siguientes figuras, (si quiere salir pre-");
        System.out.println("isone 6.");
        System.out.println("");
        System.out.println("1. Triangulo.");
        System.out.println("2. Cuadrado.");
        System.out.println("3. Rectangulo.");
        System.out.println("4. Trapecio.");
        System.out.println("5. Círculo.");
        System.out.println("6. Salir.");
        
        System.out.println("De cual figura le gustaria obtener el área y el perímetro: ");
        op = sc.nextInt();
        
        return op;
    }
    
    public static int MenuTriangulo(int op, Scanner sc){
        System.out.println("Que tipo de triangulo desea evaluar: ");
        System.out.println("1. Equilatero.");
        System.out.println("2. Isoceles.");
        System.out.println("3. Escaleno.");
        op = sc.nextInt();
        return op;
    }
    
    public static int MenuCirculo(int op, Scanner sc){
        System.out.println("Que tipo de Circulo le gustaria evaluar: ");
        System.out.println("1. Circulo.");
        System.out.println("2. Semi-Circulo.");
        op = sc.nextInt();
        return op;
    }
    
    
    public static double Dato(String lado, double dato, Scanner sc){
        System.out.println("Introduzca longitud del "+ lado);
        dato = sc.nextDouble();
        return dato;
    }
    
    
    
    public static boolean printShapeAreaAndPerimeter(Forma form, DecimalFormat decimales, int op){
        //Las dos variable extras(DecimalFormat decimales, int op) son debido a unos extras del programa.
        if(form.getArea() == 0){
            System.out.println("###### El "+ form.getNombre() +" que introdujo no es posible, por favor vuelva a introducir los datos. ######");
            System.out.println("");
            return false;
        }
        else{
            if(op == 1){
                System.out.println("El perímetro del " + form.getNombre() + " es: " + decimales.format(form.getPerimetro()) );
                    }
            if(op == 2){
                System.out.println("El área del " + form.getNombre() + " es: " +  decimales.format(form.getArea()) );            
            }
            if(op == 3){
                System.out.println(form);
            }
            return true;
        }
    }
    
    public static int PA(int op, Scanner sc){
        System.out.println("Digite el número de la opción que desee:");
        System.out.println("1. Solo perímetro");
        System.out.println("2. Solo área");
        System.out.println("3. área y perímetor");
        op = sc.nextInt();
        return op;
    }
    
    public static void MenuFigura(){
        System.out.println("Introduzca los datos solicitados con respecto a la figura. Los datos deberan ser pasados");
        System.out.println("con coma(,) como punto decimal. No se pueden introducir números negativos ni cero.");
        System.out.println("");
    }
    
    public static int  salir(int op, Scanner sc){
        System.out.println("Por favor digite 1 para volver al menú principal o 2 para salir.");
        op = sc.nextInt();
        
        return op;
    }
  
}

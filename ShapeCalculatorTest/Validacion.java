
package ShapeCalculatorTest;

public class Validacion {
    
    
    public static boolean Val(double dato, boolean salir){
        if(dato <= 0){
            System.out.println("No se pueden insertar números negativos o cero. Por favor vuelva a introducir los datos.");
            System.out.println("");
            salir = false;
        }
        if(dato > 0){
            salir = true;
        }
        
       return salir;
    }
    
}

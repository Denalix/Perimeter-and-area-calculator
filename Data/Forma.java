
package Data;

public abstract class Forma {
    
    private double area;
    private double perimetro;
    private double base;
    private double altura;
    private double diagonal1;
    private double diagonal2;
    private String nombre;
    private double radio;
    static final double pi = 3.1415;
    
    public Forma(){
        setNombre("forma");
    }
    
    public String toString(){
        
        return String.format("El area del %s es %.2f y el perimetro es %.2f", getNombre(),getArea(), getPerimetro());
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setDiagonal1(double diagonal1){
        this.diagonal1 = diagonal1;
    }
    
    public double getDiagonal1(){
        return diagonal1;
    }
    
    public void setDiagonal2(double diagonal2){
        this.diagonal2 = diagonal2;
    }
    
    public double getDiagonal2(){
        return diagonal2;
    }
    
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double getBase(){
        return base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setArea(double area){
        this.area = area;
    }
    
    public double getArea(){
        return area;
    }
    
    
    
    public void setPerimetro(double perimetro){
        this.perimetro = perimetro;
    }
    
    public double getPerimetro(){
        return perimetro;
    }

}

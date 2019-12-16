package ex2abstrata;

public class Quadrado extends FormaGeometrica{
    private float lado;
    
    public Quadrado(float lado){
        this.lado=lado;
    }
    
    @Override
    public float comprimento(){
        float comprimento;
        comprimento=4*this.lado;
        return comprimento;
    }
    
    @Override
    public float area(){
        float area;
        area=lado*lado;
        return area;
    }   
}

package ex2abstrata;

public class Circulo extends FormaGeometrica{
    private float raio;
  
    public Circulo(float raio){
        this.raio=raio;
    }
    
    @Override
    public float comprimento(){
        float comprimento;
        comprimento = (float)Math.PI*raio*2;
        return comprimento;
    }
    
    @Override
    public float area(){
        float area;
        area = (float)Math.PI*raio*raio;
        return area;
    }

}

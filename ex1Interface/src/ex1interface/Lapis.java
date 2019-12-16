package ex1interface;

public class Lapis implements Caneta {
    private String cor;
    
    public Lapis(String cor){
        this.cor=cor;
    }
    
    @Override
    public void escrever(String texto){
        System.out.println("Escrevendo: \"" + texto + "\" à Lapis, com a COR: " + cor.toUpperCase());
    }
    
    @Override
    public String getCor(){
        return this.cor;
    }
}

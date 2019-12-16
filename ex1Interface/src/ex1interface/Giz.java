package ex1interface;

public class Giz  implements Caneta {
    private String cor;
    
    public Giz(String cor){
        this.cor=cor;
    }
    
    @Override
    public void escrever(String texto){
        System.out.println("Escrevendo: \"" + texto + "\" à Giz, com a COR: " + cor.toUpperCase());
    }
    
    @Override
    public String getCor(){
        return this.cor;
    }
    
}

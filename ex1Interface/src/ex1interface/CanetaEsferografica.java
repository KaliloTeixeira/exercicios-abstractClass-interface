package ex1interface;

public class CanetaEsferografica implements Caneta{
    private String cor;
    
    public CanetaEsferografica(String cor){
        this.cor=cor;
    }
    
    @Override
    public void escrever(String texto){
        System.out.println("Escrevendo: \"" + texto + "\" à Caneta, com a COR: " + cor.toUpperCase());
    }
    
    @Override
    public String getCor(){
        return this.cor;
    }
}



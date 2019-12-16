package ex3interface;

public class Carta implements Enderecavel{
    private int id;
    private String origem;
    private String destino;    
    private String texto;    
    
    public Carta(int id, String origem, String destino, String texto){
        this.id=id;
        this.origem=origem;
        this.destino=destino;
        this.texto=texto;
    }
    
    @Override
    public int getIdentificador(){
        return this.id;
    }
    
    @Override
    public String getCidadeOrigem(){
        return this.origem;
    }
    
    @Override
    public String getCidadeDestino(){
        return this.destino;
    }
}

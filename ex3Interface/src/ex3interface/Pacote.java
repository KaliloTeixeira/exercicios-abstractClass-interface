package ex3interface;

public class Pacote implements Enderecavel{
    private int id;
    private String origem;
    private String destino;
    private float peso;
    private float altura;
    private float largura;
    
    public Pacote(int id, String origem, String destino, float peso, float altura, float largura){
        this.id=id;
        this.origem=origem;
        this.destino=destino;
        this.peso=peso;
        this.altura=altura;
        this.largura=largura;
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

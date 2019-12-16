package ex3interface;

public class Revista implements Enderecavel{
    private int id;
    private String origem;
    private String destino;
    private String titulo;
    private int mes;
    private int ano;
    
    public Revista(int id, String origem, String destino, String titulo, int mes, int ano){
        this.id=id;
        this.origem=origem;
        this.destino=destino;
        this.titulo=titulo;
        this.mes=mes;
        this.ano=ano;
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

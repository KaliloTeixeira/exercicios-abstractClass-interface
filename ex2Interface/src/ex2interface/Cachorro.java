package ex2interface;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
    private String tamanho;
    private String raca;
    
    public Cachorro(String nome, String tamanho, String raca){
        super(nome);
        this.tamanho=tamanho;
        this.raca=raca;
    }
    
    @Override
    public String emitirSom(){
        return "Late";
    }
    
    @Override
    public String amamentar(){
        return "Amamenta";
    }
    
    @Override
    public void alimentar(){
        System.out.println("Alimentando Cachorro: " + nome);
    }
    
    @Override
    public void levarVet(){
        System.out.println("Levar o Cachorro " + nome + " ao Veterinário!");
    }
    
    @Override
    public void chamarVet(){
        System.out.println("Chame o Veterinário para o Cachorro " + nome);
    }
    
    @Override
    public void brincar(){
        System.out.println("Leve o Cachorro " + nome + " para Brincar!");
    }
    
    @Override
    public void levarPassear(){
        System.out.println("Leve o Cachorro " + nome + " para Passear!");
    }
}

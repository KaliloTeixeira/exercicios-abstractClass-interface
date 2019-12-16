package ex2interface;

public class Cavalo extends Mamifero implements AnimalDomesticado{
    public Cavalo(String nome){
        super(nome);
    }
    
    @Override
    public String emitirSom(){
        return "Relinxa";
    }
    
    @Override
    public String amamentar(){
        return "Amamenta";
    }
    
    @Override
    public void alimentar(){
        System.out.println("Alimentando Cavalo: " + nome);
    }
    
    @Override
    public void levarVet(){
        System.out.println("Leve o Cavalo " + nome + " ao Veterinário!");
    }
    
    @Override
    public void chamarVet(){
        System.out.println("Chame o Veterinário para o Cavalo " + nome);
    }
  
}

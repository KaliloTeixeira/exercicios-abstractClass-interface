package ex2interface;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
    private String raca;
    
    public Gato(String nome, String raca){
        super(nome);
        this.raca=raca;
    }
    
    @Override
    public String emitirSom(){
        return "Mia";
    }
    
    @Override
    public String amamentar(){
        return "Amamenta";
    }
    
    @Override
    public void alimentar(){
        System.out.println("Alimentando Gato: " + nome);
    }
    
    @Override
    public void levarVet(){
        System.out.println("Leve o Gato " + nome + " ao Veterinário");
    }
    
    @Override
    public void chamarVet(){
        System.out.println("Chame o Veterinário para o Gato " + nome);
    }
    
        
    @Override
    public void brincar(){
        System.out.println("Leve o Gato " + nome + " para Brincar!");
    }
    
    @Override
    public void levarPassear(){
        System.out.println("Leve o Gato " + nome + "para Passear!");
    }
}

package ex2interface;

public class Papagaio extends Ave{
    public Papagaio(String nome){
        super(nome);
    }
    
    @Override
    public String emitirSom(){
        return "Canta";
    }
    
    @Override
    public String voar(){
        return "Voa";
    }
    
}

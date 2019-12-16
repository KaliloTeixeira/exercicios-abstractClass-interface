package ex2interface;

public abstract class Mamifero extends Animal {
    public Mamifero(String nome){
        super(nome);
    }
    
    public abstract String amamentar();
}

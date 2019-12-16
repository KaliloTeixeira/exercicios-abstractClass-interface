package ex2interface;

public class Main {

    public static void main(String[] args) {
        Papagaio p1 = new Papagaio("Chico");
        Cachorro c1 = new Cachorro("Rex", "Medio", "Vira-Lata");
        Cavalo ca1 = new Cavalo("Pangaré");
        Gato g1 = new Gato("Cleiton", "Vira-Lata");
        
        System.out.println("O Papagaio " + p1.nome + ": " + p1.emitirSom() + " e " + p1.voar());
        System.out.println("---------------------------");
        
        System.out.println("O Cachorro " + c1.nome + ": " + c1.emitirSom() + " e " + c1.amamentar());
        c1.alimentar();
        c1.brincar();
        c1.chamarVet();
        c1.levarPassear();
        c1.levarVet();
        System.out.println("---------------------------");
        
        System.out.println("O Cavalo " + ca1.nome + ": " + ca1.emitirSom() + " e " + ca1.amamentar());
        ca1.alimentar();
        ca1.chamarVet();
        ca1.levarVet();
        System.out.println("---------------------------");
        
        System.out.println("O Gato " + g1.nome + ": " + g1.emitirSom() + " e " + g1.amamentar());
        g1.alimentar();
        g1.brincar();
        g1.chamarVet();
        g1.levarPassear();
        g1.levarVet();
        System.out.println("---------------------------");
        
    }
    
}

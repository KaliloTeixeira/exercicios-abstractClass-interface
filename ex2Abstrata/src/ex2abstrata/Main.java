package ex2abstrata;

public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2);
        Quadrado q1 = new Quadrado(5);
        
        System.out.println("Comprimento do Circulo: " + c1.comprimento());
        System.out.println("Area do Circulo: " + c1.area());
        System.out.println("--------------------------------------");
        System.out.println("Comprimento do Quadrado: " + q1.comprimento());
        System.out.println("Area do Quadrado: " + q1.area());
        
    }
    
}

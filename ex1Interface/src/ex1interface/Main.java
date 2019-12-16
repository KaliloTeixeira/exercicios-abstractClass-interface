package ex1interface;

public class Main {
    public static void main(String[] args) {
        CanetaEsferografica c1 = new CanetaEsferografica("azul");
        Giz g1 = new Giz("branco");
        Lapis l1 = new Lapis("preto");
        
        c1.escrever("Bom dia, Tudo bem?");
        g1.escrever("Olá! Como vai você");
        l1.escrever("Fala tu que eu to cansado!");
        
        System.out.println("Cor da Caneta: " + c1.getCor());
        System.out.println("Cor do Giz: " + g1.getCor());
        System.out.println("Cor do Lapis: " + l1.getCor());
    }
    
}

package ex3interface;

public class Main {
    public static void main(String[] args) {
       Carta c1 = new Carta(01, "Riacho de Santana", "Vitória da Conquista", "Bom dia!");
       Revista r1 = new Revista(02, "São Paulo", "Rio de Janeiro", "De Volta pro Futuro", 10, 2020);
       Pacote p1 = new Pacote(03, "Salvador", "Jequié", 50, 10, 15);
       
        System.out.println("Carta - ID: " + c1.getIdentificador() + "\nCidade de Origem: " + c1.getCidadeOrigem() + "\nCidade de Destino: " + c1.getCidadeDestino());
        System.out.println("---------------------------------------");
        System.out.println("Revista - ID: " + r1.getIdentificador() + "\nCidade de Origem: " + r1.getCidadeOrigem() + "\nCidade de Destino: " + r1.getCidadeDestino());
        System.out.println("---------------------------------------");
        System.out.println("Pacote - ID: " + p1.getIdentificador() + "\nCidade de Origem: " + p1.getCidadeOrigem() + "\nCidade de Destino: " + p1.getCidadeDestino());
        System.out.println("---------------------------------------");
    }
    
}

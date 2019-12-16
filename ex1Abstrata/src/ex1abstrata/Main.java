package ex1abstrata;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Gerente g1 = new Gerente("Mauricio", "123.456.789-0", 1000.0);
        Gerente g2 = new Gerente("Gilberto", "456.789.123-0", 2000.0);
        Desenvolvedor d1 = new Desenvolvedor("José", "789.456.123-0", 5000.0);
        Desenvolvedor d2 = new Desenvolvedor("João", "123.789.456-0", 7000.0);
        
        g1.getBonificacao();
        g2.getBonificacao();
        d1.getBonificacao();
        d2.getBonificacao();
        
        RepositorioFuncionarios listaFuncionarios = new RepositorioFuncionarios();
        
        listaFuncionarios.inserir(g1);
        listaFuncionarios.inserir(g2);
        listaFuncionarios.inserir(d1);
        listaFuncionarios.inserir(d2);
        
        listaFuncionarios.imprimirLista();
       
        System.out.println("Digite o Numero de CPF: ");
        String cpf = read.next();
        
        boolean verifica = listaFuncionarios.verificarFuncionario(cpf);
        if(verifica)
            System.out.println("Funcionário encontrado: " + cpf);
            else
                System.out.println("Funcionário não Encontrado!");
        
        }    
}

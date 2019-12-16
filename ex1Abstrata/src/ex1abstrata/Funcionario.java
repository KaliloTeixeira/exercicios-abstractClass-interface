package ex1abstrata;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    
    public Funcionario(String nome, String cpf, double salario){
        this.nome=nome;
        this.cpf=cpf;
        this.salario=salario;
    }
    
    public abstract void getBonificacao();
    
    public void imprimir(){
        System.out.printf("Nome: %s\nCPF: %s\nSalário:%f", nome, cpf, salario);
        System.out.println("\n----------------------------");
    }
}

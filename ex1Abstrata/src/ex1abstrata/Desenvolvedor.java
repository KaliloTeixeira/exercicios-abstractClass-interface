package ex1abstrata;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }
    
    @Override
    public void getBonificacao(){
        salario+=salario*0.15;
    }
    
}

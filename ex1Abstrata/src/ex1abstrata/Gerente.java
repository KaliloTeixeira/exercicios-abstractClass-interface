package ex1abstrata;

public class Gerente extends Funcionario{
    public Gerente(String nome, String cpf,double salario){
        super(nome, cpf, salario);
    }
    
    @Override
    public void getBonificacao(){
        salario+=salario*0.2;
    }
    
}

package ex1abstrata;

public class RepositorioFuncionarios {
    private Funcionario[] listaFuncionarios;
    private int indice;
    
    public RepositorioFuncionarios(){
        indice=0;
        listaFuncionarios = new Funcionario[4];
    }
    
    public void inserir (Funcionario f){
        if(indice<4){
            listaFuncionarios[indice]=f;
            indice++;
        }else{
            System.out.println("Sua Lista de Funcionários está cheia!");
        }
    }
    
    public void imprimirLista(){
        for (int i = 0; i < indice; i++) {
            listaFuncionarios[i].imprimir();
        }
    }
    
    public boolean verificarFuncionario(String f){
        boolean result = false;
        String cpf;
        try{
            for (int i = 0; i < 4; i++) {
            cpf = listaFuncionarios[i].cpf;
            if(f.equalsIgnoreCase(cpf)){
                result=true;
                System.out.println(listaFuncionarios[i].nome);
                }
            }
        }catch(Exception e){
            result=false;
        }
        return result;
    }
}

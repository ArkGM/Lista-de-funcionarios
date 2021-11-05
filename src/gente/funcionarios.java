
package gente;


public class funcionarios extends pessoa {
    
    private String Matricula;
    private String Departamento;
    
    
    @Override
     public void imprimir(){
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("E-mail: " +getEmail());
        System.out.println("Metricula do Funcionario: " + getMatricula());
        System.out.println("Departamento do Funcionario: " +getDepartamento() + "\n");        
    
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }
    
    
    
}

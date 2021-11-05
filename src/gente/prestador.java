
package gente;


public class prestador extends pessoa {
    
    private String CPF;
    private String Empresa;
    
    
    @Override
     public void imprimir(){
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("E-mail: " + getEmail());
        System.out.println("CPF: " + getCPF());
        System.out.println("Empresa: " + getEmpresa() + "\n");        
    
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }
    
    
}

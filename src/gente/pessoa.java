
package gente;


public class pessoa {
    
    private String Nome;
    private String Telefone;
    private String Email;
    private pessoa[] registro;
    private int pointer = 0;
    
        
    
    public pessoa(){        
        registro = new pessoa[50];
    }
    public void incluir(pessoa p){
        registro[pointer] = p; 
        pointer++;
        System.out.println("Contato registrado com sucesso.\n");    
    } 
    
    public void imprimir(){
        for(int i = 0;i < pointer; i++){
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("E-mail: " + getEmail());    
    }    
  }
     public void alterar(pessoa contatoAntigo,pessoa contatoNovo){
            
        for(int i = 0;i < pointer;i++){
            if(contatoAntigo.equals(registro[i])){
                registro[i].setNome(contatoNovo.getNome());
                registro[i].setEmail(contatoNovo.getEmail());                
                registro[i].setTelefone(contatoNovo.getTelefone());
            }
        }          
    }
    
      public void excluir(){
        
        for(int i = 0;i < pointer;i++){
            registro[i] = null;
            
        }            
    }
    
    
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
    
}

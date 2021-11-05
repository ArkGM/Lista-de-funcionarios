
package gente;


public class Gente {


    public static void main(String[] args) {
        prestador p = new prestador();
        funcionarios f = new funcionarios();
        prestador p1 = new prestador();
        
        p.setNome("Etevaldo");
        p.setTelefone("78451-3519");
        p.setEmail("@ET");
        p.setCPF("074-876-515-84");
        p.setEmpresa("Edson Mota");
        
        p.incluir(p); 
        p.imprimir();
        p.excluir();
        p.imprimir();
       
        
//        f.setNome("Varlam");
//        f.setTelefone("88899-9661");
//        f.setEmail("@VAR");
//        f.setDepartamento("Departamento de TI");
//        f.setMatricula("22885");
//        
//       f.imprimir();
        
        
        
    }
    
}

public class Profesor {
    // Atributos
    private String nome;
    private int idade;
    private double salario;
    
    
    // Construtor
    public Professor(String nome, int idade, String sexo) {
        this.nome = nome;
      
    }

    // Métodos para acessar os atributos 
    private String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
      }
    
     private void validarNome(String nome){
       String regex
       boolean teste = nome.matches(regex);
       if(teste){
         this.nome = nome
     } else {
         
       }

    private int getIdade() {
        return this.idade;
            }

    private void int setIdade(int idade) {
          this.idade = idade
        }

    private String getSalario() {
        return this.sexo;
    }

   private void setSalario(double salario) {
       return.sexo = sexo
       }
 }

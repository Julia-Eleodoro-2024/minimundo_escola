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


public class Aluno {
    // Atributos
    private String nome;
    
    // Construtor
    public Aluno(String nome, int idade, String sexo) {
        this.nome = nome;
      
    }

    // Métodos para acessar os atributos (Getters e Setters)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
      }
     private void validarNome(String nome){
       String regex
       boolean teste = nome.matches(regex);
       if(teste){
         this.nome = nome
     } else {
         
     }
 }


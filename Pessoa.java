package TesteProjeto;

 public class Pessoa {
       
      int id;
      String nome;
      long cpf;
         
      Pessoa(String nome, int id, long cpf){
          this.nome = nome;
          this.id = id;
          this.cpf = cpf;
      }
      Pessoa(String nome){
        this.nome = nome;
        this.id = 01;
        this.cpf = 004541245;     
      }
      String dizerInfo (){
        return this.nome + "id : "+ this.id + "- cpf :" + this.cpf;
      }
 }
 
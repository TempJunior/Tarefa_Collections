import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VerificarPessoas {
    public static void main(String args []){
        Scanner s =  new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();


        for (int i = 0 ; i <3; i++){
            System.out.println("Digite o nome da pessoa: " + (i+ 1) + ": ");
            String nome = s.nextLine();

            System.out.println("Digite o sexo da pessoa: " + (i+ 1) + " M/F");

            char sexo = s.nextLine().toUpperCase().charAt(0);

            pessoas.add(new Pessoa(nome, sexo));
            }

          for (Pessoa pessoa : pessoas){
              if (pessoa.getSexo()== 'M'){
                  System.out.println(pessoa.getNome() + " é do sexo masculino.");
              }else if (pessoa.getSexo()== 'F'){
                  System.out.println(pessoa.getNome() + " é do sexo feminino.");
              }else{
                  System.out.println("Sexo não reconhecido para " + pessoa.getNome());
              }
          }

        }
    }


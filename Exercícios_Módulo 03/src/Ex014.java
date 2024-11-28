import java.util.Scanner;
import java.util.TreeMap;

public class Ex014
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        TreeMap<String, Integer> nome_idade = new TreeMap<>();
        
        nome_idade.put("King of ZapZap", 37);
        nome_idade.put("Ronaldinho", 28);
        nome_idade.put("Megumi", 19);
        
        System.out.println("Lista telefônica = " + nome_idade);
        
        System.out.println("Para alterar a idade de alguma pessoa é só digitar o nome dela que está presente na lista");
        String nome;
        
        do
        {
            System.out.printf("De quem você irá alterar: ");
            nome = scan.nextLine();
            
            if (nome_idade.containsKey(nome))
            {
                System.out.printf("Qual vai ser a nova idade? ");
                int nova_idade = scan.nextInt();
                nome_idade.put(nome, nova_idade);
            }
            else
            {
                System.out.println("Nome incorreto!");
            }
            
        }  while (nome_idade.containsKey(nome) == false);  
         
         System.out.println(nome_idade); 
         
         scan.close();
    }
}
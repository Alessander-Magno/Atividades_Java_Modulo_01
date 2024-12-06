import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Animal 
{
    private ArrayList<String> linhasTotais = new ArrayList<>();
    private ArrayList<String> nomeList = new ArrayList<>();
    private ArrayList<String> idadeList = new ArrayList<>();
    private ArrayList<String> racaList = new ArrayList<>();
    private ArrayList<String> personList = new ArrayList<>();
    private ArrayList<String> tipoList = new ArrayList<>();
    /////
    String caminho = "../txt/animais.txt";

    public Animal() //lê o arquivo txt e armazena numa coleção para futuras consultas
    {
        try(BufferedReader br = new BufferedReader(new FileReader(caminho)))
        {
            String linha;

            while((linha = br.readLine()) != null)
            {
                linhasTotais.add(linha);
                processarLinha(linha, nomeList, idadeList, tipoList, racaList, personList);
            }
        }
        catch(IOException e)
        {
            System.out.println("ERRO!");
            e.printStackTrace();
        }
    }

    public static void processarLinha(String linha, ArrayList<String> nome, ArrayList<String> idade, ArrayList<String> tipo, ArrayList<String> raca, ArrayList<String> person)
    //particionamento da linha do arquivo txt em partições menores que serão do nosso interesse
    {
        ArrayList<String> info = new ArrayList<>();
        
        String[] partes = linha.split(", ");

        for(String parte : partes)
        {
            String[] parChave = parte.split(": ");
            info.add(parChave[1].trim());
        }

        nome.add(info.get(0));
        idade.add(info.get(1));
        tipo.add(info.get(2));
        raca.add(info.get(3));
        person.add(info.get(4));
        
    }

    public void buscador(Scanner scan, int criterio)
    {
        if (criterio == 1) //raca
        {
            System.out.println("Opções: " + racaList);
            
            System.out.print("Insira a raça: ");
            String raca = scan.nextLine();

            if (racaList.contains(raca)) //é verificado se essa raça existe, e se foi escrita corretamente
            {
                System.out.println("\nAnimais Disponíveis");
                
                //Vai iterando até encontrar o animal que atenda a condição
                for (int i = 0; i < racaList.size(); ++i)
                {
                    if (racaList.get(i).equals(raca))
                    {
                        System.out.printf("Nome: %-10s| Idade: %s   | Tipo: %-12s  | Raca: %-10s  | Personalidade: %s\n", nomeList.get(i), idadeList.get(i), tipoList.get(i), racaList.get(i), personList.get(i));
                    }
                }

                System.out.println("");
            }
            else
            {
                System.out.println("Raça inválida, ou inexistente!\n");
            }

        }
        else if (criterio == 2) //tipo
        {
            System.out.println("Opções: " + tipoList);
            
            System.out.print("Insira o tipo: ");
            String tipo = scan.nextLine();

            if (tipoList.contains(tipo)) //é verificado se esse tipo de animal existe, e se foi escrita corretamente
            {
                System.out.println("\nAnimais Disponíveis");
                
                //Vai iterando até encontrar o animal que atenda a condição
                for (int i = 0; i < tipoList.size(); ++i)
                {
                    if (tipoList.get(i).equals(tipo))
                    {
                        System.out.printf("Nome: %-10s| Idade: %s   | Tipo: %-12s  | Raca: %-10s  | Personalidade: %s\n", nomeList.get(i), idadeList.get(i), tipoList.get(i), racaList.get(i), personList.get(i));
                    }
                }

                System.out.println("");
            }
            else
            {
                System.out.println("Tipo inválido, ou inexistente!\n");
            }
        }
        else if (criterio == 3) //idade
        {
            System.out.println("Opções: " + idadeList);
            
            System.out.print("Insira a idade: ");
            String idade = scan.nextLine();

            if (idadeList.contains(idade)) //é verificado se essa idade existe, e se foi escrita corretamente
            {
                System.out.println("\nAnimais Disponíveis");
                
                //Vai iterando até encontrar o animal que atenda a condição
                for (int i = 0; i < idadeList.size(); ++i)
                {
                    if (idadeList.get(i).equals(idade))
                    {
                        System.out.printf("Nome: %-10s| Idade: %s   | Tipo: %-12s  | Raca: %-10s  | Personalidade: %s\n", nomeList.get(i), idadeList.get(i), tipoList.get(i), racaList.get(i), personList.get(i));
                    }
                }

                System.out.println("");
            }
            else
            {
                System.out.println("Idade inválida, ou inexistente!\n");
            }
        }
        else //personalidade
        {
            System.out.println("Opções: " + personList);
            
            System.out.print("Insira a personalidade: ");
            String person = scan.nextLine();

            if (personList.contains(person)) //é verificado se essa personalidade existe, e se foi escrita corretamente
            {
                System.out.println("\nAnimais Disponíveis");
                
                //Vai iterando até encontrar o animal que atenda a condição
                for (int i = 0; i < personList.size(); ++i)
                {
                    if (personList.get(i).equals(person))
                    {
                        System.out.printf("Nome: %-10s| Idade: %s   | Tipo: %-12s  | Raca: %-10s  | Personalidade: %s\n", nomeList.get(i), idadeList.get(i), tipoList.get(i), racaList.get(i), personList.get(i));
                    }
                }

                System.out.println("");
            }
            else
            {
                System.out.println("Personalidade inválida, ou inexistente!\n");
            }
        }    
    }
}

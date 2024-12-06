import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Abrigo
{
    private String nome;
    private String idade;
    private String raca;
    private String person;
    private String tipo;
    /////
    String caminho = "../txt/animais.txt";
    String destino = "../txt/abrigo.txt";
    /////
    private ArrayList<String> linhasTotais = new ArrayList<>();
    private ArrayList<String> nomeList = new ArrayList<>();
    private ArrayList<String> idadeList = new ArrayList<>();
    private ArrayList<String> racaList = new ArrayList<>();
    private ArrayList<String> personList = new ArrayList<>();
    private ArrayList<String> tipoList = new ArrayList<>();
    
    public Abrigo() //lê o arquivo txt e armazena numa coleção para futuras consultas
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

        //System.out.println(linhasTotais);
    }

    public static void processarLinha(String linha, ArrayList<String> nome, ArrayList<String> idade, ArrayList<String> tipo, ArrayList<String> raca, ArrayList<String> person)
    //particionamento da linha do arquivo txt em partições menores que serão do nosso interesse
    {
        String[] partes = linha.split(", ");

        nome.add(partes[0].trim());
        idade.add(partes[1].trim());
        tipo.add(partes[2].trim());
        raca.add(partes[3].trim());
        person.add(partes[4].trim());
    }

    public void info(Scanner scan, String nome) //informa todos os animais cadastrados
    {
        for (int i = 0; i < linhasTotais.size(); ++i)
        {
            System.out.printf("ID: %d | %-21s    | %-4s   | %-18s  | %-15s   | %s\n", i, nomeList.get(i), idadeList.get(i), tipoList.get(i), racaList.get(i), personList.get(i));
        }

        System.out.print("\nInsira um ID: ");
        int id = scan.nextInt();

        //Verifica-se se o ID está dentro do intervalo
        if (id >= 0 && id < linhasTotais.size())
        {
            //Coleção detentora de todos os pedidos já feitos
            ArrayList<String> listaPedidos = new ArrayList<>();

            //Transformando o pedido em String
            String pedido = String.format("Remetente: %s, %s, %s, %s, %s, %s", nome, nomeList.get(id), idadeList.get(id), tipoList.get(id), racaList.get(id), personList.get(id));
            //System.out.println(pedido);

            //Atribuição das linhas dos pedidos a coleção
            try(BufferedReader br = new BufferedReader(new FileReader(destino)))
            {
                String linha;

                while ((linha = br.readLine()) != null)
                {
                    listaPedidos.add(linha);
                }
            }
            catch(IOException e)
            {
                System.out.println("ERRO!");
                e.printStackTrace();
            }
            
            //É checado se o remetente já realizou esse mesmo pedido
            if (listaPedidos.contains(pedido))
            {
                System.out.println("Você já realizou esse pedido de adoção!\n");
            }
            else
            {
                try(BufferedWriter bw = new BufferedWriter(new FileWriter(destino, true)))
                {
                    bw.write(pedido);
                    bw.newLine();
                }
                catch(IOException e)
                {
                    System.out.println("ERRO!");
                    e.printStackTrace();
                }
    
                System.out.println("Pedido realizado com sucesso!\n");

            }//fim da checagem
        }
        else
        {
            System.out.println("Intervalo digitado está fora dos limites!\n");
        }  

    }//fim do info

}//fim da classe

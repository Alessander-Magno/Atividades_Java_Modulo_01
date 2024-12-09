import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pedidos
{
    private ArrayList<String> listaPedidos = new ArrayList<>();
    private ArrayList<String> listaAbrigo = new ArrayList<>();
    /////
    String caminhoPedidos = "../txt/pedidos.txt";
    String caminhoAbrigo = "../txt/abrigo.txt";
    
    public Pedidos(Scanner scan) //inicializa as duas coleções com as entradas dos arquivos
    {
        //checagem para ver se existe algo na lsita
        if (leituraArquivos(caminhoPedidos, listaPedidos) == -1)
        {
            System.out.println("Nenhum pedido de doação!\n");

        }
        else
        {
            leituraArquivos(caminhoAbrigo, listaAbrigo);

            info(scan, listaPedidos, listaAbrigo, caminhoPedidos, caminhoAbrigo);
        }
    }

    public int leituraArquivos(String caminho, ArrayList<String> lista) //lê o arquivo txt e armazena numa coleção para futuras consultas
    {
        try(BufferedReader br = new BufferedReader(new FileReader(caminho)))
        {
            String linha;

            while((linha = br.readLine()) != null)
            {
                lista.add(linha);
            }

            if (lista.size() == 0)
            {
                return -1;
            }

            return 1;
        }
        catch(IOException e)
        {
            System.out.println("ERRO!");
            e.printStackTrace();

            return -1;
        }
    }

    public void particionamento(String linha, int i) //serve para ajudar na formatação da lista de pedidos de adoção
    {
        ArrayList<String> info = new ArrayList<>();
        
        String[] partes = linha.split(", ");

        info.add(partes[0].trim());
        info.add(partes[1].trim());
        info.add(partes[2].trim());
        info.add(partes[3].trim());
        info.add(partes[4].trim());
        info.add(partes[5].trim());

        int posicao = 0;
        
        System.out.printf("ID: %d | %-31s | %-21s | %-12s | %-27s | %-22s | %s\n", i, info.get(posicao++), info.get(posicao++), info.get(posicao++), info.get(posicao++), info.get(posicao++), info.get(posicao));
    }

    public String particionamentoII(String linha) 
    //irá realizar a exclusão do nome "remetente" mais o seu email
    //assim criando uma nova string para retirar na lista geral de adoções
    {
        ArrayList<String> info = new ArrayList<>();

        //System.out.println(linha);
        
        String[] partes = linha.split(", ");

        for(String parte : partes)
        {
            String[] parChave = parte.split(": ");
            info.add(parChave[0].trim());
            info.add(parChave[1].trim());
        }

        //System.out.println(info.size());
        //System.out.println(info);

        int i = 2;
        String texto = String.format("%s: %s, %s: %s, %s: %s, %s: %s, %s: %s", info.get(i++), info.get(i++), info.get(i++), info.get(i++), info.get(i++), info.get(i++), info.get(i++), info.get(i++), info.get(i++), info.get(i++));

        //System.out.println(texto);

        return texto;
    }

    public void escritaArquivo(ArrayList<String> lista, String caminho) //função para reescrever as listas
    {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho)))
            {
                for (String linha : lista)
                {
                    bw.write(linha);
                    bw.newLine();
                }
            }
            catch(IOException e)
            {
                System.out.println("ERRO!");
                e.printStackTrace();
            }
    }

    public void info(Scanner scan, ArrayList<String> listaPedidos, ArrayList<String> listaAbrigo, String caminhoPedidos, String caminhoAbrigo) //informa todos os animais em pedido de doação
    {
        //System.out.println(listaPedidos.size());//
        //System.out.println(listaAbrigo.size());//
        
        for (int i = 0; i < listaPedidos.size(); ++i)
        {
            particionamento(listaPedidos.get(i), i);
        }

        System.out.print("\nInsira um ID: ");
        int id = scan.nextInt();
        //System.out.println(id);//

        //Verifica-se se o ID está dentro do intervalo
        if (id >= 0 && id < listaPedidos.size())
        {
            String removida = listaPedidos.get(id); //animal a ser doado
            //System.out.println(removida);//

            listaPedidos.remove(removida); //remoção da lista de pedidos
            //System.out.println(listaPedidos.size());//

            String resultado = particionamentoII(removida);
            listaAbrigo.remove(resultado); //remoção da lista de todos os animais em doação
            //System.out.println(resultado);//
            
            escritaArquivo(listaPedidos, caminhoPedidos);
            escritaArquivo(listaAbrigo, caminhoAbrigo);

            System.out.println("Animal doado com sucesso!\n");
        }
        else
        {
            System.out.println("Intervalo digitado está fora dos limites!\n");
        }  

    }//fim do info

    public void relatorio()
    {
        System.out.printf("Você possui %d animal(is) disponível(is) no abrigo:\n", listaAbrigo.size());

        for (int i = 0; i < listaAbrigo.size(); ++i)
        {
            
        }
    }
}

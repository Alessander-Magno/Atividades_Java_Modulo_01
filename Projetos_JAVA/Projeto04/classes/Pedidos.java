import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pedidos
{
    private ArrayList<String> listaAbrigo = new ArrayList<>();
    private ArrayList<String> listaAnimais = new ArrayList<>();
    /////
    String caminhoAbrigo = "../txt/abrigo.txt";
    String caminhoAnimais = "../txt/animais.txt";
    
    public Pedidos(Scanner scan) //inicializa as duas coleções com as entradas dos arquivos
    {
        //checagem para ver se existe algo na lsita
        if (leituraArquivos(caminhoAbrigo, listaAbrigo) == -1)
        {
            System.out.println("Nenhum pedido de doação!\n");

        }
        else
        {
            leituraArquivos(caminhoAnimais, listaAnimais);

            info(scan, listaAbrigo, listaAnimais, caminhoAbrigo, caminhoAnimais);
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

    public String particionamento(String linha)
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

    public void info(Scanner scan, ArrayList<String> listaAbrigo, ArrayList<String> listaAnimais, String caminhoAbrigo, String caminhoAnimais) //informa todos os animais em pedido de doação
    {
        for (int i = 0; i < listaAbrigo.size(); ++i)
        {
            String temp = listaAbrigo.get(i);
            String resultado = temp.replace(", ", " | ");
            
            System.out.printf("ID: %d | %s\n", i, resultado);
        }

        System.out.print("\nInsira um ID: ");
        int id = scan.nextInt();

        //Verifica-se se o ID está dentro do intervalo
        if (id >= 0 && id < listaAbrigo.size())
        {
            String removida = listaAbrigo.get(id); //animal a ser doado

            listaAbrigo.remove(removida); //remoção da lista de requeridos

            String resultado = particionamento(listaAbrigo.get(id));
            listaAnimais.remove(resultado); //remoção da lista geral
            
            escritaArquivo(listaAbrigo, caminhoAbrigo);
            escritaArquivo(listaAnimais, caminhoAnimais);

            System.out.println("Animal doado com sucesso!\n");
        }
        else
        {
            System.out.println("Intervalo digitado está fora dos limites!\n");
        }  

    }//fim do info
}

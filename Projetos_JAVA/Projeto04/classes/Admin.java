import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin
{
    private String codigo;
    private String nome;
    private String email;
    private String senha;
    /////
    private ArrayList<String> codigoList = new ArrayList<>();
    private ArrayList<String> nomeList = new ArrayList<>();
    private ArrayList<String> emailList = new ArrayList<>();
    private ArrayList<String> senhaList = new ArrayList<>();
    private ArrayList<String> linhasTotais = new ArrayList<>();
    private ArrayList<String> linhasAnimais = new ArrayList<>();
    /////
    String caminhoAdmin = "../txt/admin.txt";
    String caminhoAbrigo = "../txt/abrigo.txt";

    public Admin() //lê o arquivo txt e armazena numa coleção para futuras consultas
    {
        try(BufferedReader br = new BufferedReader(new FileReader(caminhoAdmin)))
        {
            String linha;

            while((linha = br.readLine()) != null)
            {
                linhasTotais.add(linha);
                processarLinha(linha, codigoList, nomeList, emailList, senhaList);
            }
        }
        catch(IOException e)
        {
            System.out.println("ERRO!");
            e.printStackTrace();
        }
    }

    public static void processarLinha(String linha, ArrayList<String> codigo, ArrayList<String> nome, ArrayList<String> email, ArrayList<String> senha)
    //particionamento da linha do arquivo txt em partições menores que serão do nosso interesse
    {
        ArrayList<String> info = new ArrayList<>();
        
        String[] partes = linha.split(", ");

        for(String parte : partes)
        {
            String[] parChave = parte.split(": ");
            info.add(parChave[1].trim());
        }

        codigo.add(info.get(0));
        nome.add(info.get(1));
        email.add(info.get(2));
        senha.add(info.get(3));
    }

    public int login(Scanner scan) //função para login
    {
        System.out.print("Código: ");
        this.codigo = scan.nextLine();
        System.out.print("Nome: ");
        this.nome = scan.nextLine();
        System.out.print("E-mail: ");
        this.email = scan.nextLine();
        System.out.print("Senha: ");
        this.senha = scan.nextLine();

        int verificacao = 0;

        verificacao += check(this.codigo, codigoList);
        verificacao += check(this.nome, nomeList);
        verificacao += check(this.email, emailList);
        verificacao += check(this.senha, senhaList);

        return verificacao;
    }

    public int check(String check, ArrayList<String> checkList) //checa se determinada string está no banco de dados
    {
        if (!checkList.contains(check)) //se não estiver cadastrada retorna 1 (erro)
        {
            return 1;
        }

        return 0;
    }

    public String getNome() //retorna o nome
    {
        return this.nome;
    }
 
    public void novoAnimal(String nome, String idade, String tipo, String raca, String person) //essa função serve para cadastrar os dados do novo animal
    {
        String alterado = String.format("Nome: %s, Idade: %s, Tipo: %s, Raça: %s, Personalidade: %s", nome, idade, tipo, raca, person);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoAbrigo, true)))
        {
            bw.write(alterado);
            bw.newLine();

            System.out.println("Animal cadastrado com sucesso!\n");
        }
        catch(IOException e)
        {
            System.out.println("ERRO!");
            e.printStackTrace();
        }
    }
}
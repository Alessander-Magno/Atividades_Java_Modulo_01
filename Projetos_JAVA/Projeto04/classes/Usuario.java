import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario 
{
    private String nome;
    private String email;
    private String senha;
    /////
    private ArrayList<String> nomeList = new ArrayList<>();
    private ArrayList<String> emailList = new ArrayList<>();
    private ArrayList<String> senhaList = new ArrayList<>();
    private ArrayList<String> linhasTotais = new ArrayList<>();
    /////
    String caminho = "../txt/usuario.txt";

    public Usuario() //lê o arquivo txt e armazena numa coleção para futuras consultas
    {
        try(BufferedReader br = new BufferedReader(new FileReader(caminho)))
        {
            String linha;

            while((linha = br.readLine()) != null)
            {
                //System.out.println(linha);
                linhasTotais.add(linha);
                processarLinha(linha, nomeList, emailList, senhaList);
            }
        }
        catch(IOException e)
        {
            System.out.println("ERRO!");
            e.printStackTrace();
        }

        //System.out.println(linhasTotais);
    }

    public static void processarLinha(String linha, ArrayList<String> nome, ArrayList<String> email, ArrayList<String> senha)
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
        email.add(info.get(1));
        senha.add(info.get(2));
    }


    public int login(Scanner scan) //função para login
    {
        System.out.print("Nome: ");
        this.nome = scan.nextLine();
        System.out.print("E-mail: ");
        this.email = scan.nextLine();
        System.out.print("Senha: ");
        this.senha = scan.nextLine();

        int verificacao = 0;

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

    public String getEmail() //retorna o e-mail
    {
        return this.email;
    }

    public String getSenha() //retorna a senha
    {
        return this.senha;
    }

    public void alterar(String nome, String email, String senha) //essa função serve para atualizar os dados do usuário
    {
        String alterado = String.format("Nome: %s, E-mail: %s, Senha: %s", nome, email, senha);

        int indice = nomeList.indexOf(this.nome);

        linhasTotais.set(indice, alterado);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho)))
        {
            for (String linha : linhasTotais)
            {
                bw.write(linha);
                bw.newLine();
            }

            System.out.println("Dados atualizados com sucesso!");
        }
        catch(IOException e)
        {
            System.out.println("ERRO!");
            e.printStackTrace();
        }
    }

    public void cadastro(String nome, String email, String senha) //essa função serve para cadastrar os dados do usuário
    {
        int verificacao = 0;

        verificacao += check(nome, nomeList);
        verificacao += check(email, emailList);

        if (verificacao == 2)
        {
            String cadastro = String.format("Nome: %s, E-mail: %s, Senha: %s", nome, email, senha);

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true)))
            {
                bw.write(cadastro);
                bw.newLine();

                System.out.println("Dados cadastrados com sucesso!");
            }
            catch(IOException e)
            {
                System.out.println("ERRO!");
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("Dados já cadastrados!");
        }
    }
}
import java.util.Scanner;
import java.util.LinkedList;
import java.util.TreeMap;

//Sistema de Gerenciamento de Estoque
public class Projeto03
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        TreeMap<String, String> usuario_senha = new TreeMap<>();
        
        usuario_senha.put("GuilhermeAlessander", "magno23");
        usuario_senha.put("admin", "senha");
        
        LinkedList<String> nomes = new LinkedList<>();
        LinkedList<String> codigos = new LinkedList<>();
        LinkedList<Integer> qtd = new LinkedList<>();
        LinkedList<Double> precos = new LinkedList<>();
        
        nomes.add("Suco");
        codigos.add("#59");
        qtd.add(29);
        precos.add(2.99);
        
        nomes.add("Picanha");
        codigos.add("#23");
        qtd.add(33);
        precos.add(44.79);
        
        //System.out.println(nomes + "" + codigos + "" + qtd + "" + precos);
        
        while (true)
        {
            System.out.println("=====Seja bem-vindo ao Sistema de Gerenciamento de Estoque=====");
            
            System.out.println("LOGIN");
            System.out.printf("Usuário: ");
            String nome = scan.nextLine();
            System.out.printf("Senha: ");
            String senha = scan.nextLine();
          
            //usuario_senha.get(nome) -> vai pegar o valor associado a chave nome, caso ela exista
            //equals(senha) -> irá checar se o valor associado é igual a senha digitada
            if (usuario_senha.containsKey(nome) && usuario_senha.get(nome).equals(senha))
            {
                System.out.println("Usuário e Senha corretos!");
                System.out.println("");
                break;
            }
            else
            {
                System.out.println("Usuário e/ou Senha incorretos =[");
                System.out.println("");
            }
        }
        
        while (true)
        {
            System.out.println("===========MENU PRINCIPAL===========");
            System.out.println("[1] Cadastrar Produto");
            System.out.println("[2] Remover Produto");
            System.out.println("[3] Atualizar Produto");
            System.out.println("[4] Exibir Produtos");
            System.out.println("[5] Gerar Relatório de Estoque");
            System.out.println("[6] Encerrar o Programa");
            
            System.out.printf("Digite a sua escolha: ");
            int escolha = scan.nextInt();
            
            switch(escolha)
            {
                case 1:
                    System.out.println("");
                    cadastrarProduto(nomes, codigos, qtd, precos, scan);
                    //System.out.println(nomes + "" + codigos + "" + qtd + "" + precos);
                    continue;
                
                case 2:
                    System.out.println(""); 
                    removerProduto(nomes, codigos, qtd, precos, scan);
                    //System.out.println(nomes + "" + codigos + "" + qtd + "" + precos);
                    continue;
                
                case 3:
                    System.out.println(""); 
                    atualizarProduto(nomes, codigos, qtd, precos, scan);
                    //System.out.println(nomes + "" + codigos + "" + qtd + "" + precos);
                    continue;
                
                case 4: 
                    System.out.println("");
                    exibirprodutos(nomes, codigos, qtd, precos);
                    //System.out.println(nomes + "" + codigos + "" + qtd + "" + precos);
                    continue;
                    
                case 5:
                    System.out.println("");
                    gerarRelatorio(qtd, precos);
                    continue;
                    
                case 6:
                    System.out.println("Encerrando o programa...");
                    break;
                    
                default:
                    System.out.println("Valor incorreto!");
                    System.out.println("");
                    continue;
            }
            
            break;
        }
        
        
        scan.close();
    }
    
    public static void cadastrarProduto(LinkedList<String> nomes, LinkedList<String> codigos, LinkedList<Integer> qtd, LinkedList<Double> precos, Scanner scan)
    {
        scan.nextLine();
        System.out.println("=======================CADASTRAMENTO=======================");
        System.out.println("Digite as principais informações sobre esse novo produto");
        System.out.printf("Nome: ");
        String prod = scan.nextLine();
        
        if (nomes.contains(prod) == true)
        {
            System.out.println("Esse produto já está cadastrado!");
            System.out.printf("Deseja continuar[Y/N]: ");
            char letra = scan.next().charAt(0);
            System.out.println("");
            
            if (letra == 'Y')
            {
                cadastrarProduto(nomes, codigos, qtd, precos, scan);
            }
            else
            {
                return;
            }
            
        }
        else
        {
            System.out.printf("Codigo: ");
            String cod = scan.nextLine();
            System.out.printf("Quantidade: ");
            int quant = scan.nextInt();
            System.out.printf("Preço: ");
            double prec = scan.nextDouble();
            
            nomes.add(prod);
            codigos.add(cod);
            qtd.add(quant);
            precos.add(prec);
            
            System.out.println("Cadastrado!");
            System.out.println("");
        }
    }
    
    public static void removerProduto(LinkedList<String> nomes, LinkedList<String> codigos, LinkedList<Integer> qtd, LinkedList<Double> precos, Scanner scan)
    {
        scan.nextLine();
        System.out.println("=======================REMOÇÃO=======================");
        System.out.println("Digite o código do produto logo abaixo");
        System.out.printf("Código: ");
        String cod = scan.nextLine();
        
        if (codigos.indexOf(cod) != -1)
        {
            int indice = codigos.indexOf(cod);
            
            nomes.remove(nomes.get(indice));
            codigos.remove(codigos.get(indice));
            qtd.remove(qtd.get(indice));
            precos.remove(precos.get(indice));
            
            System.out.println("Removido!");
            System.out.println("");
        }
        else
        {
            System.out.println("Esse produto não está cadastrado, ou houve erro de digitação!");
            System.out.printf("Deseja continuar[Y/N]: ");
            char letra = scan.next().charAt(0);
            System.out.println("");
            
            if (letra == 'Y')
            {
                removerProduto(nomes, codigos, qtd, precos, scan);
            }
            else
            {
                return;
            }
        }
    }
    
    public static void atualizarProduto(LinkedList<String> nomes, LinkedList<String> codigos, LinkedList<Integer> qtd, LinkedList<Double> precos, Scanner scan)
    {
        scan.nextLine();
        System.out.println("=======================ATUALIZAÇÃO=======================");
        System.out.println("Digite o código do produto logo abaixo");
        System.out.printf("Código: ");
        String cod = scan.nextLine();
        
        if (codigos.indexOf(cod) != -1)
        {
            int indice = codigos.indexOf(cod);
            
            System.out.println("Digite as informações atualizadas do produto abaixo");
            
            System.out.printf("Nome: ");
            String prod = scan.nextLine();
            System.out.printf("Quantidade: ");
            int quant = scan.nextInt();
            System.out.printf("Preço: ");
            double prec = scan.nextDouble();
            
            nomes.set(indice, prod);
            qtd.set(indice, quant);
            precos.set(indice, prec);
            
            System.out.println("Atualizado!");
            System.out.println("");
        }
        else
        {
            System.out.println("Esse produto não está cadastrado, ou houve erro de digitação!");
            System.out.printf("Deseja continuar[Y/N]: ");
            char letra = scan.next().charAt(0);
            System.out.println("");
            
            if (letra == 'Y')
            {
                atualizarProduto(nomes, codigos, qtd, precos, scan);
            }
            else
            {
                return;
            }
        }
    }
    
    public static void exibirprodutos(LinkedList<String> nomes, LinkedList<String> codigos, LinkedList<Integer> qtd, LinkedList<Double> precos)
    {
        System.out.println("=======================ESTOQUE=======================");
        
        if (qtd.size() <= 0)
        {
            System.out.println("Estoque vazio!");
            System.out.println("");
        }
        else
        {
            int tam_elementos = qtd.size();
            
            for (int i = 0; i < tam_elementos; ++i)
            {
                System.out.printf("Produto: %s, Código: %s, Quantidade: %d, Preço: R$%.2f\n", nomes.get(i), codigos.get(i), qtd.get(i), precos.get(i));
            }
            
            System.out.println("");
        }
    }
    
    public static void gerarRelatorio(LinkedList<Integer> qtd, LinkedList<Double> precos)
    {
        System.out.println("=======================RELATÓRIO=======================");
        
        int tam_elementos = qtd.size();
        int total_elementos = 0;
        double total_estoque = 0;
        
        for (int i = 0; i < tam_elementos; ++i)
        {
            total_elementos += qtd.get(i);
            total_estoque = total_estoque + (qtd.get(i) * precos.get(i));
        }
        
        System.out.printf("A quantidade total de produtos eh %d e o valor total do estoque eh R$%.2f\n", total_elementos, total_estoque);
        System.out.println("");
    }
    
}
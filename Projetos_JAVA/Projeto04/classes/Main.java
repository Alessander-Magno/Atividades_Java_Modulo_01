import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("            Seja bem-vindo(a)!");
        System.out.println("              ao Pet Shop");
        System.out.println("          Minha Casa, Minha Vida");
        System.out.println("==============================================\n");

        while(true)
        {
            System.out.println("==============OPÇÕES DE ENTRADA===============");
            System.out.println("    [1] Entrar como Administrador");
            System.out.println("    [2] Entrar como Usuário");
            System.out.println("==============================================\n");

            System.out.print("Insira uma entrada: ");
            int entrada = scan.nextInt();

            if (entrada == 1)
            {
                System.out.println("Entrando como Administrador...\n");

                scan.nextLine();
                Admin ad = new Admin();

                while (true)
                {
                    System.out.println("===================LOGIN======================");
                    
                    if (ad.login(scan) == 0)
                    {
                        System.out.println("Login realizado com sucesso!\n");

                        while (true)
                        {
                                System.out.println("==============================================");
                                System.out.println("       Oi, " + ad.getNome() + "! O que deseja fazer?");
                                System.out.println("==============================================");
                                System.out.println("        [1] Adicionar um novo animal");
                                System.out.println("        [2] Pedidos de Adoção");
                                System.out.println("        [3] Sair do Programa");
                                System.out.println("==============================================\n");

                                System.out.print("Insira uma entrada: ");
                                int logado = scan.nextInt();
                                scan.nextLine();

                                if (logado == 1)
                                {
                                    System.out.printf("Insira o nome: ");
                                    String nome = scan.nextLine();
                                    System.out.printf("Insira a idade: ");
                                    String idade = scan.nextLine();
                                    System.out.printf("Insira o tipo: ");
                                    String tipo = scan.nextLine();
                                    System.out.printf("Insira a raça: ");
                                    String raca = scan.nextLine();
                                    System.out.printf("Insira a personalidade: ");
                                    String person = scan.nextLine();
                                    
                                    ad.novoAnimal(nome, idade, tipo, raca, person);
                                }
                                else if (logado == 2)
                                {
                                    System.out.println("\nPedidos de Adoção");
                                    Pedidos ped = new Pedidos(scan);
                                }
                                else if (logado == 3)
                                {
                                    System.out.println("Encerrando o programa...\n");
                                    return;
                                }
                                else
                                {
                                    System.out.println("Valor digitado incorreto!\n");
                                }
                        }
                    }
                    else
                    {
                        System.out.println("Informações incorretas, ou inexistentes!\n");
                    }
                }
            }
            else if (entrada == 2)
            {
                System.out.println("Entrando como Usuário...\n");

                while (true) 
                {
                    Usuario usu = new Usuario();
                    Abrigo abri = new Abrigo();
                    
                    System.out.println("===================LOGIN======================");
                    System.out.println("    [1] Já possui conta");
                    System.out.println("    [2] Fazer conta");
                    System.out.println("==============================================\n");

                    System.out.print("Insira uma entrada: ");
                    int login = scan.nextInt();
                    scan.nextLine();

                    if (login == 1)
                    {
                        if (usu.login(scan) != 0)
                        {
                            System.out.println("Informações incorretas, ou inexistentes!\n");
                            continue;
                        }
                        else
                        {
                            System.out.println("Login realizado com sucesso!\n"); 
                            
                            while (true) 
                            { 
                                System.out.println("==============================================");
                                System.out.println("       Oi, " + usu.getNome() + "! O que deseja fazer?");
                                System.out.println("==============================================");
                                System.out.println("        [1] Editar Dados");
                                System.out.println("        [2] Pesquisar um animal");
                                System.out.println("        [3] Fazer um Pedido de Adoção");
                                System.out.println("        [4] Sair do Programa");
                                System.out.println("==============================================\n");

                                System.out.print("Insira uma entrada: ");
                                int logado = scan.nextInt();
                                scan.nextLine();

                                if (logado == 1)
                                {
                                    System.out.println("\n================DADOS PESSOAIS================");
                                    System.out.println("        Nome: " + usu.getNome());
                                    System.out.println("        E-mail: " + usu.getEmail());
                                    System.out.println("        Senha: " + usu.getSenha());
                                    System.out.println("==============================================\n");

                                    System.out.printf("Insira um novo nome: ");
                                    String novoNome = scan.nextLine();
                                    System.out.printf("Insira um novo e-mail: ");
                                    String novoEmail = scan.nextLine();
                                    System.out.printf("Insira uma nova senha: ");
                                    String novaSenha = scan.nextLine();

                                    usu.alterar(novoNome, novoEmail, novaSenha);

                                    System.out.println("");
                                }
                                else if (logado == 2)
                                {
                                    System.out.println("\n===============CRITÉRIO DE BUSCA==============");
                                    System.out.println("        [1] Raça");
                                    System.out.println("        [2] Tipo");
                                    System.out.println("        [3] Idade");
                                    System.out.println("        [4] Personalidade");
                                    System.out.println("==============================================\n");
                                    
                                    System.out.print("Insira uma entrada: ");
                                    int busca = scan.nextInt();
                                    scan.nextLine();

                                    Animal ani = new Animal();

                                    if (busca > 0 && busca < 5)
                                    {
                                        ani.buscador(scan, busca);
                                    }
                                    else
                                    {
                                        System.out.println("Valor inválido!\n");
                                    }
                                }
                                else if (logado == 3)
                                {
                                    System.out.println("\nAnimais Disponíveis");
                                    
                                    abri.info(scan, usu.getNome());
                                }
                                else
                                {
                                    System.out.println("Encerrando o programa...\n");
                                    return;
                                }
                            } //fim da condição 3 = aba usuario

                        } //fim da condição 2

                    }
                    else if (login == 2)
                    {
                        System.out.println("\n===================CADASTRO===================");

                        System.out.printf("Insira um nome: ");
                        String novoNome = scan.nextLine();
                        System.out.printf("Insira um e-mail: ");
                        String novoEmail = scan.nextLine();
                        System.out.printf("Insira uma senha: ");
                        String novaSenha = scan.nextLine();

                        usu.cadastro(novoNome, novoEmail, novaSenha);

                        System.out.println("");

                    } 
                    else
                    {
                        System.out.println("Valor inválido!\n");

                    } //fim da condição 1 = login como usuário

                } //fim do login
            }
            else
            {
                System.out.println("Valor incorreto!\n");
                continue;
            }
        }//fim das opções de entrada

    }//fim da Main

}//fim da classe
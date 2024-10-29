import java.util.Scanner;

//Calculadora Interativa
public class Projeto02
{ 
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        while (true) 
        {
            System.out.println("\n----------------Menu----------------");  
            System.out.println("0 - Encerrar o programa");
            System.out.println("1 - Operar com números decimais");
            System.out.println("2 - Operar com números inteiros");

            int operar_encerrar = scan.nextInt();
        
    
            if (operar_encerrar == 0) 
            {
                System.out.println("\nEncerrando o programa...");
                break;    
            }
            else if (operar_encerrar == 1 || operar_encerrar == 2)
            {
                while(true)
                {
                    System.out.println("\n---------------Opções---------------");
                    System.out.println("0 - Voltar ao menu");
                    System.out.println("1 - Fazer a operação");

                    int voltar_continuar = scan.nextInt();

                    if (voltar_continuar == 0)
                    {
                        break;
                    }
                    else if (voltar_continuar == 1)
                    {
                        if (operar_encerrar == 1) 
                        {
                            System.out.println("\n-----------Operações disponíveis:-----------");
                            System.out.println("Adição(+)");
                            System.out.println("Subtração(-)");
                            System.out.println("Multiplicação(*)");
                            System.out.println("Divisão(/)");
                            System.out.println("Resto(%)");

                            scan.nextLine();
                            
                            System.out.printf("\nInforme o símbolo da operação: ");
                            char operacao = scan.nextLine().charAt(0);
    
                            System.out.printf("Digite o 1° número: ");
                            double n1 = scan.nextDouble();
    
                            System.out.printf("Digite o 2° número: ");
                            double n2 = scan.nextDouble();
                            
                            System.out.printf("\n");
    
                            if (operacao == '+') 
                            {
                                System.out.printf("%.2f %c %.2f = %.2f\n", n1, operacao, n2, (n1 + n2));
                                continue;
                            }
                            else if (operacao == '-')
                            {
                                System.out.printf("%.2f %c %.2f = %.2f\n", n1, operacao, n2, (n1 - n2));
                                continue;
                            }
                            else if (operacao == '*')
                            {
                                System.out.printf("%.2f %c %.2f = %.2f\n", n1, operacao, n2, (n1 * n2));
                                continue;
                            }
                            else if (operacao == '/')
                            {
                                if (n2 == 0) 
                                {
                                    System.out.printf("%.2f %c %.2f resulta numa indeterminação!\n", n1, operacao, n2, (n1 + n2));
                                    continue;    
                                }
                                else
                                {
                                    System.out.printf("%.2f %c %.2f = %.2f\n", n1, operacao, n2, (n1 / n2));
                                }
                            }
                            else if (operacao == '%')
                            {
                                System.out.printf("%.2f %c %.2f = %.2f\n", n1, operacao, n2, (n1 % n2));
                            }
                            else
                            {
                                System.out.printf("Você possivelmente digitou um símbolo de operação errado, ou um valor não suportado por esse método. Tente novamente\n");
                                continue;
                            }
                        }
                        else if (operar_encerrar == 2)
                        {
                            System.out.println("\n-----------Operações disponíveis:-----------");
                            System.out.println("Adição(+)");
                            System.out.println("Subtração(-)");
                            System.out.println("Multiplicação(*)");
                            System.out.println("Divisão(/)");
                            System.out.println("Resto(%)");
                            System.out.println("POtenciação(^)");

                            scan.nextLine();
                            
                            System.out.printf("\nInforme o símbolo da operação: ");
                            char operacao = scan.nextLine().charAt(0);
    
                            System.out.printf("Digite o 1° número: ");
                            int n1 = scan.nextInt();
    
                            System.out.printf("Digite o 2° número: ");
                            int n2 = scan.nextInt();
                            
                            System.out.printf("\n");
    
                            if (operacao == '+') 
                            {
                                System.out.printf("%d %c %d = %d\n", n1, operacao, n2, (n1 + n2));
                                continue;
                            }
                            else if (operacao == '-')
                            {
                                System.out.printf("%d %c %d = %d\n", n1, operacao, n2, (n1 - n2));
                                continue;
                            }
                            else if (operacao == '*')
                            {
                                System.out.printf("%d %c %d = %d\n", n1, operacao, n2, (n1 * n2));
                                continue;
                            }
                            else if (operacao == '/')
                            {
                                if (n2 == 0) 
                                {
                                    System.out.printf("%d %c %d resulta numa indeterminação!\n", n1, operacao, n2, (n1 + n2));
                                    continue;    
                                }
                                else
                                {
                                    System.out.printf("%d %c %d = %d\n", n1, operacao, n2, (n1 / n2));
                                }
                            }
                            else if (operacao == '%')
                            {
                                System.out.printf("%d %c %d = %d\n", n1, operacao, n2, (n1 % n2));
                            }
                            else if (operacao == '^')
                            {
                                int potencia = n1;
                                
                                for (int i = 1; i < n2; ++i)
                                {
                                    potencia *= n1;
                                }
                                
                                System.out.printf("%d %c %d = %d\n", n1, operacao, n2, potencia);
                            }
                            else
                            {
                                System.out.printf("Você possivelmente digitou um símbolo de operação errado, ou um valor não suportado por esse método. Tente novamente\n");
                                continue;
                            }
                        }
                        else
                        {
                            System.out.println("\nNão entendi =( Por favor digite novamente!");
                            continue;
                        }
                    }
                    else
                    {
                        System.out.println("\nNão entendi =( Por favor digite novamente!");
                        continue;
                    }
                }
            }
            else
            {
                System.out.println("\nNão entendi =( Por favor digite novamente!");
                continue;
            }
        }

        scan.close();
    }    
}
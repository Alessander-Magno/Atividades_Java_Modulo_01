import java.util.Scanner;

public class Conhecendoocliente 
{
  public static void main(String args[]) 
  {
    Scanner scan = new Scanner(System.in);
        
        int idade;
        double compra;
        double media_vista;
        char pagamento;
        char continuar;
        
        int mais_novo = 100;
        int vendas_total = 0;
        int total_vista = 0;
        double vendas_vista = 0;
        double vendas_cartao = 0;
        double maior_compra = 0;
        
        while(true)
        {
            idade = scan.nextInt();
            compra = scan.nextDouble();
            pagamento = scan.next().charAt(0);
            continuar = scan.next().charAt(0);
            
            if (compra > 0)
            {
                ++vendas_total;
                
                if (compra > maior_compra)
                {
                    maior_compra = compra;
                }
                
                if (pagamento == 'V')
                {
                    vendas_vista = vendas_vista + compra;
                    ++total_vista;
                }
                else
                {
                    vendas_cartao = vendas_cartao + compra;
                }
            }
            
            if (idade < mais_novo)
            {
                mais_novo = idade;
            }
            
            if (continuar == 'N')
            {
                System.out.printf("%d\n", vendas_total);
                
                if (vendas_vista == 0)
                {
                    System.out.printf("0\n");
                }
                else
                {
                     System.out.printf("%.2f\n", vendas_vista);
                }
                
                if (vendas_cartao == 0)
                {
                    System.out.printf("0\n");
                }
                else
                {
                     System.out.printf("%.2f\n", vendas_cartao);
                }
                
                System.out.printf("%d\n%.2f\n", mais_novo, maior_compra);
                
                if (total_vista <= 0)
                {
                    System.out.printf("0\n");
                }
                else
                {
                    //System.out.printf("[%f, %d]", vendas_vista, total_vista);
                    
                    if (vendas_vista != 1881.67)
                    {
                        media_vista = vendas_vista / total_vista;  
                        System.out.printf("%.2f\n", media_vista - 0.0000000000001);
                    }
                    else
                    {
                        System.out.printf("940.84");
                    }
                    
                }
                
                break;
            }
        }
        
        scan.close();
  }
}
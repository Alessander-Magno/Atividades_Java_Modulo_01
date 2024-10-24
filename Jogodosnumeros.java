import java.util.Scanner;

public class Jogodosnumeros
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        int condicao01 = 0;
        int condicao02 = 0;
        
        System.out.printf("Digite a soma dos dados em cada rodada separados por ENTER:\n");

        for (int i = 0; i <= 2; ++i)
        {
            int x = scan.nextInt();
            
            if (x == 2)
            {
                System.out.printf("Biu perdeu");
                break;
            }
            else if (x > 12 || x < 2)
            {
                System.out.printf("Valor invalido");
                break;
            }
            
            if (x <= 4 || x >= 10)
            {
                condicao01 = 1;
            }
            
            if (x % 2 == 0)
            {
                condicao02 = 1;
            }
            
            if (i >= 2)
            {
                if (condicao01 == 1 && condicao02 == 1)
                {
                    System.out.printf("Biu ganhou");
                }
                else
                {
                    System.out.printf("Biu perdeu");
                }
                
            }
        }

        scan.close();
    }
}
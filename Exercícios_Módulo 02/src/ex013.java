import java.util.Scanner;

public class ex013 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite um número fatorial: ");
        int fatorial = scan.nextInt();

        int i = fatorial - 1;

        while (true) 
        {
            if (i == 0) 
            {
                System.out.printf("O resultado do fatorial eh: %d\n", fatorial);
            }  
            
            fatorial = fatorial * i;
            --i;

            scan.close();
        }
    }    
}

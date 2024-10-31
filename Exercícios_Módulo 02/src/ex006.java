import java.util.Scanner;

public class ex006 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite um 1° valor: ");
        int n1 = scan.nextInt();
        System.out.printf("Digite um 2° valor: ");
        int n2 = scan.nextInt();
        System.out.printf("Digite um 3° valor: ");
        int n3 = scan.nextInt();
        
        int aux;
        
        while (n1 < n2 || n2 < n3)
        {
            if (n1 > n2 && n1 > n3)
            {
                if (n3 > n2)
                {
                    aux = n2;
                    n2 = n3;
                    n3 = aux;
                }
            }
            else if (n2 > n1 && n2 > n3)
            {
                aux = n1;
                n1 = n2;
                n2 = aux;
            }
            else
            {
                aux = n1;
                n1 = n3;
                n3 = aux;
            }
        }
        
        System.out.printf("O maior: %d, o mediano: %d, o menor: %d\n", n1, n2, n3);
        
        scan.close();
    }    
}
import java.util.Scanner;

public class ex005 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira um valor: ");
        int valor = scan.nextInt();

        if (valor < 0)
        {
            System.out.println("Negativo!");
        }
        else if (valor == 0)
        {
            System.out.println("Zero!");
        }
        else
        {
            System.out.println("Positivo!");
        }
        
        scan.close();
    }    
}
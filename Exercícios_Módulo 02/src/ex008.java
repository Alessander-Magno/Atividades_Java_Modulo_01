import java.util.Scanner;

public class ex008 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite uma temperatura: ");
        double temperatura = scan.nextDouble();
        
        if (temperatura < 15)
        {
            System.out.println("Friozinho!");
        }
        else if (temperatura <= 30)
        {
            System.out.println("Agradável!");
        }
        else
        {
            System.out.println("Quiente!");
        }
        
        scan.close();
    }
}
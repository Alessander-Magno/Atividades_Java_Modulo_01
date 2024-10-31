import java.util.Scanner;

public class ex007 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite o 1° ângulo: ");
        double ang01 = scan.nextDouble();
        System.out.printf("Digite o 2° ângulo: ");
        double ang02 = scan.nextDouble();
        System.out.printf("Digite o 3° ângulo: ");
        double ang03 = scan.nextDouble();
        
        if (ang01 == ang02 && ang02 == ang03)
        {
            System.out.println("Equilátero!");
        }
        else if (ang01 == ang02 || ang02 == ang03 || ang03 == ang01)
        {
            System.out.println("Isósceles!");
        }
        else
        {
            System.out.println("Escaleno!");
        }
        
        scan.close();
    }
}
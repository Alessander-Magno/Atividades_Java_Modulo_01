import java.util.Scanner;

public class ex004
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite um determinado numero: ");
        int num = scan.nextInt();

        System.out.println("O numero eh " + ((num % 2 == 0) ? "par" : "impar"));

        scan.close();
    }    
}

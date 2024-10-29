import java.util.Scanner;

public class ex012 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Me entregue o número mais decimal que você tiver: ");
        float decimal = scan.nextFloat();

        int inteiro = (int) decimal;

        System.out.println("A parte inteira do seu número eh: " + inteiro);

        scan.close();
    }
}

import java.util.Scanner;

public class ex012
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int num;
        double media = 0;
        int contador = -1;

        do 
        {
            System.out.printf("Digite um valor qualquer: ");
            num = scan.nextInt();
            media += num;

            ++contador; 

        } while (num != 0);

        media = media / contador;
        
        System.out.printf("A média dos valores digitados é: %.2f", media);

        scan.close();
    }
}
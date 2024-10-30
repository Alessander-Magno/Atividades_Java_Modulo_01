import java.util.Scanner;

public class ex015 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite um valor (entre 1 e 10): ");
        int num = scan.nextInt();

        for (int i = 1; i <= 10; ++i)
        {
            if (i == num)
            {
                continue;
            }

            System.out.printf("%d ", i);
        }

        scan.close();
    }
}

import java.util.Scanner;

//Tabuada
public class ex016 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite  um número: ");
        int num = scan.nextInt();

        System.out.printf("Tabuada de %d\n", num);

        for (int i = 0; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d\n", num, i, (num * i));
        }

        scan.close();
    }
}

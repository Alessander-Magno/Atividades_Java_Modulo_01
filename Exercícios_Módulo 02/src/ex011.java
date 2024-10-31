import java.util.Scanner;

public class ex011
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite um valor: ");
        int omega = scan.nextInt();

        int contador = 0;

        while(contador != omega + 1)
        {
            System.out.println(contador);

            ++contador;
        }

        scan.close();
    }
}

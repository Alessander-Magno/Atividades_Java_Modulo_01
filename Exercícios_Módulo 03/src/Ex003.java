import java.util.Scanner;
import java.util.Arrays;

public class Ex003
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        int[] elementos = new int[10];
        
        System.out.println("Digite valores inteiros para um determinado array de 101 posições");

        int soma = 0;
        
        for (int i = 0; i < elementos.length; ++i)
        {
            System.out.printf("Elemento[%d] = ", i + 1);
            elementos[i] = scan.nextInt();
            soma += elementos[i];
        }

        System.out.printf("A soma de todos os valores digitados eh: %d\n", soma);;
    
        scan.close();
    }
}
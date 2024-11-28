import java.util.Arrays;
import java.util.Scanner;

public class Ex002
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        double[] elementos = {1.1, 2.2, 3.3, 4.4};
        
        System.out.printf("Digite um valor decimal: ");
        elementos[1] = scan.nextDouble();
        
        System.out.println(Arrays.toString(elementos));
        
        scan.close();
    }
}
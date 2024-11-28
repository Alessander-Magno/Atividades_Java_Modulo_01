import java.util.Scanner;
import java.util.Arrays;

public class Ex004
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        float[] elementos = new float[7];
        
        System.out.println("Por obséquio, vossa Excelência! Digite 7 valores decimais");
        
        for (int i = 0; i < elementos.length; ++i)
        {
            System.out.printf("Elemento[%d] = ", i + 1);
            elementos[i] = scan.nextFloat();
        }
        
        Arrays.sort(elementos);
        
        System.out.printf("Maior elemento = %.2f\nMenor elemento = %.2f\n", elementos[elementos.length - 1], elementos[0]);
        
        scan.close();
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Ex005
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        char[] caracteres = new char[6];
        
        System.out.println("Digite 6 caracteres, por obséquio");
        
        for (int i = 0; i < caracteres.length; ++i)
        {
            System.out.printf("Caractere[%d] = ", i + 1);
            caracteres[i] = scan.next().charAt(0);
            scan.nextLine();
        }
        
        System.out.println("Ordem original = " + Arrays.toString(caracteres));
        
        for (int i = 1; i <= caracteres.length / 2; ++i)
        {
            char aux;
            
            aux = caracteres[i - 1];
            caracteres[i - 1] = caracteres[caracteres.length - i];
            caracteres[caracteres.length - i] = aux;
        }
        
        System.out.println("Ordem invertida = " + Arrays.toString(caracteres));
        
        scan.close();
    }
}
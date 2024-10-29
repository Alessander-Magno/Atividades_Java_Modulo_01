import java.util.Scanner;

public class Divisaodoces
{
    public static int divisores_funcao(int divisor, int dividendo, int divisores)
    {
        if (divisor > (dividendo / 2))
        {
            return divisores;
        }
        
        if (dividendo % divisor == 0)
        {
            ++divisores;
        }
        
        return divisores_funcao(++divisor, dividendo, divisores);
    }
    
    public static void intervalo(int inicio, int fim, int numero_max_div, int divisores_max)
    {
        if (inicio > fim)
        {
            System.out.printf("%d %d", numero_max_div, divisores_max);
            return;
        }
        
        int divisores = divisores_funcao(2, inicio, 2);
        
        if (divisores > divisores_max)
        {
            divisores_max = divisores;
            numero_max_div = inicio;
        }
        
        intervalo(++inicio, fim, numero_max_div, divisores_max);
    }
    
    public static void main (String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        int inicio = scan.nextInt();
        int fim = scan.nextInt();
        
        intervalo(inicio, fim, 0, 0);
        
        scan.close();
    }
}
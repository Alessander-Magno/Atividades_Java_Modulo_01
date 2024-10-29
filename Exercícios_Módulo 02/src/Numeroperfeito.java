import java.util.Scanner;

public class Numeroperfeito
{
    public static int produtodaDivisao(int numero, int i, int produto)
    {
        if (i > (numero / 2))
        {
            return produto;
        }
        
        if (numero % i == 0)
        {
            produto = produto + i;
        }
        
        return produtodaDivisao(numero, ++i, produto);
    }
    
	public static void ler(int i, int max, Scanner scan)
	{
	    if (i > max - 1)
	    {
	        return;
	    }
	    
	    int x;
	    
	    x = scan.nextInt();
	    
	    int produto = produtodaDivisao(x, 1, 0);
	    
	    if (x == produto)
	    {
	       System.out.printf("%d eh perfeito\n", x);
	    }
	    else
	    {
	        System.out.printf("%d nao eh perfeito\n", x);
	    }
	    
	    ler(++i, max, scan);
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int iteracoes;
		
		iteracoes = scan.nextInt();
		
		ler(0, iteracoes, scan);
		
		scan.close();
	}
}
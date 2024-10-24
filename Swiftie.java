import java.util.Scanner;

public class Swiftie
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int posicao = -1;

		String frase = scan.nextLine();
		String frasesemX;
		
		//retira os espacos da string
		frase = frase.replaceAll(" ", "");
		frasesemX = frase.replaceAll(" ", "");
		
		//vai substituir na String todo 'x' por ''
		frasesemX = frasesemX.replaceAll("x", "");

		//essa funcao retorna o numero de caracteres de um string, obs.: espaco tambem conta
		int numero_caracteres = frasesemX.length();

		//System.out.printf("[%s, %s, %d]", frase, frasesemX, numero_caracteres);

		if (numero_caracteres <= 4)
		{
			char caractereDesejado = 'r';

			//indexOf retorna a posicao do caractere, ou -1, caso nao exista
			int indice = frase.indexOf(caractereDesejado);

			if (indice == -1)
			{
				int i = 0;
				
				while (i < 2)
				{
				     ++posicao;
				    
				    if (frase.charAt(posicao) != 'x')
				    {
				        ++i;
				    }
				    
				}
			}
			else
			{
				if (frasesemX.charAt(numero_caracteres - 1) == 'b')
				{
					int i = 0;
				
    				while (i == 0)
    				{
    				    ++posicao;
    				    
        				if (frase.charAt(posicao) == 'b')
        				{
        				    ++i;
        				}
    				}
				}
				else
				{
					int i = 0;
				
    				while (i == 0)
    				{
    				    ++posicao;
    				    
        				if (frase.charAt(posicao) != 'x')
        				{
        				    ++i;
        				}
    				}
				}
			}
		}
		else if (numero_caracteres == 5)
		{
			if (frasesemX.charAt(0) == frasesemX.charAt(1) && frasesemX.charAt(0) == 'y')
			{
				int i = 0;
				
    			while (i == 0)
    			{
    				++posicao;
    				    
        			if (frase.charAt(posicao) != 'x')
        			{
        				++i;
        			}
    			}
			}
			else
			{
                int i = 0;
				
    			while (i <= 1)
    			{
    				++posicao;
    				    
        			if (frase.charAt(posicao) != 'x')
        			{
        				++i;
        			}
    			}
			}
		}
		else
		{
			char caractereDesejado = 'g';
			int quantosG = 0;
			
			int j = 0;
			
			while (j < numero_caracteres)
			{
			    if (frase.charAt(j) == 'g')
        			{
        				++quantosG;
        			}
        		
        		++j;	
			}
			
			int indice = frase.indexOf(caractereDesejado);

			if (indice != -1 && quantosG == 1)
			{
			    int i = 0;
				
    			while (i < 1)
    			{
    				++posicao;
    				    
        			if (frase.charAt(posicao) == 'g')
        			{
        				++i;
        			}
    			}
			}
			else
			{
				posicao = 4;
			}
		}
		
		//System.out.printf("%d", posicao);
		
		switch(posicao)
		{
		    case 0:
		        System.out.printf("corta a");
		        break;
		        
		    case 1:
		        System.out.printf("corta b");
		        break; 
		        
            case 2:
		        System.out.printf("corta c");
		        break;
		        
		    case 3:
		        System.out.printf("corta d");
		        break; 
		        
	        case 4:
	            System.out.printf("corta e");
		        break;
		        
		    case 5:      
		        System.out.printf("corta f");
		        break;
		        
		    default:
		        System.out.printf("corta c");
		}

		scan.close();
	}
}
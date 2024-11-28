import java.util.HashMap;
import java.util.Scanner;

public class Ex011
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        HashMap<String, Double> mapeamento_alunos = new HashMap<>();
        
        mapeamento_alunos.put("Guilherme", 7.3);
        mapeamento_alunos.put("Daniel", 8.5);
        mapeamento_alunos.put("Jeff", 9.7);
        
        System.out.println(mapeamento_alunos);
        
        System.out.print("Vai querer a nota de algum aluno em específico? ");
        String aluno = scan.next();
        
        System.out.println("A nota desse aluno eh -> " + mapeamento_alunos.get(aluno));
    
        scan.close();
    }
}
import java.util.HashMap;

public class Ex010
{
    public static void main(String[] args)
    {
        HashMap<String, Double> mapeamento_alunos = new HashMap<>();
        
        mapeamento_alunos.put("Guilherme", 7.3);
        mapeamento_alunos.put("Daniel", 8.5);
        mapeamento_alunos.put("Jeff", 9.7);
        
        System.out.println(mapeamento_alunos);
    }
}
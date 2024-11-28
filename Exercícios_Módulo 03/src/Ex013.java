import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class Ex013
{
    public static void main(String[] args)
    {
        HashSet<Integer> b1 = new HashSet<>();
        
        b1.add(0);
        b1.add(1);
        b1.add(2);
        
        System.out.println("Coleção 1 -> " + b1);
        
        HashSet<Integer> b2 = new HashSet<>();
        
        b2.add(3);
        b2.add(4);
        b2.add(5);
        
        System.out.println("Coleção 2 -> " + b2);
        
        //Conversão de HashSet para ArrayList
        ArrayList<Integer> c1 = new ArrayList<>(b1);
        ArrayList<Integer> c2 = new ArrayList<>(b2);
        
        //System.out.println(c1);
        
        ArrayList<Integer> resultante = new ArrayList<>();
        
        for (int i = 0; i < 3; ++i)
        {
            resultante.add(c1.get(i) + c2.get(i));
        }

        System.out.println("A coleção resultante eh -> " + resultante);
        
    }
}
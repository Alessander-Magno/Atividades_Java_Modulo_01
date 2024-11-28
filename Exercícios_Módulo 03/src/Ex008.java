import java.util.Scanner;
import java.util.HashSet;

public class Ex008
{
    public static void main(String[] args)
    {
        HashSet<Integer> inteiros = new HashSet<>();
        
        inteiros.add(0);
        inteiros.add(1);
        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        
        System.out.println(inteiros);
    }
}
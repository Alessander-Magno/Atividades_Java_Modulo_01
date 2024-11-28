import java.util.ArrayList;
import java.util.Collections;

public class Ex012
{
    public static void main(String[] args)
    {
        ArrayList <Integer> elementos = new ArrayList<>();
        
        elementos.add(7);
        elementos.add(73);
        elementos.add(37);
        elementos.add(17);
        elementos.add(47);
        
        System.out.println("Lista Embananada = " + elementos);
        
        Collections.sort(elementos);
        
        System.out.println("Lista Ordenada = " + elementos);
    }
}
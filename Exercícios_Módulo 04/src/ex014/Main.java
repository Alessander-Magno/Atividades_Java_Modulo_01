package ex014;
public class Main 
{
    public static void main(String[] args)
    {
        Retangulo r1 = new Retangulo(3, 7);
        Circulo c1 = new Circulo(3.14, 5);

        System.out.println("Área Retângulo = " + r1.calcularArea());
        System.out.println("Área Circulo = " + c1.calcularArea());
    }
}

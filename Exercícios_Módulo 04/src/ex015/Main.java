package ex015;
public class Main 
{
    public static void main(String[] args)
    {
        Retangulo r1 = new Retangulo("berijelante", 3, 7);
        Circulo c1 = new Circulo("oval", 3.14, 5);

        System.out.println("Área Retângulo = " + r1.calcularArea());
        System.out.println("Cor do Retângulo = " + r1.getCor());
        System.out.println("Área Circulo = " + c1.calcularArea());
        System.out.println("Cor do Círculo = " + c1.getCor());

    }
}

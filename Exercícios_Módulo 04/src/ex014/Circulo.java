package ex014;
public class Circulo extends Forma
{
    public double raio;
    public double pi;
    
    public Circulo(double pi, double raio)
    {
        this.raio = raio;
        this.pi = pi;
    }

    @Override
    public double calcularArea()
    {
        return pi * (raio * raio);
    }
}

package ex015;
public class Circulo extends Forma
{
    public double raio;
    public double pi;
    
    public Circulo(String cor, double pi, double raio)
    {
        super(cor);
        this.raio = raio;
        this.pi = pi;
    }

    @Override
    public double calcularArea()
    {
        return pi * (raio * raio);
    }
}

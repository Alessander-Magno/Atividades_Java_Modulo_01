package ex014;
public class Retangulo extends Forma
{
    double base;
    double altura;
    
    public Retangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea()
    {
        return base * altura;
    }    
}

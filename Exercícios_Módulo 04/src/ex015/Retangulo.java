package ex015;
public class Retangulo extends Forma
{
    double base;
    double altura;
    
    public Retangulo(String cor, double base, double altura)
    {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea()
    {
        return base * altura;
    }    
}

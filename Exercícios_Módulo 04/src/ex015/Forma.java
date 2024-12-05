package ex015;
abstract class Forma 
{
    private String cor;

    public Forma(String cor)
    {
        this.cor = cor;
    }
    
    public String getCor()
    {
        return cor;
    }

    public abstract double calcularArea();
}

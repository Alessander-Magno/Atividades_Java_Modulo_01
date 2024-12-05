public class Principal 
{
    public static void main(String[] args)
    {
        Pessoa moreno = new Pessoa("ZecaZurubu", 25);

        Pessoa morenoII = new Pessoa("PauPica", 21, "PauBrasil");

        moreno.exibirInfo();
        morenoII.exibirInfoII();
    }    
}
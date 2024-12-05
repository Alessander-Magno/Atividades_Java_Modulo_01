public class Principal 
{
    public static void main(String[] args)
    {
        Pessoa guts = new Pessoa();

        guts.setNome("Guts");
        guts.setIdade(27);
        guts.setEndereco("Algum lugar do mundo");

        guts.exibirInfo();
    }    
}

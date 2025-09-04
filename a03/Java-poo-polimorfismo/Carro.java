public class Carro extends Veiculo{
    
    private int qtdPortas;

    public Carro(String modelo, String marca, int ano, int qtdPortas){
        super(marca, modelo, ano);
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Quantidade de Portas: " + qtdPortas);
        System.out.println("--------------------------");

    }
}

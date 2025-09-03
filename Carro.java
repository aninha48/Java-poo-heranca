package a02;

public class Carro extends Veiculo{
    private int qtdPortas;

    public Carro(String marca, String modelo, int ano, int qtdPortas){
        super(marca, modelo, ano);
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Quantidade de Portas:" + qtdPortas);
        System.out.println("---------------------------");

    }
    
}
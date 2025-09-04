public class Moto extends Veiculo{
    private int qtdCc;

    public Moto(String modelo, String marca, int ano, int qtdCc){
        super(marca, modelo, ano);
        this.qtdCc = qtdCc;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Cilindradas: " + qtdCc + "cc");
        System.out.println("--------------------------");
    }
}

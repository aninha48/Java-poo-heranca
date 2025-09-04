public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Corsa", "Hatch", 2007, 04);
        Moto m1 = new Moto("Honda","Fan", 2009, 125);
        Carro c2 = new Carro("Fiesta","Fiat",2008,4);

        //Array

        Veiculo[] frota = new Veiculo[3]; //Array da SuperClasse
        frota[0] = c1;
        frota[1] = m1;
        frota[2] = c2;

        // Percorrer a Array[] e chamar mostrarInfo()
        for (Veiculo v : frota){
            v.mostrarInfo();  // Polimorfismo: a mesma chamda do método, se comporta de forma diferente dependendo do objeto
        }
    }
}

package a02;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

// Construtor -> ele cria e permite que possa definir os atributos da Classe
    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método
    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

}

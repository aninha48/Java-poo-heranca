package a01;

public class Produto {
    private String nome;
    private double preco;
    private int qtd;
    
    // Construtor
    public Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    // Métodos

    // Exibir
    public void mostrarProduto() {
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + qtd + " unidades.");
    }

    // Getter
    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQtd(){
        return qtd;
    }

    // Setter
    public String setNome(String nome){
        return this.nome = nome;
    }

    public double setPreco(double preco){
        return this.preco = preco;
    }

    public int setQtd(int qtd){
        return this.qtd = qtd;
    }

}


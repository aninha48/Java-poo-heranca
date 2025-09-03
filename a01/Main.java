package a01;
public class Main {
    public static void main(String[] args) {
       Produto p1 = new Produto("null",0,0);
       Produto p2 = new Produto("Detergente", 2, 33);
       
       
       p1.setNome("Sabão");
       p1.setPreco(4);
       p1.setQtd(45);
       
       p1.mostrarProduto();
       p2.mostrarProduto();

    }
}

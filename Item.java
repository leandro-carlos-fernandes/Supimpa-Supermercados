public class Item {
    private Produto produto; // Item --(1)--> Produto
    private int quantidade;
    private double precoUnitario;

    public Item(Produto produto) {
        this.produto = produto;
    }

    public Item(Produto produto, int qtde, double preco) {
        this.produto = produto;
        this.quantidade = qtde;
        this.precoUnitario = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getValorTotal() {
        return quantidade * precoUnitario;
    }

    @Override
    public String toString() {
        return produto.toString() + "\t" + quantidade + " " + precoUnitario + "" + getValorTotal();
    }
}

import java.util.List;
import java.util.ArrayList;

public class Compra {
    private int nf;
    private Cliente comprador;  // Compra --(1)--> Cliente
    private List<Item> lstItens = new ArrayList<Item>(); // Compra --(n)--> Item

    public void setNf(int nf) {
        this.nf = nf;
    }
    public int getNf() {
        return nf;
    }

    public void adicionar(Produto prod, double preco) {
        Item item = new Item(prod);
        item.setQuantidade(1);
        item.setPrecoUnitario(preco);
        lstItens.add(item);
    }

    public void adicionar(Produto prod, int qtde, double preco) {
        Item item = new Item(prod);
        item.setQuantidade(qtde);
        item.setPrecoUnitario(preco);
        lstItens.add(item);
    }

    public double totalDaCompra() {
        double total = 0;
        for (Item i : lstItens)
            total += i.getValorTotal();
        return total;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }
    public Cliente getComprador() {
        return comprador;
    }

    public String cupomFiscal() {
        String msg = "Supimpa Supermercados Ltda\n";
        msg += "------------------------------------\n";
        msg += "CPF: " + comprador.getCpf() + "\n";
        msg += "Cliente: " + comprador.getNome() + "\n";
        msg += "------------------------------------\n";
        double total = 0;
        for(Item i : lstItens) {
            msg += i.toString() + "\n";
            total += i.getValorTotal();
        }
        msg += "------------------------------------\n";
        msg += "Total da compra:   " + total + "\n";
        msg += "------------------------------------\n";
        return msg;
    }
}

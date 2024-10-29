public class Supermercado {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.setNome("Consumidor final");
        
        Produto prod = new Produto();
        prod.setCodigo(12);
        prod.setDescricao("Coca-cola");
        
        Compra compra = new Compra();
        compra.setComprador(cli);
        compra.adicionar(prod, 2, 5.3);

        System.out.println(compra.cupomFiscal());
    }
}
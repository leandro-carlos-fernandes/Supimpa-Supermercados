public class Produto {
    private int codigo;
    private String descricao;
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String toString() {
        return codigo + "  " + descricao;
    }
}

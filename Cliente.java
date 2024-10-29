class Cliente {
    private String nome;
    private String cpf;
    
    public Cliente() {
        nome = "não informado";
        cpf = "000.000.000-00";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
}
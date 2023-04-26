public abstract class Roupa implements Produto {
    private String nome;
    private String marca;
    protected float preco;
    private String tamanho;
    private String cor;

    public Roupa(String nome, String marca, float preco, String tamanho, String cor) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void calcularPrecoFinal(float acrescimo){};
}

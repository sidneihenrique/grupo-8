public class Calca extends Roupa{
    public Calca(String nome, String marca, float preco, String tamanho, String cor) {
        super(nome, marca, preco, tamanho, cor);
    }

    @Override
    public void calcularPrecoFinal(float acrescimo){
        acrescimo = acrescimo * 0.15f;
        this.preco -= acrescimo;
    }
}

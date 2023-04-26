public class Camisa extends Roupa{
    public Camisa(String nome, String marca, float preco, String tamanho, String cor) {
        super(nome, marca, preco, tamanho, cor);
    }

    @Override
    public void calcularPrecoFinal(float acrescimo){
        acrescimo = acrescimo * 0.1f;
        this.preco -= acrescimo;
    }
}

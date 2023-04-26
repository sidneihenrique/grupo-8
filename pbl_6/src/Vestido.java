public class Vestido extends Roupa{
    public Vestido(String nome, String marca, float preco, String tamanho, String cor) {
        super(nome, marca, preco, tamanho, cor);
    }

    @Override
    public void calcularPrecoFinal(float acrescimo){
        acrescimo = acrescimo * 0.2f;
        this.preco -= acrescimo;
    }
}

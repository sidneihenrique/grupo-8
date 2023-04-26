public class Pessoa extends Conta{
    private Conta conta;
    public Pessoa(Conta conta){
        this.conta = conta;
    }
    public void depositar(float valor) {
        conta.depositar(valor);
    }
    public Conta getConta(){
        return conta;
    }

}

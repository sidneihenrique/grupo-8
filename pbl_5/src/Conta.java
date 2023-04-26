public class Conta {
    private float saldo;
    public void depositar(float valor){
        saldo += valor;
    }
    public void mostrarSaldo(){
        System.out.println("Saldo Atual " + saldo);
    }
    public float getSaldo() {
        return saldo;
    }
}
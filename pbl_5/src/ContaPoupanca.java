public class ContaPoupanca extends Conta{
    @Override
    public void mostrarSaldo(){
        float saldoRendimento = getSaldo() * 1.005f;
        System.out.println("O saldo com rendimento é de: " + saldoRendimento);

    }

}

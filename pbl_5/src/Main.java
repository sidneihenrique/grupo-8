public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        ContaPoupanca conta2 = new ContaPoupanca();

        Pessoa pessoa1 = new Pessoa(conta1);
        Pessoa pessoa2 = new Pessoa(conta2);

        System.out.println("Saldo atual da pessoa 1 (conta corrente): ");
        pessoa1.getConta().mostrarSaldo();

        System.out.println("Saldo atual da pessoa 2 (conta poupança): ");
        pessoa2.getConta().mostrarSaldo();

        pessoa1.depositar(1500);
        pessoa2.depositar(750);

        System.out.println("Saldo atual da pessoa 1 (conta corrente) após o depósito: ");
        pessoa1.getConta().mostrarSaldo();

        System.out.println("Saldo atual da pessoa 2 (conta poupança) após o depósito: ");
        pessoa2.getConta().mostrarSaldo();
    }
}
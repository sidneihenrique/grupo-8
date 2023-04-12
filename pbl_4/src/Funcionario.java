public class Funcionario extends Pessoa {
    private int codigoFuncionario;
    private Gerente gerenteResponsavel;

    public Funcionario(String nome, int idade, String cpf, String sexo, int codigoFuncionario, Gerente gerenteResponsavel) {
        super(nome, idade, cpf, sexo);
        this.codigoFuncionario = codigoFuncionario;
        this.gerenteResponsavel = gerenteResponsavel;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public Gerente getGerenteResponsavel() {
        return gerenteResponsavel;
    }

    public void setGerenteResponsavel(Gerente gerenteResponsavel) {
        this.gerenteResponsavel = gerenteResponsavel;
    }
}

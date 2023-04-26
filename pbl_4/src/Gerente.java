public class Gerente extends Pessoa{
    private int codigo;
    private Departamento departamentoResponsavel;

    public Gerente(String nome, int idade, String cpf, String sexo, int codigo, Departamento departamentoResponsavel) {
        super(nome, idade, cpf, sexo);
        this.codigo = codigo;
        this.departamentoResponsavel = departamentoResponsavel;
    }

    public int getCodigo() {
        return codigo;
    }

    public Departamento getDepartamentoResponsavel() {
        return departamentoResponsavel;
    }

    public void setDepartamentoResponsavel(Departamento departamentoResponsavel) {
        this.departamentoResponsavel = departamentoResponsavel;
    }
}

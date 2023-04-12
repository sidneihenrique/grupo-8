public class Departamento {
    private int codigoDepartamento;
    private String nomeDepartamento;
    private Gerente gerenteDepartamento;

    public Departamento(int codigoDepartamento, String nomeDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
        this.nomeDepartamento = nomeDepartamento;
    }

    public void setGerenteDepartamento(Gerente gerenteDepartamento) {
        this.gerenteDepartamento = gerenteDepartamento;
    }

    public int getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public Gerente getGerenteDepartamento() {
        return gerenteDepartamento;
    }
}
